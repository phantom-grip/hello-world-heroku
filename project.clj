(defproject hello-world-heroku "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [http-kit "2.3.0"]
                 [environ "1.1.0"]]
  :min-lein-version "2.0.0"
  :uberjar-name "hello-world-heroku.jar"
  :main ^:skip-aot hello-world-heroku.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
