(ns circleci-clj-test.core-test
  (:require [clojure.test :refer :all]
            [circleci-clj-test.core :refer :all]))

(deftest a-test
  (testing "Jurrasic Park!"
    (is (= 1 1))))
