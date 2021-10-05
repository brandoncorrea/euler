(ns euler.level1.problem007
  (:use [euler.util.math :only [divisible-by?]]))

(defn euler-7 [n]
  (loop [num 2
         primes []]
    (cond
      (>= (count primes) n)
        (last primes)
      (some #(divisible-by? num %) primes)
        (recur (inc num) primes)
      :else
        (recur (inc num) (conj primes num)))))
