package com.onesignal;

import android.app.Activity;

/* loaded from: classes.dex */
abstract class g {
    static void a(Activity activity, String[] strArr, int i10) {
        activity.requestPermissions(strArr, i10);
    }

    static boolean b(Activity activity, String str) {
        return androidx.core.app.b.s(activity, str);
    }
}
