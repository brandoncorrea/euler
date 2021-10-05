(ns euler.level1.problem006
  (:use [euler.util.math :only [sum square]]))

(defn square-sum [nums]
  (sum (map square nums)))

(def sum-square
  (comp square sum))

(defn euler-6 [n]
  (let [naturals (range 1 (inc n))]
    (- (sum-square naturals) (square-sum naturals))))
