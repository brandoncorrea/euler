(ns euler.level1.problem006)

(defn square [n]
  (* n n))

(defn sum [nums]
  (reduce + nums))

(defn square-sum [nums]
  (sum (map square nums)))

(def sum-square
  (comp square sum))

(defn euler-6 [n]
  (let [naturals (range 1 (inc n))]
    (- (sum-square naturals) (square-sum naturals))))
