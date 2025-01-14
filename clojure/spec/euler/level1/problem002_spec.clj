(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "even-fibs"
    (should= [2] (take 1 (even-fibs)))
    (should= [2 8] (take 2 (even-fibs)))
    (should= [2 8 34] (take 3 (even-fibs))))

  (it "even-fibs-less-than"
    (should= [] (even-fibs-less-than 0))
    (should= [] (even-fibs-less-than 1))
    (should= [] (even-fibs-less-than 2))
    (should= [2] (even-fibs-less-than 3))
    (should= [2] (even-fibs-less-than 4))
    (should= [2] (even-fibs-less-than 5))
    (should= [2] (even-fibs-less-than 6))
    (should= [2] (even-fibs-less-than 7))
    (should= [2] (even-fibs-less-than 8))
    (should= [2 8] (even-fibs-less-than 9))
    (should= [2 8 34] (even-fibs-less-than 100)))

  (it "Solves #2"
    (should= 2 (euler-2 2))
    (should= 10 (euler-2 8))
    (should= 4613732 (euler-2 4000000))))

