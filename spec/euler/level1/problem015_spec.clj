(ns euler.level1.problem015-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem015 :refer :all]))

; https://projecteuler.net/problem=15

(describe "Euler Problem #15"
  (it "Solves #15"
    (should= 2 (euler-15 1))
    (should= 6 (euler-15 2))
    (should= 20 (euler-15 3))
    (should= 137846528820 (euler-15 20))))
