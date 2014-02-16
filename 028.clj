(fn myflatten [x] 
  (when-let [s (seq x)]
    (let [h (first s) t (rest s)] 
      (if (sequential? h) 
        (concat (myflatten h) (myflatten t)) 
        (cons h (myflatten t)) ) )))
