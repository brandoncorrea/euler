(ns euler.level1.problem011-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem011 :refer :all]))

; https://projecteuler.net/problem=11

(def test-grid
  [8 2 22 97 38 15 0 40 00 75 04 05 07 78 52 12 50 77 91 8
   49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
   81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
   52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
   22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
   24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
   32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
   67 26 20 68 02 62 12 20 95 63 94 39 63 8 40 91 66 49 94 21
   24 55 58 5 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
   21 36 23 9 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
   78 17 53 28 22 75 31 67 15 94 03 80 4 62 16 14 9 53 56 92
   16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
   86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
   19 80 81 68 5 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
   04 52 8 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
   88 36 68 87 57 62 20 72 3 46 33 67 46 55 12 32 63 93 53 69
   4 42 16 73 38 25 39 11 24 94 72 18 8 46 29 32 40 62 76 36
   20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 4 36 16
   20 73 35 29 78 31 90 1 74 31 49 71 48 86 81 16 23 57 5 54
   1 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48])

(describe "Euler Problem #11"

  (it "->grid"
    (should= [] (->grid []))
    (should= [[1]] (->grid [1]))
    (should= [[1]] (->grid [1 2]))
    (should= [[1]] (->grid [1 2 3]))
    (should= [[1 2] [3 4]] (->grid [1 2 3 4]))
    (should= [[1 2 3] [4 5 6] [7 8 9]] (->grid (range 1 10))))

  (it "cols"
    (should= [] (cols []))
    (should= [[1]] (cols [[1]]))
    (should= [[1 3] [2 4]] (cols [[1 2] [3 4]]))
    (should= [[1 4 7] [2 5 8] [3 6 9]] (cols [[1 2 3] [4 5 6] [7 8 9]])))

  (it "top->bottom-diags"
    (should= [] (top->bottom-diags []))
    (should= #{[1]} (set (top->bottom-diags [[1]])))
    (should= #{[3] [1 4] [2]} (set (top->bottom-diags [[1 2] [3 4]])))
    (should= #{[7] [4 8] [1 5 9] [2 6] [3]} (set (top->bottom-diags (partition 3 (range 1 10))))))

  (it "bottom->top-diags"
    (should= [] (bottom->top-diags []))
    (should= #{[1]} (set (bottom->top-diags [[1]])))
    (should= #{[1] [2 3] [4]} (set (bottom->top-diags [[1 2] [3 4]])))
    (should= #{[1] [2 4] [3 5 7] [6 8] [9]} (set (bottom->top-diags (partition 3 (range 1 10))))))

  (it "left-cells"
    (should= [] (left-cells []))
    (should= [[0 0]] (left-cells [[1]]))
    (should= [[0 0] [1 0]] (left-cells [[1 2] [3 4]])))

  (it "top-cells"
    (should= [] (top-cells []))
    (should= [[0 0]] (top-cells [[1]]))
    (should= [[0 0] [0 1]] (top-cells [[1 2] [3 4]])))

  (it "right-cells"
    (should= [] (right-cells []))
    (should= [[0 0]] (right-cells [[1]]))
    (should= [[0 1] [1 1]] (right-cells [[1 2] [3 4]])))

  (it "adjacent-nums"
    (should= [] (adjacent-nums 1 []))
    (should= #{[1]} (set (adjacent-nums 1 [[1]])))
    (should= #{[1] [2] [3] [4]} (set (adjacent-nums 1 [[1 2] [3 4]])))
    (should= #{[1 2] [3 4] [1 3] [2 4] [1 4] [2 3]} (set (adjacent-nums 2 [[1 2] [3 4]])))
    (should= #{[1 2 3] [4 5 6] [7 8 9] [1 4 7] [2 5 8] [3 6 9] [1 5 9] [3 5 7]} (set (adjacent-nums 3 [[1 2 3] [4 5 6] [7 8 9]]))))

  (it "Solves #11"
    (should= 0 (euler-11 []))
    (should= 0 (euler-11 [1]))
    (should= 43680 (euler-11 (range 1 17)))
    (should= 70600674 (euler-11 test-grid))))
