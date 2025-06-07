package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class si0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f15266m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f15267n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f15268o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ int f15269p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ yi0 f15270q;

    si0(yi0 yi0Var, String str, String str2, int i10, int i11, boolean z10) {
        this.f15270q = yi0Var;
        this.f15266m = str;
        this.f15267n = str2;
        this.f15268o = i10;
        this.f15269p = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f15266m);
        map.put("cachedSrc", this.f15267n);
        map.put("bytesLoaded", Integer.toString(this.f15268o));
        map.put("totalBytes", Integer.toString(this.f15269p));
        map.put("cacheReady", "0");
        yi0.h(this.f15270q, "onPrecacheEvent", map);
    }
}
