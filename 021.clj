(fn [coll n] 
  (if (zero? n) 
    (first coll)
    (recur (rest coll) (dec n))))
