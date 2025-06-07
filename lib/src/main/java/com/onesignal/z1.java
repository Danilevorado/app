package com.onesignal;

import android.content.Context;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f22540a = new z1();

    private z1() {
    }

    public final boolean a(Context context) {
        rb.h.e(context, "context");
        return !rb.h.a("DISABLE", OSUtils.f(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean b(Context context) {
        rb.h.e(context, "context");
        return OSUtils.g(context, "com.onesignal.suppressLaunchURLs");
    }
}
