(ns euler.level1.problem003
  (:use [euler.util.math :only [divisible-by? abs]]))

(defn euler-3 [n]
  (loop [num (abs n)
         div 2]
    (cond
      (>= div num)
        num
      (divisible-by? num div)
        (recur (/ num div) div)
      :else
        (recur num (inc div)))))
