#(reduce (fn [a b] (if (= (last a) b)  a (conj a b))) [] %)
