(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

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
    (should= [5] (vector-diff [1 5] [1 2 3]))
    (should= [2] (vector-diff [1 2 2] [1 2 3 5]))
    (should= [] (vector-diff [1 3] [1 2 2 3 5]))
    (should= [] (vector-diff [1 2 3] [1 2 3]))
    (should= [] (vector-diff [1 2] [1 2 3]))
    (should= [] (vector-diff [1] [1 2 3]))
    (should= [] (vector-diff [] [1 2 3])))

  (it "Solves #5"
    (should= 1 (euler-5 1))
    (should= 2 (euler-5 2))
    (should= 6 (euler-5 3))
    (should= 12 (euler-5 4))
    (should= 60 (euler-5 5))
    (should= 2520 (euler-5 10))
    (should= 232792560 (euler-5 20))))
