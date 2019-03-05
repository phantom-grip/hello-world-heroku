(ns hello-world-heroku.core
  (:require [org.httpkit.server :as s]
            [environ.core :refer [env]])
  (:gen-class))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello world heroku!"})

(defn start-server [port]
  (s/run-server app {:port port}))

(defn -main
  [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (start-server port)))
