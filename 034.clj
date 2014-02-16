(fn f [s d] (when-not (= s d) (cons s (f (inc s) d))))
