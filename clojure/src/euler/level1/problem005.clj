(ns euler.level1.problem005
  (:use [euler.util.math :only [divisible-by?]]
        [euler.util.sequences :only [prime-factors]]))

(defn remove-index [coll index]
  ; subvec doesn't like lazy-seq
  (let [coll-vec (vec coll)]
    (if (get coll-vec index)
      (concat
        (subvec coll-vec 0 index)
        (subvec coll-vec (inc index)))
      coll-vec)))

(defn remove-item [coll element]
  (remove-index coll (.indexOf coll element)))

(defn vector-diff [v1 v2]
  (loop [left v1
         right v2
         diff []]
    (if-let [factor (first left)]
      (if (.contains right factor)
        (recur (rest left) (remove-item right factor) diff)
        (recur (rest left) right (conj diff factor)))
      diff)))

(defn euler-5 [n]
  (loop [divisor n
         product n]
    (if (<= divisor 1)
      product
      (let [cur-factors (prime-factors divisor)
            product-factors (prime-factors product)
            diff-factors (vector-diff cur-factors product-factors)]
          (recur (dec divisor) (* product (reduce * diff-factors)))))))
