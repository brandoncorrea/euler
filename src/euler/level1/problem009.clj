(ns euler.level1.problem009)

(defn- square [n] (* n n))
(defn- sum [nums] (reduce + nums))
(defn- product [nums] (reduce * nums))
(defn- sum-squares [& nums] (->> nums (map square) sum))

(defn triplet? [a b c]
  (and (< a b)
       (< b c)
       (= (sum-squares a b) (square c))))

(defn calculate-c [a b]
  (-> (sum-squares a b)
      Math/sqrt
      int))

(defn triplets [max-member]
  (loop [a 1
         b 2
         triplet-coll []]
    (let [c (calculate-c a b)]
      (cond
        (> b max-member)
          triplet-coll
        (or (> c max-member) (>= a b))
          (recur 1 (inc b) triplet-coll)
        (triplet? a b c)
          (recur (inc a) b (conj triplet-coll [a b c]))
        :else
          (recur (inc a) b triplet-coll)))))

(defn euler-9 [n]
  (->> (triplets n)
      (filter #(= n (sum %)))
      first
      product))
