(ns euler.level1.problem006
  (:use [euler.util.math :only [square-sum sum-squares]]))

(defn euler-6 [n]
  (let [naturals (take n (drop 1 (range)))]
    (- (square-sum naturals) (sum-squares naturals))))
