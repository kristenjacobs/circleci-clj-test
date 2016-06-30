(defproject circleci-clj-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :plugins      [[lein-cloverage "1.0.6"]
                 [test2junit "1.2.2"]]
  :main ^:skip-aot circleci-clj-test.core
  :target-path "target/%s"
  :test2junit-output-dir ~(or (System/getenv "CIRCLE_TEST_REPORTS") "target/test2junit")
  :profiles {:uberjar {:aot :all}})
