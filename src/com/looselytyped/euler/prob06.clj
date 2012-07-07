(ns
    ^{:doc "What is the difference between the sum of the squares and the square of the sums?"}
    com.looselytyped.euler.prob06)


(defn solution
  []
  (- (Math/pow (reduce + (range 1 101)) 2)
     (reduce + (map #(Math/pow % 2) (range 1 101)))))