(ns recruit-app.util.uri)

(def recruit-app-endpoints {:get-full-access               #(str "/landing/get-full-access")
                            :get-jobs                      #(str "/jobs")
                            :get-job                       #(str "/jobs/" %)
                            :promote-job                   #(str "/jobs/" % "/promote")
                            :post-job                      #(str "/jobs" (when % (str "/" %)))
                            :repost-job                    #(str "/jobs/" % "/repost")
                            :remove-job                    #(str "/jobs/" %)
                            :application-viewed            #(str "/jobs/application-viewed")
                            :login                         #(str "/login")
                            :get-token                     #(str "/get-token")
                            :shopify                       #(str "/shopify/promoted-job")
                            :shopify-fullaccess            #(str "/shopify/full-access")
                            :get-templates                 #(str "/templates")
                            :create-template               #(str "/templates")
                            :update-template               #(str "/templates/" %)
                            :delete-template               #(str "/templates/" %)
                            :send-email                    #(str "/introductions/batch-contact")
                            :location-autocomplete         #(str "/location/" %)
                            :company-autocomplete          #(str "/company?name=" %)
                            :suggested-candidates          #(str "/suggested/" %)
                            :pending-promoted-job          #(str "/job-promotion")
                            :pending-promoted-jobs         #(str "/job-promotion-list")
                            :fetch-candidate               #(str "/candidates/" %)
                            :fetch-candidate-notes         #(str "/candidate-notes/" %)
                            :save-candidate-notes          #(str "/candidate-notes/" %)
                            :export-to-ats                 #(str "/ats")
                            :ats-jobs                      #(str "/ats/jobs")
                            :resume                        #(str "/resume/" %1 "/" %2)
                            :download-resume               #(str "/resume/" %1 "/" %2)
                            :resume-downloaded             #(str "/resume/downloaded")
                            :pdf-viewer                    #(str "/js/pdf/web/viewer.html")
                            :resume-metadata               #(str "/resume-metadata/" %)
                            :share-resume                  #(str "/resume/share")
                            :call-candidate                #(str "/api/call-candidate/" %)
                            :get-recruiter-image           #(str "/recruiter-images?cb=" %2)
                            :upload-image                  #(str "/recruiter-images")
                            :create-search-list            #(str "/managejobs/createlist")
                            :get-search-results            #(str "/api/search/ra")
                            :get-projects                  #(str "/projects")
                            :get-candidates                #(str "/projects/" % "/candidates")
                            :rename-project                #(str "/projects/" %)
                            :create-project                #(str "/projects")
                            :delete-project                #(str "/projects/" %)
                            :update-project-candidates     #(str "/projects/" %3 "/" %2)
                            :projects-for-candidate        #(str "/projects/" %2)
                            :dismiss-candidate             #(str "/candidates/dismiss")
                            :track-candidate-view          #(str "/tracking/view/" %1)
                            :logout                        #(str "/logout")
                            :impersonate-user              #(str "/auth/" %)
                            :redact-permissions            #(str "/redact-permissions/" %)
                            :inventory                     #(str "/inventory/" %)
                            :search                        #(str "/search")
                            :saved-search                  #(str "/saved-searches/" %)
                            :save-search                   #(str "/saved-searches" (when % (str "/" %)))
                            :saved-searches                #(str "/saved-searches")
                            :saved-searched-stats          #(str "/saved-searches/stats")
                            :delete-saved-searches         #(str "/saved-searches" (when % (str "/" %)))
                            :confirm-email                 #(str "/confirm-email")
                            :onboarding                    #(str "/company/preapproved")
                            :save-job-promotion            #(str "/jobs/" %1 "/promotions")
                            :cancel-job-promotion          #(str "/jobs/" %1 "/cancel-promotion")
                            :register-preapproved          #(str "/recruiters")
                            :register-nonpreapproved       #(str "/recruiters")
                            :user                          #(str "/user")
                            :submit-referral               #(str "/referral")
                            :update-profile                #(str "/account/profile")
                            :account-change-password       #(str "/account/change-password")
                            :ats-settings                  #(str "/ats/settings")
                            :verify-resend                 #(str "/verify/send")
                            :verification-code-valid?      #(str "/verify/" %1 "/valid")
                            :email-exists?                 #(str "/recruiters/email-exists")
                            :pending-recruiters            #(str "/recruiters/pending")
                            :pending-escalated-recruiters  #(str "/recruiters/pending-escalated")
                            :recently-approved-recruiters  #(str "/recruiters/approved-past-week")
                            :fetch-recruiter               #(str "/recruiters/" %1)
                            :approve-recruiter             #(str "/recruiters/" %1 "/approve")
                            :escalate-recruiter            #(str "/recruiters/" %1 "/escalate")
                            :decline-recruiter             #(str "/recruiters/" %1 "/decline")
                            :permanently-decline-recruiter #(str "/recruiters/" %1 "/permanently-decline")
                            :update-recruiter              #(str "/recruiters/" %1)
                            :fetch-teams                   #(str "/teams/read-all")
                            :fetch-team                    #(str "/teams/" %1)
                            :create-team                   #(str "/teams")
                            :edit-team                     #(str "/teams/" %1)
                            :remove-team                   #(str "/teams/" %1)
                            :add-member                    #(str "/teams/" %1 "/add-recruiter")
                            :make-admin                    #(str "/teams/" %1 "/make-admin")
                            :add-admin-by-email            #(str "/teams/" %1 "/add-admin-by-email")
                            :remove-member                 #(str "/teams/" %1 "/remove-recruiter")
                            :remove-admin                  #(str "/teams/" %1 "/remove-admin")
                            :team-summary                  #(str "/teams/team-summary-by-admin/" %1)
                            :team-search                   #(str "/teams/search")
                            :fetch-admin-note              #(str "/recruiters/fetch-admin-note/" %)
                            :create-admin-note             #(str "/recruiters/create-admin-note")
                            :update-admin-note             #(str "/recruiters/update-admin-note")
                            :recruiter-search              #(str "/recruiter-search")
                            :forgot-password               #(str "/password/send-email")
                            :change-password               #(str "/password")
                            :superuser-job                 #(str "/superuser/jobs/" %)
                            :get-users-lever               #(str "/ats/lever")
                            :pay-curtain-click             #(str "/pay-curtain-click")
                            :enterprise-click              #(str "/enterprise-click")
                            :newly-approved-recruiter      #(str "/newly-approved-recruiter/" %1)
                            :recruiter-preview-base        #(str "https://member.theladders.com/recruiter/")
                            :greenhouse-auth-url           #(str "/ats/greenhouse")
                            :recruiter-dashboard           #(str "/recruiter-dashboard")
                            :blur-row                      #(str "/img/blur" % ".jpg")
                            :ra-send-verify                #(str "/verify/send/" %)})

(defn uri
  "Returns specified uri from endpoints depending on rl-build config"
  [key & params]
  (apply (get recruit-app-endpoints key) params))