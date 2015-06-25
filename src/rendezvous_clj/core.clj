(ns rendezvous-clj.core
  (:require [compojure.core :refer :all]
            [cheshire.core :refer :all]
            [org.httpkit.server :refer [run-server]]))

(defn meeting-handler
  [data]
  (let [data (parse-string data)]
    (str data)))

(defroutes rendezvous-clj
  (GET "/meeting/:data" [data] (meeting-handler data))
  (GET "//:name" [name] (str "Hello " name)))

(defn -main []
  (run-server rendezvous-clj {:port 8080}))
