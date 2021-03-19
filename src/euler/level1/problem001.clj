(ns euler.level1.problem001)

; True if numerator is divisible by denominator
(defn divisible-by [numerator denominator]
  (= 0 (mod numerator denominator)))

; True if value is divisible by an item in multiples
(defn multiple-of [value multiples]
  (some true?
    (map
      #(divisible-by value %)
      multiples)))

; Returns all values less than maxValue
; Thar are divisible by something in multiples
(defn get-multiples [maxValue multiples]
  (filter
    #(multiple-of % multiples)
    (range maxValue)))

; Returns the sum of all values less than maxValues
; that are divisible by multiples
(defn sum-of-multiples [maxValue multiples]
  (reduce + (get-multiples maxValue multiples)))

(defn euler-1 [n]
  (sum-of-multiples n [3 5]))

