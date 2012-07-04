(ns 
  ^{:doc "Find the largest prime factor of a composite number."}
  com.looselytyped.euler.prob03)

(defn factor?
  [number n]
  (= 0 (rem number n)))

(defn factors
  [number]
  (set (for [n (range 1 (inc (int (Math/ceil (Math/sqrt number)))))
             :when (factor? number n)] n)))

(defn prime?
  [n]
  (= 1 (count (factors n))))

(defn solution
  []
  (apply max (filter prime? (factors 600851475143))))