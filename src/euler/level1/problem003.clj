(ns euler.level1.problem003)

; Returns true if the numerator is
; evenly divisible by the denominator
(defn divisible-by [numerator denominator]
    (= 0 (mod numerator denominator)))

; Returns true if x is prime
(defn prime? [x]
  (every? false?
    (map
      #(divisible-by x %)
      (vec (range 2 (inc (/ x 2)))))))

; Returns true if divisor is a prime factor of num
(defn prime-factor-of [divisor num]
  (and
    (divisible-by num divisor)
    (prime? divisor)))

; Returns true if num1 or num2 is greater than limit
(defn limit-reached [limit num1 num2]
  (or
    (> num1 limit)
    (> num2 limit)))

; Returns the maximum prime factor of num
(defn max-prime-factor-of [num]
  (loop
    [remainder num
     factor 2
     maxFactor num]
    (cond
      (limit-reached remainder factor maxFactor)
        maxFactor
      (prime-factor-of factor remainder)
        (recur (/ remainder factor) factor factor)
      :else
        (recur remainder (inc factor) maxFactor))))

(defn euler-3 [n]
  (max-prime-factor-of n))
