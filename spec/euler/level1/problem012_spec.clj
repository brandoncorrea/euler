(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

; https://projecteuler.net/problem=12

(describe "Euler Problem #12"

  (it "combo-count"
    (should= 0 (combo-count []))
    (should= 1 (combo-count [1]))
    (should= 3 (combo-count [1 1]))
    (should= 7 (combo-count [1 1 1]))
    (should= 5 (combo-count [1 2])))

  (it "count-factors"
    (should= 1 (count-factors 1))
    (should= 2 (count-factors 2))
    (should= 2 (count-factors 3))
    (should= 3 (count-factors 4))
    (should= 2 (count-factors 5))
    (should= 4 (count-factors 6))
    (should= 2 (count-factors 7))
    (should= 4 (count-factors 8))
    (should= 3 (count-factors 9))
    (should= 4 (count-factors 10))
    (should= 2 (count-factors 11))
    (should= 48 (count-factors 2520)))

  (it "triangle-numbers"
    (should= [] (take 0 (triangle-numbers 0 1)))
    (should= [1] (take 1 (triangle-numbers 0 1)))
    (should= [1 3] (take 2 (triangle-numbers 0 1)))
    (should= [1 3 6] (take 3 (triangle-numbers 0 1))))

  (it "Solves #12"
    (should= 3 (euler-12 1))
    (should= 6 (euler-12 2))
    (should= 28 (euler-12 5))
    (should= 76576500 (euler-12 500))))
