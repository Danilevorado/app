package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class ti0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f15850m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f15851n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ long f15852o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ long f15853p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f15854q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f15855r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ long f15856s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f15857t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ int f15858u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ int f15859v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ yi0 f15860w;

    ti0(yi0 yi0Var, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.f15860w = yi0Var;
        this.f15850m = str;
        this.f15851n = str2;
        this.f15852o = j10;
        this.f15853p = j11;
        this.f15854q = j12;
        this.f15855r = j13;
        this.f15856s = j14;
        this.f15857t = z10;
        this.f15858u = i10;
        this.f15859v = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f15850m);
        map.put("cachedSrc", this.f15851n);
        map.put("bufferedDuration", Long.toString(this.f15852o));
        map.put("totalDuration", Long.toString(this.f15853p));
        if (((Boolean) k3.w.c().b(ir.I1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f15854q));
            map.put("qoeCachedBytes", Long.toString(this.f15855r));
            map.put("totalBytes", Long.toString(this.f15856s));
            map.put("reportTime", Long.toString(j3.t.b().a()));
        }
        map.put("cacheReady", true != this.f15857t ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f15858u));
        map.put("playerPreparedCount", Integer.toString(this.f15859v));
        yi0.h(this.f15860w, "onPrecacheEvent", map);
    }
}
