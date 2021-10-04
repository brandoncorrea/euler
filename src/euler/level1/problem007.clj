(ns euler.level1.problem007)

(defn- divisible-by? [num div]
  (= 0 (mod num div)))

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
