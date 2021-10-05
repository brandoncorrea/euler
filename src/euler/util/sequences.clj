(ns euler.util.sequences
  (:use [euler.util.math :only [divisible-by?]]))

(defn- lazy-fibs [a b]
  (lazy-seq (cons a (lazy-fibs b (+ a b)))))

(def fibs (lazy-fibs 0 1))

(defn- next-prime [remainder div]
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
     (let [factor (next-prime remainder div)]
       (lazy-seq (cons factor
                       (prime-factors (/ remainder factor) div)))))))
