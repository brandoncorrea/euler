(ns euler.util.sequences)

(defn- lazy-fibs [a b]
  (lazy-seq (cons a (lazy-fibs b (+ a b)))))

(def fibs (lazy-fibs 0 1))
