(ns recruit-app.util.urls)

(def urls
  {:background-img-src       "/img/cafe_man_flip.jpg"
   :modal-x-url              "/img/x.svg"
   :arrow-up-url             "/img/arrow-up.svg"
   :arrow-up-disable-url     "/img/arrow-up-disable.svg"
   :arrow-line-url           "/img/arrow_line.svg"
   :icon-pencil-url          "/img/icon_pencil.svg"
   :oval                     "/img/Oval.svg"
   :selected-icon            "/img/SelectedIcon.svg"
   :line                     "/img/Line.svg"
   :caret                    "/img/caret.svg"
   :caret-teal               "/img/caret-teal.svg"
   :lock                     "/img/lock.svg"
   :phone                    "/img/phone.svg"
   :social-media-transparent "/img/social_media_transparent_bg.png"
   :hire-faster              "/img/hire_faster.jpg"
   :premium                  "/img/premium.jpg"
   :exclamation              "/img/exclamation.svg"
   :signup                   "/img/signup.png"
   :wordout                  "/img/wordout.png"
   :free_referrals           "/img/free_referrals.png"
   :arrow                    "/img/arrow.png"
   :referral-signup          "/img/referral-hiring.gif"
   :down-carat               "/img/down-carat.svg"
   :up-carat                 "/img/up-carat.svg"
   :pre-approved-search-bg   "/img/rl-onboarding-bg.png"
   :download_resume          "/img/download_resume.svg"
   :contactinfo              "/img/contactinfo.svg"
   :location                 "/img/location.svg"
   :salary_data              "/img/salary_data.svg"
   :yoe                      "/img/yoe.svg"
   :check-url                "/img/checkmark.png"
   :nein-url                 "/img/nein.png"
   :phone-icon               "/img/rl-phone-icon.svg"
   :email-icon               "/img/rl-email-icon.svg"
   :eye-crossout             "/img/eye_crossout.svg"
   :demographic              "/img/mh-demographic-image.svg"
   :engagement               "/img/mh-engagement-image.svg"
   :fastest-growing          "/img/mh-fastest-growing-image.svg"
   :app-demo-placeholder     "/img/application-demo-placeholder.jpg"
   :clock                    "/img/clock@3x.png"
   :talk-bubble              "/img/talk-bubble@3x.png"})

;; TODO: add cache busting
(defn img-url
  "Returns url for image key"
  [key]
  (str (get urls key) "?v=125"))