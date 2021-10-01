(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"
  (it "Solves #3"
    (should= 1 (euler-3 -1))
    (should= 0 (euler-3 0))
    (should= 1 (euler-3 1))
    (should= 2 (euler-3 2))
    (should= 13 (euler-3 13))
    (should= 5 (euler-3 30))
    (should= 37 (euler-3 111))
    (should= 6857 (euler-3 -600851475143))
    (should= 6857 (euler-3 600851475143))))
