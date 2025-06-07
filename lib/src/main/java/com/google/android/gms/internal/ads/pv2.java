package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class pv2 {

    /* renamed from: b, reason: collision with root package name */
    private static final pv2 f14066b = new pv2();

    /* renamed from: a, reason: collision with root package name */
    private Context f14067a;

    private pv2() {
    }

    public static pv2 b() {
        return f14066b;
    }

    public final Context a() {
        return this.f14067a;
    }

    public final void c(Context context) {
        this.f14067a = context != null ? context.getApplicationContext() : null;
    }
}
