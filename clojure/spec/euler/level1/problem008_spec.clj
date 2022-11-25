(ns euler.level1.problem008-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem008 :refer :all]))

; https://projecteuler.net/problem=8

(describe "Euler Problem #8"

  (it "->intvec"
    (should= [0] (->intvec "0"))
    (should= [1] (->intvec "1"))
    (should= [1 2] (->intvec "12"))
    (should= [1 2 3] (->intvec "123")))

  (it "part-ints"
    (should= [[1]] (part-ints 1 "1"))
    (should= [[1] [2]] (part-ints 1 "12"))
    (should= [[1 2] [2 3]] (part-ints 2 "123"))
    (should= [[1 2 3] [2 3 4] [3 4 5]] (part-ints 3 "12345")))

  (it "Solves #8"
    (should= 9 (euler-8 1))
    (should= 81 (euler-8 2))
    (should= 648 (euler-8 3))
    (should= 5832 (euler-8 4))
    (should= 23514624000 (euler-8 13))))
