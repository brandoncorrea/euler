(ns euler.level1.problem007
  (:use [euler.util.sequences :only [primes]]))

(defn euler-7 [n]
  (nth primes (dec n)))
