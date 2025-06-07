package com.onesignal;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22472a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f22473b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22474c;

    public v(Context context, Intent intent, boolean z10) {
        rb.h.e(context, "context");
        this.f22472a = context;
        this.f22473b = intent;
        this.f22474c = z10;
    }

    private final Intent a() {
        Intent launchIntentForPackage;
        if (!this.f22474c || (launchIntentForPackage = this.f22472a.getPackageManager().getLaunchIntentForPackage(this.f22472a.getPackageName())) == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    public final Intent b() {
        Intent intent = this.f22473b;
        return intent != null ? intent : a();
    }
}
