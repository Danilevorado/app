package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f22062a = new i0();

    private i0() {
    }

    public final void a(Context context) {
        rb.h.e(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(268435456);
        intent.putExtra("app_package", context.getPackageName());
        ApplicationInfo applicationInfoA = i.f22060a.a(context);
        if (applicationInfoA != null) {
            intent.putExtra("app_uid", applicationInfoA.uid);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
