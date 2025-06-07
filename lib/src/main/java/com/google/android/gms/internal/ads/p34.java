package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class p34 extends u34 {

    /* renamed from: a, reason: collision with root package name */
    final String f13539a;

    public p34(String str) {
        this.f13539a = str;
    }

    @Override // com.google.android.gms.internal.ads.u34
    public final void a(String str) {
        String str2 = this.f13539a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
