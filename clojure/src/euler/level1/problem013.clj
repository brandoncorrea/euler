(ns euler.level1.problem013
  (:require [euler.util.math :refer [sum]]
            [clojure.string :refer [join]]))

(defn- ->string [chars] (join "" chars))
(defn- ->long [s] (Long/parseLong s))
(defn- take-ten-chars [n] (->> n str char-array (take 10)))

(defn euler-13 [n]
  (-> n sum take-ten-chars ->string ->long))
