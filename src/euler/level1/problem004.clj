(ns euler.level1.problem004)

; Returns the square of num
(defn square [num]
  (* num num))

; Returns the exponential operation, num ^ power
(defn exp [num power]
  (reduce * (repeat power num)))

; Converts the value to a string
; and returns the char array
; of the resulting string
(defn char-seq [value]
  (seq (char-array (str value))))

; Returns true if num is palindromic
(defn is-palindromic [num]
  (= (char-seq num) (reverse (char-seq num))))

; The minimum value of the product operand
; being num-digits in length
(defn get-min-operand [num-digits]
  (exp 10 (dec num-digits)))

; The maximum value of the product operand
; being num-digits in length
(defn get-max-operand [num-digits]
  (dec (exp 10 num-digits)))

; Returns the maximum palindrome
; that can be made from the product of
; two numbers between min-operand and max-operand
(defn max-palindrome [min-operand max-operand]
  (loop
    [primary max-operand
     secondary max-operand
     max -1]
    (cond
      ; Base case
      (or
        (< primary min-operand)
        (< (square primary) max))
      max
      ; Update primary
      (< secondary min-operand)
        (recur (dec primary) max-operand max)
      ; Update max, go to next primary
      (and
        (is-palindromic (* primary secondary))
        (> (* primary secondary) max))
        (recur (dec primary) max-operand (* primary secondary))
      ; Update secondary
      :else
        (recur primary (dec secondary) max)
      ))
  )

; Returns the largest palindrome
; made from the product of two numbers,
; both having n digits
(defn euler-4 [n]
  (max-palindrome
    (get-min-operand n)
    (get-max-operand n)))
