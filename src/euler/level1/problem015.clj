(ns euler.level1.problem015
  (:require [euler.util.math :as m]))

(defn euler-15 [n]
  (let [n (bigint n)]
    (/ (m/factorial (+ n n))
       (m/square (m/factorial n)))))
