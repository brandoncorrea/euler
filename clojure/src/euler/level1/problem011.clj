(ns euler.level1.problem011
  (:use [euler.util.math :only [product square abs]]))

(defn- nth-in [coll [index & rest]]
  (if (coll? coll)
    (nth-in (nth coll index) rest)
    coll))

(defn- iterate-cells [grid fn-row fn-col seed]
  (take (count grid)
        (iterate (fn [[r c]] [(fn-row r) (fn-col c)]) seed)))

(defn- juxtcat [n fs] (apply concat ((apply juxt fs) n)))
(defn- root [n] (int (Math/sqrt n)))
(defn- col [rows c] (map #(nth % c) rows))
(defn left-cells [grid] (iterate-cells grid inc identity [0 0]))
(defn top-cells [grid] (iterate-cells grid identity inc [0 0]))
(defn right-cells [grid] (iterate-cells grid inc identity [0 (dec (count grid))]))

(defn ->grid [nums]
  (let [size (root (count nums))]
    (partition size (take (square size) nums))))

(defn cols [rows]
  (map #(col rows %) (range (count rows))))

(defn- in-range [max & nums]
  (every? #(and (<= 0 %) (< % max)) nums))

(defn- map-diag [grid cell fn-row fn-col]
  (let [size (count grid)]
    (map #(nth-in grid %)
         (take-while
           (fn [[r c]] (in-range size r c))
           (iterate (fn [[r c]] [(fn-row r) (fn-col c)]) cell)))))

(defn- map-topdown-diag [grid cell] (map-diag grid cell inc inc))
(defn- map-bottomup-diag [grid cell] (map-diag grid cell inc dec))

(defn top->bottom-diags [grid]
  (map #(map-topdown-diag grid %)
       (juxtcat grid [left-cells top-cells])))

(defn bottom->top-diags [grid]
  (map #(map-bottomup-diag grid %)
       (juxtcat grid [top-cells right-cells])))

(defn adjacent-nums [size grid]
  (mapcat #(partition size %)
          (juxtcat grid
                   [identity
                    cols
                    top->bottom-diags
                    bottom->top-diags])))

(defn euler-11 [n]
  (let [products (map product (adjacent-nums 4 (->grid n)))]
    (if (empty? products)
      0
      (apply max products))))
