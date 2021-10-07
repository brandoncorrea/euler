(ns euler.util.math)

(defn sum [nums] (reduce + nums))
(defn product [nums] (reduce * nums))
(defn square [n] (* n n))
(defn sum-squares [& nums]
  (sum (map square (flatten nums))))
(def square-sum (comp square sum))

(defn divisible-by? [num div]
  (and (not= 0 div)
       (= 0 (rem num div))))

(defn abs [n]
  (if (< n 0)
    (* -1 n)
    n))
