(ns euler.util.sequences
  (:use [euler.util.math :only [divisible-by?]]))

(defn- lazy-fibs [a b]
  (lazy-seq (cons a (lazy-fibs b (+ a b)))))

(def fibs (lazy-fibs 0 1))

(defn- next-factor [remainder div]
  (loop [div div]
    (if (divisible-by? remainder div)
        div
        (recur (inc div)))))

(defn prime-factors
  ([remainder]
   (cons 1 (prime-factors remainder 2)))
  ([remainder div]
   (if (> div remainder)
     []
     (let [factor (next-factor remainder div)]
       (lazy-seq (cons factor
                       (prime-factors (/ remainder factor) div)))))))

(defn- next-prime [seeds cur]
  (loop [n cur]
    (if (first (filter #(= 0 (rem n %)) seeds))
      (recur (+ n 2))
      n)))

(defn- lazy-primes [seeds cur]
  (lazy-seq
    (let [prime (next-prime seeds cur)]
      (cons prime
            (lazy-primes (conj seeds prime) (+ prime 2))))))

(def primes (cons 2 (lazy-primes [2] 3)))
