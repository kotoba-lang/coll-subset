(ns kotoba.coll.subset
  "subset? -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds subset? and names, in its
  deps.edn, exactly the definitions subset? reaches. Nothing else."
  )

(defn subset?
  "True if every element of set1 is also in set2. Mirrors
  clojure.set/subset?. An empty set1 is a subset of any set2, including
  another empty set."
  [set1 set2]
  (and (<= (count set1) (count set2))
       (every? #(contains? set2 %) set1)))
