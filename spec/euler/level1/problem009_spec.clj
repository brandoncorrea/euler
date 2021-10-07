(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(describe "Euler Problem #9"

  (it "triplet?"
    (should= false (triplet? 0 0 0))
    (should= false (triplet? 1 2 4))
    (should= false (triplet? 2 2 4))
    (should= true (triplet? 3 4 5))
    (should= false (triplet? 4 3 5))
    (should= false (triplet? 0 2 2))
    (should= false (triplet? 4 5 6)))

  (it "triplets"
    (should= [] (triplets 0))
    (should= [[3 4 5]] (triplets 6))
    (should= [[3 4 5] [6 8 10] [5 12 13] [9 12 15]] (triplets 15)))

  (it "calculate-c"
    (should= 5 (calculate-c 3 4))
    (should= 10 (calculate-c 6 8))
    (should= 13 (calculate-c 5 12)))

  (it "Solves #9"
    (should= 60 (euler-9 12))
    (should= 780 (euler-9 30))
    (should= 1620 (euler-9 36))
    ;(should= 31875000 (euler-9 1000))
    ))
