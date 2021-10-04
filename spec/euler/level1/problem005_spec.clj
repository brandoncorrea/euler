(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "divisible-by?"
    (should= true (divisible-by? 0 1))
    (should= true (divisible-by? 0 2))
    (should= true (divisible-by? 4 2))
    (should= false (divisible-by? 1 0))
    (should= false (divisible-by? 1 2)))

  (it "factors-of"
    (should= [1] (factors-of 1))
    (should= [1 2] (factors-of 2))
    (should= [1 3] (factors-of 3))
    (should= [1 2 2] (factors-of 4))
    (should= [1 5] (factors-of 5))
    (should= [1 2 3] (factors-of 6))
    (should= [1 2 2 5] (factors-of 20))
    (should= [1 2 2 3 5] (factors-of 60))
    (should= [1 2 2 5 5] (factors-of 100)))

  (it "remove-index"
    (should= [] (remove-index [1] 0))
    (should= [] (remove-index [] -1))
    (should= [] (remove-index [] 0))
    (should= [] (remove-index [] 1))
    (should= [2] (remove-index [1 2] 0))
    (should= [1] (remove-index [1 2] 1))
    (should= [2 3] (remove-index [1 2 3] 0))
    (should= [1 3] (remove-index [1 2 3] 1))
    (should= [1 2] (remove-index [1 2 3] 2))
    (should= [2 2 5 5] (remove-index [2 2 5 5] -1))
    (should= [2 5 5] (remove-index [2 2 5 5] 0))
    (should= [2 5 5] (remove-index [2 2 5 5] 1))
    (should= [2 2 5] (remove-index [2 2 5 5] 2))
    (should= [2 2 5] (remove-index [2 2 5 5] 3))
    (should= [2 2 5 5] (remove-index [2 2 5 5] 4))
    (should= [2 2 5] (remove-index [2 2 3 5] 2)))

  (it "remove-item"
    (should= [] (remove-item [1] 1))
    (should= [] (remove-item [1] 1))
    (should= [1] (remove-item [1 1] 1))
    (should= [1] (remove-item [1 2] 2))
    (should= [1 2] (remove-item [1 2 3] 3))
    (should= [2 2 3 5] (remove-item [1 2 2 3 5] 1))
    (should= [2 2 5] (remove-item [2 2 3 5] 3))
    (should= [2 2 5] (remove-item [2 2 5] nil)))

  (it "vector-diff"
    (should= [1] (vector-diff [1 2 3] [2 3 4]))
    (should= [1 5] (vector-diff [1 2 3 5] [2 3 4]))
    (should= [1 1 5] (vector-diff [1 1 2 3 5] [2 3 4]))
    (should= [1 5] (vector-diff [1 1 2 3 5] [1 2 3 4]))
    (should= [] (vector-diff [1 2 3] [1 2 3]))
    (should= [5] (vector-diff (factors-of 5) (factors-of 6)))
    (should= [2] (vector-diff (factors-of 4) (factors-of 30)))
    (should= [] (vector-diff (factors-of 3) (factors-of 60)))
    (should= [] (vector-diff (factors-of 2) (factors-of 6)))
    (should= [] (vector-diff (factors-of 1) (factors-of 6)))
    (should= [] (vector-diff (factors-of 0) (factors-of 6))))

  (it "Solves #5"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    (should= 6 (euler-5 3))
    (should= 12 (euler-5 4))
    (should= 60 (euler-5 5))
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20))))
