(ns experiments
  (:require [app.web.interface :as web]))

(comment
  (def server (web/start))
  (web/stop server)
  )