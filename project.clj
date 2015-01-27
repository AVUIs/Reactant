(defproject reactant "0.0.1"
  :description "A audio visual performance interface experiment using Quil."
  :url "https://github.com/AVUIs/reactant"
  :license {:name "Mozilla Public License"
            :url "http://www.mozilla.org/MPL/2.0/"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [quil "2.2.4"]]
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.5.2"]]}})
