(ns euler.level1.problem003)

(defn- divisible-by? [num div]
  (= 0 (mod num div)))

(defn- abs [n]
  (if (>= n 0)
    n
    (* -1 n)))

(defn euler-3 [n]
  (loop [num (abs n)
         div 2]
    (cond
      (>= div num)
        num
      (divisible-by? num div)
        (recur (/ num div) div)
      :else
        (recur num (inc div)))))
