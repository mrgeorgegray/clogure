(ns clogure.config
  (:require [clojure.string :refer [split trim]]
            [environ.core :refer [env]]))

(defn port []
  (Integer. (or (env :port) 5000)))