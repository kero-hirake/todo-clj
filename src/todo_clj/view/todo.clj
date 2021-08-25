(ns todo-clj.view.todo
  (:require [hiccup.core :as hc]))

(defn todo-index [req todo-list]
   (-> `([:h1 "todo list"]
        [:ul
         ~@(for [{:keys [title]} todo-list]
             [:li title])])
      hc/html))