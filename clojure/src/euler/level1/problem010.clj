(ns euler.level1.problem010
  (:use [euler.util.math :only [sum]]
        [euler.util.sequences :only [primes]]))

(defn euler-10 [n]
  (sum (take-while #(< % n) primes)))
