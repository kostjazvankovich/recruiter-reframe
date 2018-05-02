(ns recruit-app.util.img)

(def urls
  {:lever-image-url             "/img/lever-api-instructions.jpg"
   :lock-url                    "/img/lock_black.png"
   :blurred-header-url          "/img/top-blur.png"
   :blurred-body-url            "/img/bottom-blur.png"
   :no-views-url                "/img/no-views.svg"
   :no-applicants-url           "/img/no-applicants.svg"
   :upload-profile-img-url      "/img/LIHP_photo_upload.jpg"
   :secure-site-img-url         "/img/SecuredSiteSeal.jpg"
   :icon-pencil-url             "/img/icon_pencil.svg"
   :x-icon-url                  "/img/icon_x.svg"
   :stroke-icon-url             "/img/stroke.svg"
   :promote-banner              "/img/promote-banner.png"
   :promo-img-src               "/img/search-results-2@2x.png"
   :tool-tip-url                "/img/info@3x.png"
   :slice                       "/img/slice.svg"
   :slice-grey                  "/img/slice-grey.svg"
   :loading-icon-url            "/img/loading.gif"
   :loading-circle-url          "/img/loading-circle.gif"
   :default-profile-img         "/img/recruiter-silhouette.jpg"
   :search-blur0                "/img/row_blur_0.jpg"
   :search-blur1                "/img/row_blur_1.jpg"
   :search-blur2                "/img/row_blur_2.jpg"
   :ladders-recruiter-logo      "/img/ladders_recruiter_logo.png"
   :checkmark-solo              "/img/checkmark_solo.svg"
   :exclamation-grey            "/img/exclamation-grey.svg"
   :exclamation-mark-solo       "/img/exclamation_mark_solo.svg"
   :promoted-job-listings       "/img/promoted_job_listings.jpg"
   :full-contact-info           "/img/full_contact_info.jpg"
   :dedicated-account-manager   "/img/dedicated_account_manager.jpg"
   :job                         "/img/job.jpg"
   :monthly-analytics-reporting "/img/monthly_analytics_reporting.jpg"
   :trusted-by-logos            "/img/trusted_by_logos.jpg"
   :recruitersearch             "/img/recruitersearch.jpg"
   :companybranding             "/img/companybranding.png"
   :toggle-on                   "/img/toggle-on.png"
   :toggle-off                  "/img/toggle-off.png"
   :arrow-right                 "/img/arrow-right@3x.png"
   :arrow-left                  "/img/arrow-left@3x.png"
   :arrow-right-active          "/img/arrow-right-white@3X.png"
   :arrow-left-active           "/img/arrow-left-white@3X.png"
   :down-sort-arrow             "/img/down@3x.png"
   :up-sort-arrow               "/img/up@3x.png"
   :double-sort-arrow           "/img/up-down-gray@3x.png"
   :promote                     "/img/arrow-up.svg"
   :promote-disabled            "/img/arrow-up-disable.svg"
   :cityhire                    "/img/cityhire.png"
   :person-disabled             "/img/candidateGray.png"
   :person                      "/img/candidateTeal.png"
   :btn-close                   "/img/btn-close.svg"})

;; TODO: add cache busting
(defn url
  "Returns url for img key."
  [key]
  (str (get urls key) "?v=124"))
