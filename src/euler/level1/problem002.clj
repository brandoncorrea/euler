(ns euler.level1.problem002)

; Google search revealed a simplified way of
; generating the fibonacci sequence
; 
; However, this doesn't seem to work well
; with the filter function because it will
; filter out values to infinity.
(defn fib []
  (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))

; Returns the fibonacci sequence where
; the term values are less than maxValue
(defn fibonacci [maxValue]
  (loop
    [prev-2 0
     prev-1 1
     terms '(0 1)]
    (if (< maxValue (+ prev-1 prev-2))
      terms
      (recur
        prev-1                         ; prev-2
        (+ prev-1 prev-2)              ; prev-1
        (conj terms (+ prev-1 prev-2)) ; terms
      ))))

; Returns the fibonacci sequence where
; term values are both even and less than maxValue
(defn get-even-fibonacci [maxValue]
  (filter even? (fibonacci maxValue)))

; Returns the sum of all even numbered
; terms of the fibonacci sequence,
; where the terms are less than n
(defn euler-2 [n]
  (reduce + (get-even-fibonacci n)))
