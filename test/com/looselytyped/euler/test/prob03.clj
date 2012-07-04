(ns com.looselytyped.euler.test.prob03
  (:use com.looselytyped.euler.prob03)
  (:use clojure.test))

(deftest verify-solution
  []
  (is (== 6857 (solution))))