(ns first)

(defn add [left-number right-number]
  (+ left-number right-number))

(defn -main [& _args]
  (let [first-number 1
        second-number 2
        sum-result (add first-number second-number)]
    (println sum-result)))
