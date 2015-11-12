(defproject lein-hiera "0.9.5"
  :description "Generates a dependency hierarchy graph for project namespaces."
  :url "https://github.com/greglook/lein-hiera"
  :license {:name "Public Domain"
            :url "http://unlicense.org/"}

  :deploy-branches ["master"]
  :eval-in-leiningen true

  :dependencies
  [[org.clojure/tools.namespace "0.2.10"]
   [rhizome "0.2.5"]])
