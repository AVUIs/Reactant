(ns reactant.geometry)

;;;; Testing that line segments intersect
;
; If bounding boxes overlap
;    && line a intersects line segment b
;    && line b intersects line segment a
; then the line segments intersect

; http://silentmatt.com/rectangle-intersection/
(defn bounding-boxes-overlap?
  "Draw a box around 2 line segments and test if they overlap"
  [[[a-x1 a-y1] [a-x2 a-y2]]
   [[b-x1 b-y1] [b-x2 b-y2]]]

  (let [a-left   (min a-x1 a-x2)
        b-left   (min b-x1 b-x2)
        a-right  (max a-y1 a-y2)
        b-right  (max b-y1 b-y2)
        a-top    (min a-y1 a-y2)
        b-top    (min b-y1 b-y2)
        a-bottom (max a-x1 a-x2)
        b-bottom (max b-x1 b-x2)]
    (and
      ; Left   of box A is left  of right  of box B
      ; Right  of box A is right of left   of box B
      ; Top    of box A is above    bottom of box B
      ; Bottom of box A is below    top    of box B
      (< a-left   b-right)
      (> a-right  b-left)
      (< a-top    b-bottom)
      (> a-bottom b-top))))


(defn cross-product
  "Cross product of two points"
  [[a-x a-y] [b-x b-y]]
  (- (* a-x b-y) (* a-y b-x)))
