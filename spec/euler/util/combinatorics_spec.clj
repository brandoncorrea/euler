(ns euler.util.combinatorics-spec
  (:use [speclj.core]
        [euler.util.combinatorics]))

(describe "count-combinations"
  (it "Empty list results in 0"
    (should= 0 (count-combinations [])))
  (it "One item results in one combination"
    (should= 1 (count-combinations [1])))
  (it "Two of the same item results in two"
    (should= 2 (count-combinations [1 1])))
  (it "Two different items results in three"
    (should= 3 (count-combinations [1 2])))
  (it "Two of one item and one of another results in five"
    (should= 5 (count-combinations [1 1 2])))
  (it "Two of two items results in eight"
    (should= 8 (count-combinations [1 1 2 2])))
  (it "Three of three items results in sixty-three"
    (should= 63 (count-combinations [1 1 1 2 2 2 3 3 3])))
  (it "Six of one item and one of two items results in twenty-seven"
    (should= 27 (count-combinations [1 1 1 1 1 1 2 3]))))
