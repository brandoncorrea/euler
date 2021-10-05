(ns euler.level1.problem001
  (:use [euler.util.math :only [divisible-by? sum]]))

(defn divisible-by-3-or-5? [n]
  (or
    (divisible-by? n 3)
    (divisible-by? n 5)))

(defn desired-numbers-less-than [n]
  (filter divisible-by-3-or-5? (range 1 n)))

(def euler-1
  (comp sum desired-numbers-less-than))