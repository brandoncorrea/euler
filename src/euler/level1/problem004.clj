(ns euler.level1.problem004)

(defn- split-num [n]
  (clojure.string/split (str n) #""))

(defn palindrome? [n]
  (let [chars (split-num n)]
    (= chars (reverse chars))))

(defn- max-palindrome [old new]
  (if (and (palindrome? new) (> new old))
    new old))

(defn max-palindrome-of-multiples-between [min max]
  (loop [operand-1 max
         operand-2 max
         cur-pali -1]
    (let [product (* operand-1 operand-2)]
      (cond
        (< operand-1 min)
          cur-pali
        (< operand-2 min)
          (recur (dec operand-1) (dec operand-1) cur-pali)
        :else
          (recur operand-1 (dec operand-2) (max-palindrome cur-pali product))))))

(defn euler-4 [n]
  (let [min-multiplier (int (Math/pow 10 (dec n)))
        max-multiplier (int (Math/pow 10 n))]
    (max-palindrome-of-multiples-between min-multiplier max-multiplier)))
