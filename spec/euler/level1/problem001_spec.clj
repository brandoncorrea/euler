(ns euler.level1.problem001-spec
    (:use
      [speclj.core]
      [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "divisible by 3 or 5?"
    (should= true (divisible-by-3-or-5? 0))
    (should= false (divisible-by-3-or-5? 1))
    (should= false (divisible-by-3-or-5? 2))
    (should= true (divisible-by-3-or-5? 3))
    (should= false (divisible-by-3-or-5? 4))
    (should= true (divisible-by-3-or-5? 5))
    (should= true (divisible-by-3-or-5? 6))
    (should= false (divisible-by-3-or-5? 7))
    (should= false (divisible-by-3-or-5? 8))
    (should= true (divisible-by-3-or-5? 9))
    (should= true (divisible-by-3-or-5? 10)))

  (it "finds desired numbers less than n"
    (should= [] (desired-numbers-less-than 0))
    (should= [3] (desired-numbers-less-than 4))
    (should= [3] (desired-numbers-less-than 5))
    (should= [3 5] (desired-numbers-less-than 6))
    (should= [3 5 6 9] (desired-numbers-less-than 10)))

  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 233168 (euler-1 1000))))
