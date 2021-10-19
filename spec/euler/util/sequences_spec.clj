(ns euler.util.sequences_spec
  (:use [speclj.core]
        [euler.util.sequences]))

(describe "fibs"
  (it "Returns the correct order of terms"
    (should= 0 (first fibs))
    (should= 1 (second fibs))
    (should= 1 (nth fibs 1))
    (should= 2 (nth fibs 3))
    (should= 3 (nth fibs 4)))
  (it "Returns list of first 10 terms"
    (should= [0 1 1 2 3 5 8 13 21 34] (take 10 fibs))))

(describe "prime-factors"
  (it "One has no prime factors"
    (should= [] (prime-factors 1)))
  (it "Two is a factor of two"
    (should= [2] (prime-factors 2)))
  (it "Three is a prime factor of three"
    (should= [3] (prime-factors 3)))
  (it "Sixty has factors: 2 2 3 5"
    (should= [2 2 3 5] (prime-factors 60)))
  (it "Sixty has factors: 2 2 3 5"
    (should= [2 2 2 3 3 5 7] (prime-factors 2520)))
  )

(describe "primes"
  (it "Returns sequence of primes"
    (should= 2 (first primes))
    (should= 3 (second primes))
    (should= 5 (nth primes 2))
    (should= 7 (nth primes 3))
    (should= 11 (nth primes 4))))
