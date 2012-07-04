(ns
    ^{:doc "Find the largest palindrome made from the product of two 3-digit numbers."}
  com.looselytyped.euler.prob04)

(defn palindrome?
  [s]
  (= (seq s) (reverse s)))


(defn gen-palindromes
  []
  (let [r (reverse (range 101 999))]
    (for [x r y r :when (palindrome? (str (* x y)))] (* x y))))

(defn solution
  []
  (apply max (gen-palindromes)))