package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class vi0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f16718m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f16719n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f16720o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ yi0 f16721p;

    vi0(yi0 yi0Var, String str, String str2, int i10) {
        this.f16721p = yi0Var;
        this.f16718m = str;
        this.f16719n = str2;
        this.f16720o = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f16718m);
        map.put("cachedSrc", this.f16719n);
        map.put("totalBytes", Integer.toString(this.f16720o));
        yi0.h(this.f16721p, "onPrecacheEvent", map);
    }
}
