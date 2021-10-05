(ns euler.level1.problem002
  (:use [euler.util.math :only [sum]]
        [euler.util.sequences :only [fibs]]))

(defn even-fibs []
  (filter even? (rest fibs)))

(defn even-fibs-less-than [n]
  (take-while #(< % n) (even-fibs)))

(def euler-2
  (comp sum even-fibs-less-than inc))
