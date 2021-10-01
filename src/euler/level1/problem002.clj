(ns euler.level1.problem002)

; Invalid entries will create a new sequence
(defn- start-of-sequence? [prev cur]
  (or (>= 0 prev)
      (>= prev cur)))

(defn fibs
  ([] (fibs 1 2))
  ([prev cur]
    (if (start-of-sequence? prev cur)
        (fibs 1 2)
        (concat [prev]
          (lazy-seq
            (fibs cur (+ prev cur)))))))

(defn even-fibs []
  (filter even? (fibs)))

(defn even-fibs-less-than [n]
  (take-while #(< % n) (even-fibs)))

(defn euler-2 [n]
  (reduce + (even-fibs-less-than (inc n))))
