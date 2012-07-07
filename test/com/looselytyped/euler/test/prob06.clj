(ns com.looselytyped.euler.test.prob06
  (:use com.looselytyped.euler.prob06)
  (:use clojure.test))

(deftest verify-solution
  []
  (is (== 25164150 (solution))))