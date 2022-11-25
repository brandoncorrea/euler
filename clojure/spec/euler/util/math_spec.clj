(ns euler.util.math_spec
  (:use [speclj.core]
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

(describe "product"
  (it "List containing zero is always zero"
    (should= 0 (product [1 2 0 3 4])))
  (it "Product of empty list is 1"
    (should= 1 (product [])))
  (it "Product of list of 1s is 1"
    (should= 1 (product [1 1 1 1])))
  (it "Product of 1 2 3 is 6"
    (should= 6 (product [1 2 3])))
  (it "Product of -1 2 3 is -6"
    (should= -6 (product [-1 2 3]))))

(describe "sum-squares"
  (it "Empty list results in 0"
    (should= 0 (sum-squares [])))
  (it "List of 0 results in 0"
    (should= 0 (sum-squares [0])))
  (it "List of 0 and 1 results in 1"
    (should= 1 (sum-squares [0 1])))
  (it "sum of squares of 0 1 and 2 result in 5"
    (should= 5 (sum-squares [0 1 2])))
  (it "range of 11 results in 385"
    (should= 385 (sum-squares (range 11))))
  (it "Accepts rest parameters of numbers"
    (should= 14 (sum-squares 1 2 3)))
  (it "Accepts arrays and numeric parameters"
    (should= 30 (sum-squares [1 [2 3] [4]]))))

(describe "square-sum"
  (it "Empty list results in 0"
    (should= 0 (square-sum [])))
  (it "List of 0 results in 0"
    (should= 0 (square-sum [0])))
  (it "List of 0 and 1 results in 1"
    (should= 1 (square-sum [0 1])))
  (it "List of 1 and 2 results in 9"
    (should= 9 (square-sum [1 2])))
  (it "List of 2 3 adn 4 results in 36"
    (should= 36 (square-sum (range 4))))
  (it "Number 0 - 10 results in 3025"
    (should= 3025 (square-sum (range 11)))))
