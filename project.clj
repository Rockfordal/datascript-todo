(defproject datascript-todo "0.1.0"
  :dependencies [
    [org.clojure/clojure "1.7.0"]
    [org.clojure/clojurescript "0.0-3297"]
    [datascript "0.11.2"]
    [rum "0.2.6"]
    [secretary "1.2.3"]
    [com.cognitect/transit-cljs "0.8.215"]]

  :plugins [[cider/cider-nrepl "0.10.0-SNAPSHOT"]
            ;[lein-datomic "0.2.0"]
            [lein-cljsbuild "1.0.6"]
            [lein-figwheel "0.3.7" :exclusions [org.clojure/tools.reader
                                                org.clojure/clojurescript
                                                clj-stacktrace]]] 

  :figwheel {:port 3449
             ;:nrepl-port 7888
             :http-server-root "public"}

  :cljsbuild
  {:builds [{:id "none"
             :source-paths ["src"]
               :compiler {
                :optimizations :none
                :output-to "resources/public/js/app.js"
                :output-dir "resources/public/target/none"
                :main datascript-todo
                :source-map    true
                :warnings {:single-segment-namespace false}}}]})
