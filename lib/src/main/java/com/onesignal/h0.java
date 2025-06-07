package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f22048a = new h0();

    private h0() {
    }

    public final void a(Context context) {
        rb.h.e(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse(rb.h.j("package:", context.getPackageName())));
        context.startActivity(intent);
    }
}
