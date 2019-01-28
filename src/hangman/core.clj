(ns hangman.core
  (:gen-class))

(defn endGame [] (print "You lose."))

(defn game [lifes] 
  (if (= vidas 0)
    (endGame)
    (do
      (print lifes)
      (game (dec lifes))
    )
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
