(defproject fluent-logger-clojure "0.1.0.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License Version 2.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;; https://mvnrepository.com/artifact/org.fluentd/fluent-logger
                 [org.fluentd/fluent-logger "0.3.2"]]
  :aot [fluent-logger-clojure.core-test]
  )
