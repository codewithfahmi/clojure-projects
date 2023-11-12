(ns palindrome.app
  (:require [clojure.string :as str]))

(defn -main []
  (print "input the word : ")
  (flush)
  (let [word (str/lower-case (str (read-line)))]
    (if (= (compare word (apply str (reverse word))) 0)
      (println word "is palindrome ")
      (println word "is not palindrome "))))