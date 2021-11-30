(ns euler.level1.problem014-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem014 :refer :all]))

; https://projecteuler.net/problem=14

(describe "Euler Problem #14"

  (it "count-links"
    (should= 1 (count-links 1 {}))
    (should= 2 (count-links 2 {}))
    (should= 8 (count-links 3 {}))
    (should= 3 (count-links 4 {}))
    (should= 2 (count-links 7 {22 1}))
    (should= 17 (count-links 7 {22 16})))

  (it "Solves #14"
    (should= 1 (euler-14 1))
    (should= 2 (euler-14 2))
    (should= 3 (euler-14 3))
    (should= 3 (euler-14 4))
    (should= 3 (euler-14 5))
    (should= 6 (euler-14 6))
    (should= 7 (euler-14 7))
    (should= 7 (euler-14 8))
    (should= 2463 (euler-14 2500))
    (should= 837799 (euler-14 1000000))))
