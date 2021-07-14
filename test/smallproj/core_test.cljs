(ns smallproj.core-test
  (:require [cljs.test :refer-macros [deftest is testing use-fixtures async]]
            [figwheel.main.testing :refer-macros [run-tests-async]]))

(deftest change-folder-in-browser
  (testing "Change folder in file browser and ensure buffer doesn't change"
    (async
     done
     (is (= 1 1))
     (done))))

(defn -main [& args]
  (run-tests-async 10000))
