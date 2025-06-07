package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class ui0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f16349m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f16350n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f16351o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ int f16352p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f16353q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f16354r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ boolean f16355s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f16356t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ int f16357u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ yi0 f16358v;

    ui0(yi0 yi0Var, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.f16358v = yi0Var;
        this.f16349m = str;
        this.f16350n = str2;
        this.f16351o = i10;
        this.f16352p = i11;
        this.f16353q = j10;
        this.f16354r = j11;
        this.f16355s = z10;
        this.f16356t = i12;
        this.f16357u = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f16349m);
        map.put("cachedSrc", this.f16350n);
        map.put("bytesLoaded", Integer.toString(this.f16351o));
        map.put("totalBytes", Integer.toString(this.f16352p));
        map.put("bufferedDuration", Long.toString(this.f16353q));
        map.put("totalDuration", Long.toString(this.f16354r));
        map.put("cacheReady", true != this.f16355s ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f16356t));
        map.put("playerPreparedCount", Integer.toString(this.f16357u));
        yi0.h(this.f16358v, "onPrecacheEvent", map);
    }
}
