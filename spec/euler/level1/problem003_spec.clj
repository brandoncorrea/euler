(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (it "Solves #3"
      (should= 6857 (euler-3 600851475143)))
  )

