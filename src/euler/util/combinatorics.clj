(ns euler.util.combinatorics)

; The math part of the count algorithm:
; F() = 0
; F(A, B) = A(B + 1) + B
(defn- combos-of-two
  ([] 0)
  ([A B] (+ (* A (inc B)) B)))

(defn- frequency-per-value [values]
  (map second (frequencies values)))

(defn count-combinations [values]
  (reduce combos-of-two (frequency-per-value values)))
