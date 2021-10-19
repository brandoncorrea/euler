(ns euler.level1.problem012
  (:use [euler.util.math :only [divisible-by? sum]]
        [euler.util.sequences :only [prime-factors]]))

; combo-count implements a generic function to find the
; number of unique combinations given any set of values,
; where N represents the number that a given value repeats itself:
; F(Nn...Nm) = Nn(F(Nn+1...Nm) + 1) + F(Nn+1...Nm)
(defn combo-count [group-counts]
  (if (empty? group-counts)
    0
    ; rest-count represents F(Nn+1...Nm)
    (let [rest-count (combo-count (rest group-counts))]
      (+ (* (first group-counts)
            (inc rest-count))
         rest-count))))

(defn- count-values [[_ vals]] (count vals))
(defn- count-groups [fn values] (map count-values (group-by fn values)))
(defn- count-prime-factor-groups [n] (count-groups identity (prime-factors n)))

(defn count-factors [n]
  (if (= n 1)
    1
    (let [prime-counts (count-prime-factor-groups n)]
      (inc (combo-count prime-counts)))))

(defn triangle-numbers [prev n]
  (let [next (+ prev n)]
    (cons next
          (lazy-seq (triangle-numbers next (inc n))))))

(defn euler-12 [n]
  (->> (triangle-numbers 1 2)
       (filter #(< n (count-factors %)))
       first))
