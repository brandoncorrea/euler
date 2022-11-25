(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

  (it "Solves #10"
    (should= 0 (euler-10 2))
    (should= 2 (euler-10 3))
    (should= 5 (euler-10 4))
    (should= 10 (euler-10 6))
    (should= 10 (euler-10 7))
    (should= 17 (euler-10 8))
    (should= 17 (euler-10 9))
    (should= 17 (euler-10 10))
    ;(should= 454396537 (euler-10 100000))
    ; Down to 12 minutes...
    ;(should= 142913828922 (euler-10 2000000))
    ))
