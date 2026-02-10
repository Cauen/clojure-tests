(ns first)

(defn -main [& args]
  (println "Hello, World!")
  (let [value 3]
    ;; Print the above value, using pipe
    (println (str "The value is " value " and the first arg is " (first args) " and the second arg is " (second args) " and the third arg is " (nth args 2)))))