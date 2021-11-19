(ns euler.level1.problem014)

(defn- next-link [n]
  (if (even? n)
    (/ n 2)
    (inc (* 3 n))))

(defn- contains? [coll x]
  (if (some #(= x %) coll)
    true
    false))

(defn chain [n]
  (if (= 1 n)
    [n]
    (lazy-seq (cons n (chain (next-link n))))))

(defn- greatest [[_ longest-chain :as old-value] n]
  (if (contains? longest-chain n)
    old-value
    (let [n-chain (chain n)]
      (if (> (count n-chain) (count longest-chain))
        [n n-chain]
        old-value))))

(defn euler-14 [n]
  (loop [n n
         [longest-n _ :as max] [-1 []]]
    (if (> 1 n)
      longest-n
      (recur (dec n) (greatest max n)))))
