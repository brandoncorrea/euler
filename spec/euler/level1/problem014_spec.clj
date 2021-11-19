(ns euler.level1.problem014-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem014 :refer :all]))

; https://projecteuler.net/problem=14

(describe "Euler Problem #14"

  (it "chain"
    (should= [1] (chain 1))
    (should= [2 1] (chain 2))
    (should= [3 10 5 16 8 4 2 1] (chain 3))
    (should= [4 2 1] (chain 4))
    (should= [5 16 8 4 2 1] (chain 5))
    (should= [6 3 10 5 16 8 4 2 1] (chain 6))
    (should= [7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1] (chain 7))
    (should= [8 4 2 1] (chain 8))
    (should= [13 40 20 10 5 16 8 4 2 1] (chain 13)))

  (it "Solves #14"
    (should= 1 (euler-14 1))
    (should= 2 (euler-14 2))
    (should= 3 (euler-14 3))
    (should= 3 (euler-14 4))
    (should= 3 (euler-14 5))
    (should= 6 (euler-14 6))
    (should= 7 (euler-14 7))
    (should= 7 (euler-14 8))
    (should= 837799 (euler-14 1000000))
    )

  )
