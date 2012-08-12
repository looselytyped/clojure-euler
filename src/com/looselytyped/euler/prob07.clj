(ns com.looselytyped.euler.prob07)

(defn factor?
  [number n]
  (= 0 (rem number n)))

(defn factors
  [number]
  (set (for [n (range 1 (inc (int (Math/floor (Math/sqrt number)))))
             :when (factor? number n)] n)))

(defn prime?
  [n]
  (= 1 (count (factors n))))

(defn solution
  []
  (nth (filter prime? (iterate inc 1)) 10001))