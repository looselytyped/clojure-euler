(ns
    ^{:doc "Add all the natural numbers below one thousand that are
    multiples of 3 or 5."}
  com.looselytyped.euler.prob01)

(defn multiple-of-3-or-5?
  [n]
  (or (zero? (mod n 3))
      (zero? (mod n 5))))

(defn solution
  []
  (apply + (filter multiple-of-3-or-5? (range 1000))))

