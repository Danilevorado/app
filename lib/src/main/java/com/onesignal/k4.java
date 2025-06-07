package com.onesignal;

import org.json.JSONException;

/* loaded from: classes.dex */
class k4 extends h4 {
    k4(String str, boolean z10) {
        super(str, z10);
    }

    private int A() {
        int iD = i().d("subscribableStatus", 1);
        if (iD < -2) {
            return iD;
        }
        if (i().c("androidPermission", true)) {
            return !i().c("userSubscribePref", true) ? -2 : 1;
        }
        return 0;
    }

    @Override // com.onesignal.h4
    protected void a() {
        try {
            t("notification_types", Integer.valueOf(A()));
        } catch (JSONException unused) {
        }
    }

    @Override // com.onesignal.h4
    h4 p(String str) {
        return new k4(str, false);
    }
}
