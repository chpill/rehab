(ns rehab.core
  (:require [datomic.api :as d]))

(def db-uri "datomic:free://localhost:4334/rehab?password=plopplop")

(comment

  (d/create-database db-uri)

  )

(defonce *conn (d/connect db-uri))


#_(d/q '[:find ?e ?a ?v
       :where [?e ?a ?v]]

     )
