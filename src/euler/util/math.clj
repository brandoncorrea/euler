(ns euler.util.math)

(defn sum [nums] (reduce + nums))
(defn product [nums] (reduce * nums))
(defn square [n] (* n n))

(defn divisible-by? [num div]
  (and (not= 0 div)
       (= 0 (mod num div))))

(defn abs [n]
  (if (< n 0)
    (* -1 n)
    n))
