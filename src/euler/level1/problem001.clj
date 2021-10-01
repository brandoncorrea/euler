(ns euler.level1.problem001)

(defn divisible-by-3-or-5? [n]
      (or
        (= 0 (mod n 3))
        (= 0 (mod n 5))))

(defn desired-numbers-less-than [n]
      (filter divisible-by-3-or-5? (range 1 n)))

(defn euler-1 [n]
      (reduce + (desired-numbers-less-than n)))