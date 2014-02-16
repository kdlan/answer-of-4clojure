(fn interl [a b] (when (and (seq a) (seq b)) (concat [(first a) (first b)] (interl (rest a) (rest b)))))
