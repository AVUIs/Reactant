; This Source Code Form is subject to the terms of the Mozilla Public
; License, v. 2.0. If a copy of the MPL was not distributed with this
; file, You can obtain one at http://mozilla.org/MPL/2.0/.

(ns reactant.geometry-test
  (:use clojure.test
        reactant.geometry))

; Bounding boxes

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


(deftest bounding-boxes-overlap?-with-no-overlap
  (is (not (bounding-boxes-overlap? [[0 0] [1 1]]
                                    [[2 2] [3 2]])))

  (is (not (bounding-boxes-overlap? [[8 8] [2 1]]
                                    [[9 1] [6 1]])))

  (is (not (bounding-boxes-overlap? [[-3 0] [1 1]]
                                    [[2  3] [1 2]]))))

; Cross product

(deftest cross-product-test
    (is (=  0 (cross-product [1 1]  [1 1])))
    (is (=  0 (cross-product [10 2] [20 4])))
    (is (= 46 (cross-product [4 5]  [2 14])))
    (is (= 2179 (cross-product [24 5] [1 91]))))

(run-tests)
