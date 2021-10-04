(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "Solves #7"
    (should= 2 (euler-7 1))
    (should= 3 (euler-7 2))
    (should= 5 (euler-7 3))
    (should= 7 (euler-7 4))
    (should= 11 (euler-7 5))
    (should= 13 (euler-7 6))
    (should= 104743 (euler-7 10001)))
  )
