; This Source Code Form is subject to the terms of the Mozilla Public
; License, v. 2.0. If a copy of the MPL was not distributed with this
; file, You can obtain one at http://mozilla.org/MPL/2.0/.

(ns reactant.core
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [reactant.dynamic :as dynamic]))

(q/defsketch reactant
  :title "You spin me right round baby"
  :size [500 500]
  ; setup function called only once, during sketch initialization.
  :setup dynamic/setup
  ; update is called on each iteration before draw is called.
  ; It updates sketch state.
  :update dynamic/update
  :draw dynamic/draw
  ; This sketch uses functional-mode middleware.
  ; Check quil wiki for more info about middlewares and particularly
  ; fun-mode.
  :middleware [m/fun-mode])
