(ns user
  (:require [clojure.tools.nrepl.server :as nrepl]
            [cider.nrepl :refer [cider-nrepl-handler]]))

(defonce nrepl-server
  (let [port 7888]
    (println "Starting nrepl server on port" port)
    (nrepl/start-server :port port
                        :handler cider-nrepl-handler)))

