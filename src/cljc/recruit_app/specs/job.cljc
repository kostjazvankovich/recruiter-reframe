(ns recruit-app.specs.job
  (:require #?(:clj [clojure.spec.alpha :as s]
               :cljs [cljs.spec.alpha :as s])))

(def count? nat-int?)
(s/def ::<5 count?)
(s/def ::5-7 count?)
(s/def ::8-10 count?)
(s/def ::11-15 count?)
(s/def ::>15 count?)
(s/def ::unknown count?)
(s/def ::bachelors count?)
(s/def ::masters count?)
(s/def ::phd count?)
(s/def ::<80 count?)
(s/def ::80-100 count?)
(s/def ::100-150 count?)
(s/def ::150-200 count?)
(s/def ::200-250 count?)
(s/def ::>250 count?)
(s/def ::experience (s/keys :opt-un [::unknown ::<5 ::5-7 ::8-10 ::11-15 ::>15]))
(s/def ::education (s/keys :opt-un [::unknown ::bachelors ::masters ::phd]))
(s/def ::salary (s/keys :opt-un [::<80 ::80-100 ::100-150 ::150-200 ::200-250 ::>250]))
(s/def ::total nat-int?)
(s/def ::applicant-demographics (s/keys :req-un [::total ::salary ::education
                                                 ::experience]))
(s/def ::job-id pos-int?)