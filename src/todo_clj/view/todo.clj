(ns todo-clj.view.todo
  (:require [todo-clj.view.layout :as layout]))

(defn todo-index-view [req todo-list]
   (->> `([:h1 "todo list"]
        [:ul
         ~@(for [{:keys [title]} todo-list]
             [:li title])])
      (layout/common req)))
