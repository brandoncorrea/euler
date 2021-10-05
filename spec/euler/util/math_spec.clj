(ns euler.util.math_spec
  (:use
    [speclj.core]
    [euler.util.math]))

(describe "divisible-by?"
  (it "nothing is divisible by 0"
    (should= false (divisible-by? 10 0))
    (should= false (divisible-by? 0 0))
    (should= false (divisible-by? 1 0)))
  (it "Everything is divisible by 1"
    (should= true (divisible-by? 0 1))
    (should= true (divisible-by? -1 1))
    (should= true (divisible-by? 1 1)))
  (it "A number is always divisible by itself"
    (should= true (divisible-by? 1 1))
    (should= true (divisible-by? 2 2))
    (should= true (divisible-by? -1 -1)))
  (it "10 is divisible by 5"
    (should= true (divisible-by? 10 5))))

(describe "sum"
  (it "Zero vector adds to zero"
    (should= 0 (sum [0 0 0])))
  (it "Empty vector adds to zero"
    (should= 0 (sum [])))
  (it "Ones vector adds to its length"
    (should= 5 (sum (repeat 1 5))))
  (it "Adds numbers in vector with different numbers"
    (should= 31 (sum [5 1 0 3 22])))
  (it "Adds numbers in vector with negatives"
    (should= 20 (sum [5 3 -4 2 20 -6]))))

(describe "abs"
  (it "Absolute value of zero is zero"
    (should= 0 (abs 0)))
  (it "Absolute value of one is one"
    (should= 1 (abs 1)))
  (it "Absolute value of negative one is one"
    (should= 1 (abs -1)))
  (it "Absolute value of negative two is two"
    (should= 2 (abs -2)))
  (it "Absolute value of two is two"
    (should= 2 (abs 2))))

(describe "square"
  (it "Square of zero is zero"
    (should= 0 (square 0)))
  (it "Square of one is one"
    (should= 1 (square 1)))
  (it "Square of negative one is one"
    (should= 1 (square -1)))
  (it "Square of two is four"
    (should= 4 (square 2)))
  (it "Square of negative two is four"
    (should= 4 (square -2))))