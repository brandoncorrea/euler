(ns euler.level1.problem005)

(defn divisible-by? [num div]
  (and (not= 0 div)
       (= 0 (mod num div))))

(defn- out-of-range? [coll index]
  (or (< index 0)
      (>= index (count coll))))

(defn remove-index [coll index]
  (let [; subvec doesn't like lazy-seq
        coll-vec (vec coll)]
    (if (out-of-range? coll-vec index)
      coll-vec
      (concat
        (subvec coll-vec 0 index)
        (subvec coll-vec (inc index))))))

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

(defn factors-of [n]
  (loop [remainder n
         divisor 2
         factors [1]]
    (cond
      (> divisor remainder)
        factors
      (divisible-by? remainder divisor)
        (recur (/ remainder divisor) divisor (conj factors divisor))
      :else
        (recur remainder (inc divisor) factors))))

(defn euler-5 [n]
  (loop [divisor n
         product n]
    (if (<= divisor 1)
      product
      (let [cur-factors (factors-of divisor)
            product-factors (factors-of product)
            diff-factors (vector-diff cur-factors product-factors)]
          (recur (dec divisor) (* product (reduce * diff-factors)))))))
