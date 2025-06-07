package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class k10 implements gy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f10767a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y10 f10768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u00 f10769c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ z10 f10770d;

    k10(z10 z10Var, long j10, y10 y10Var, u00 u00Var) {
        this.f10770d = z10Var;
        this.f10767a = j10;
        this.f10768b = y10Var;
        this.f10769c = u00Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        m3.n1.k("onGmsg /jsLoaded. JsLoaded latency is " + (j3.t.b().a() - this.f10767a) + " ms.");
        synchronized (this.f10770d.f18355a) {
            if (this.f10768b.a() != -1 && this.f10768b.a() != 1) {
                this.f10770d.f18363i = 0;
                u00 u00Var = this.f10769c;
                u00Var.b0("/log", fy.f8482g);
                u00Var.b0("/result", fy.f8490o);
                this.f10768b.d(this.f10769c);
                this.f10770d.f18362h = this.f10768b;
                m3.n1.k("Successfully loaded JS Engine.");
            }
        }
    }
}
