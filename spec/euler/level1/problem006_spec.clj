(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (it "square-sum"
    (should= 0 (square-sum (range 0)))
    (should= 0 (square-sum (range 1)))
    (should= 1 (square-sum (range 2)))
    (should= 5 (square-sum (range 3)))
    (should= 385 (square-sum (range 11))))

  (it "sum-square"
    (should= 0 (sum-square (range 0)))
    (should= 0 (sum-square (range 1)))
    (should= 1 (sum-square (range 2)))
    (should= 9 (sum-square (range 3)))
    (should= 36 (sum-square (range 4)))
    (should= 3025 (sum-square (range 11))))

  (it "Solves #6"
    (should= 2640 (euler-6 10))
    (should= 25164150 (euler-6 100))))
