(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "palindrome?"
    (should= true (palindrome? 0))
    (should= true (palindrome? 1))
    (should= true (palindrome? 5))
    (should= false (palindrome? 10))
    (should= true (palindrome? 11))
    (should= true (palindrome? 22))
    (should= false (palindrome? 23))
    (should= false (palindrome? 100))
    (should= true (palindrome? 101)))

  (it "max-palindrome-of-multiples-between"
    (should= 0 (max-palindrome-of-multiples-between 0 0))
    (should= 1 (max-palindrome-of-multiples-between 0 1))
    (should= 4 (max-palindrome-of-multiples-between 0 2))
    (should= 121 (max-palindrome-of-multiples-between 0 12))
    (should= 9009 (max-palindrome-of-multiples-between 10 99)))

  (it "Solves #4"
    (should= 9 (euler-4 1))
    (should= 9009 (euler-4 2))
    (should= 906609 (euler-4 3))))

