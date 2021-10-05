(ns euler.util.math)

(defn divisible-by? [num div]
  (and (not= 0 div)
       (= 0 (mod num div))))

(defn sum [nums]
  (reduce + nums))
