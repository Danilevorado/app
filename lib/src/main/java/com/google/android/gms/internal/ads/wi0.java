package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class wi0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f17136m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f17137n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ long f17138o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ yi0 f17139p;

    wi0(yi0 yi0Var, String str, String str2, long j10) {
        this.f17139p = yi0Var;
        this.f17136m = str;
        this.f17137n = str2;
        this.f17138o = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f17136m);
        map.put("cachedSrc", this.f17137n);
        map.put("totalDuration", Long.toString(this.f17138o));
        yi0.h(this.f17139p, "onPrecacheEvent", map);
    }
}
