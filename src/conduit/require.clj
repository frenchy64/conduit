(ns conduit.require
  (:use conduit.core)
  (:refer-clojure :exclude [case comp juxt reduce map]))

(def proc a-arr)
(def case a-selectp)
(def comp a-comp)
(def split a-all)
(def juxt a-par)
(def reduce a-loop)
(def map conduit-map)
(def do conduit-do)
