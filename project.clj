(defproject clogure "0.1.0"
  :description "A simple blog in Clojure"
  :url "...coming soon ..."
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [midje "1.6.3"]
                 [ring "1.2.2"]
                 [environ "0.5.0"]
                 [compojure "1.1.8"]]
  :plugins [[lein-ring "0.8.11"]
            [lein-midje "3.1.1"]
            [environ/environ.lein "0.2.1"]]
  :min-lein-version "2.0.0"
  :hooks [environ.leiningen.hooks]
  :ring {:handler clogure.app/app :port 5000}
  :uberjar-name "clogure-standalone.jar"
  :main clogure.app
  :aot [clogure.app]
  :profiles {:production {:env {:production true}}})
