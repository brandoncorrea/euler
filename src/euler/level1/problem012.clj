(ns euler.level1.problem012
  (:use [euler.util.math :only [divisible-by? sum]]
        [euler.util.sequences :only [prime-factors triangle-numbers]]
        [euler.util.combinatorics]))

(defn count-factors [n]
  (-> n prime-factors count-combinations inc))

(defn- num-factors-gt? [limit n]
  (< limit (count-factors n)))

(defn euler-12 [n]
  (->> (triangle-numbers)
       (filter (partial num-factors-gt? n))
       first))
