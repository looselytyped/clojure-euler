(ns
    ^{:doc "What is the smallest number divisible by each of the numbers 1 to
    20?"} com.looselytyped.euler.prob05)

(defn divisible-by-all
  [n]
  (if-not (some pos? (pmap #(rem n %) (reverse (range 11 21)))) n))

(defn solution
  "The trick here is in the description. The smallest number divisible by all 
numbers between 1 to 10 is 2520. Therefore, all the following multiples will be
muliples of 2520. No reason to brute force your way through it"
  []
  (some divisible-by-all (map * (iterate inc 1) (repeat 2520))))