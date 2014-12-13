(ns reactant.geometry-test
  (:use clojure.test
        reactant.geometry))

(deftest bounding-boxes-overlap?-with-same-segment
  (is (bounding-boxes-overlap? [[0 0] [1 1]]
                               [[0 0] [1 1]])
      "Same line where first co-ord in both pairs are higher and lefter")

  (is (bounding-boxes-overlap? [[1 1] [0 0]]
                               [[1 1] [0 0]])
      "Same line where first co-ord in both pairs are lower and righter")

  (is (bounding-boxes-overlap? [[0 0] [1 1]]
                               [[1 1] [0 0]])
      "Same line where first co-ord in first pair is lower and righter")

  (is (bounding-boxes-overlap? [[1 1] [0 0]]
                               [[0 0] [1 1]])
      "Same line where first co-ord in second pair is lower and righter"))

(run-tests)