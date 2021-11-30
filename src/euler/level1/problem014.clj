(ns euler.level1.problem014)

(defn- next-link [n]
  (if (even? n)
    (/ n 2)
    (inc (* 3 n))))

(defn count-links [n mappings]
  (loop [link n
         len 0]
    (if (= 1 link)
      (inc len)
      (if-let [mapping-len (get mappings link)]
        (+ len mapping-len)
        (recur (next-link link) (inc len))))))

(defn euler-14 [n]
  (loop [start-link 1
         max-len 0
         max-n 0
         mappings {}]
    (if (< n start-link)
      max-n
      (let [len (count-links start-link mappings)
            mappings (assoc mappings start-link len)]
        (if (> len max-len)
          (recur (inc start-link) len start-link mappings)
          (recur (inc start-link) max-len max-n mappings))))))
