(defproject com.ninjudd/ring "1.2.2"
  :description "A Clojure web applications library."
  :url "https://github.com/ring-clojure/ring"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies
    [[org.clojure/clojure "1.3.0"]
     [ring/ring-core "1.2.1"]
     [ring/ring-devel "1.2.1"]
     [com.ninjudd/ring-jetty-adapter "1.2.2"]
     [com.ninjudd/ring-servlet "1.2.2"]]
  :plugins
    [[lein-sub "0.2.4"]
     [codox "0.6.6"]]
  :sub
    ["ring-core"
     "ring-devel"
     "ring-jetty-adapter"
     "ring-servlet"]
  :codox
    {:src-dir-uri "http://github.com/ring-clojure/ring/blob/1.2.1"
     :src-linenum-anchor-prefix "L"
     :sources ["ring-core/src"
               "ring-devel/src"
               "ring-jetty-adapter/src"
               "ring-servlet/src"]})
