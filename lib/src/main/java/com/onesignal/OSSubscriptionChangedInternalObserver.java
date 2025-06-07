package com.onesignal;

/* loaded from: classes.dex */
class OSSubscriptionChangedInternalObserver {
    OSSubscriptionChangedInternalObserver() {
    }

    static void a(OSSubscriptionState oSSubscriptionState) {
        if (e3.z0().c(new q2(e3.f21887g0, (OSSubscriptionState) oSSubscriptionState.clone()))) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            e3.f21887g0 = oSSubscriptionState2;
            oSSubscriptionState2.i();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        a(oSSubscriptionState);
    }
}
