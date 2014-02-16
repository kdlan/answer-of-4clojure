(fn [a coll] (reduce #(if (seq %1) (conj %1 a %2) (conj %1 %2)) [] coll))
