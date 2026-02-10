(ns first)

(def person
  {:name "John"
   :surname "Doe"})

(defn full-name [{:keys [name surname]}]
  (str name " " surname))

(defn print-full-name [person-data]
  (let [person-full-name (full-name person-data)]
    (println person-full-name)))

(defn -main [& _args]
  (print-full-name person))