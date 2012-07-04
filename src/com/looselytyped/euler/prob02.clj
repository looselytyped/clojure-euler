(ns
    ^{:doc "By considering the terms in the Fibonacci sequence whose values do
    not exceed four million, find the sum of the even-valued terms."}
  com.looselytyped.euler.prob02)

(defn fibonacci
  []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn solution
  []
  (apply + (filter even? (take-while #(< % 4000000) (fibonacci)))))

