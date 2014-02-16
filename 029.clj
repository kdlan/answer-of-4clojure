#(apply str (filter (comp (partial re-matches #"[A-Z]") str) %))
