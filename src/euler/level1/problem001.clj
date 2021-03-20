(ns euler.level1.problem001)

; True if numerator is divisible by denominator
(defn divisible-by [numerator denominator]
  (= 0 (mod numerator denominator)))

; True if value is divisible by an item in divisors
(defn multiple-of [value divisors]
  (some true?
    (map
      #(divisible-by value %)
      divisors)))

; Returns all values less than maxValue
; That are divisible by something in divisors
(defn get-multiples [maxValue divisors]
  (filter
    #(multiple-of % divisors)
    (range maxValue)))

; Returns the sum of all values less than maxValues
; that are divisible by something in divisors
(defn sum-of-multiples [maxValue divisors]
  (reduce + (get-multiples maxValue divisors)))

(defn euler-1 [n]
  (sum-of-multiples n [3 5]))

