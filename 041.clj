(fn [coll idx] 
  (loop [col coll result [] cnt 1] 
    (if (seq col) 
      (if (= cnt idx) 
        (recur (rest col ) result 1) 
        (recur (rest col ) (conj result (first col)) (inc cnt)))
      result)))
