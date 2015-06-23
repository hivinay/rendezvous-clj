(ns rendezvous-clj.core
  (:require [compojure.core :refer :all]
            [org.httpkit.server :refer [run-server]]))

(defroutes rendezvous-clj
  (GET "/" [] "Hello world!"))

(defn -main []
  (run-server rendezvous-clj {:port 8080}))
