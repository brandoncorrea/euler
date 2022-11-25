(ns euler.level1.problem012-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem012 :refer :all]))

; https://projecteuler.net/problem=12

(describe "Euler Problem #12"

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

  (it "Solves #12"
    (should= 3 (euler-12 1))
    (should= 6 (euler-12 2))
    (should= 28 (euler-12 5))
    (should= 76576500 (euler-12 500))))
