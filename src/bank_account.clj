(ns bank-account
  {:author "Seçkin KÜKRER"})

(defn open-account []
  (atom 0))

(defn close-account [account]
  (reset! account nil))

(defn get-balance [account]
  (deref account))

(defn update-balance [account balance]
  (swap! account + balance))
