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

