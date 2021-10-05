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
  (it "One is the only factor of one"
    (should= [1] (prime-factors 1)))
  (it "One and two are factors of two"
    (should= [1 2] (prime-factors 2)))
  (it "One and three are factors of three"
    (should= [1 3] (prime-factors 3)))
  (it "Sixty has factors: 1 2 2 3 5"
    (should= [1 2 2 3 5] (prime-factors 60)))
  )