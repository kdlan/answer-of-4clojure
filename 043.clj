(fn [coll n]
  (letfn [(il [x]
            (map first
                 (filter
                   #(= x (last %))
                   (map list coll (cycle (range 1 (inc n)))))))]
    (loop [idx 1 result []]
      (if (> idx n)
        result
        (recur (inc idx) (conj result (il idx)))))))

#(apply (partial map list) (partition %2 %1))
