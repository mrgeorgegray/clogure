(ns clogure.app
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as jetty]
            [environ.core :refer [env]]
            [clogure.config :refer :all]
            [compojure.core :refer :all])
  (:gen-class))

(defroutes main-routes
           (GET "/" [] (clojure.java.io/resource "public/index.html"))
           (route/resources "/"))

(def app
  (handler/site main-routes))

(defn -main []
  (jetty/run-jetty app {:port (port) :join? false}))