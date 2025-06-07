package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c10 implements u00, r00 {

    /* renamed from: m, reason: collision with root package name */
    private final nk0 f6756m;

    /* JADX WARN: Multi-variable type inference failed */
    public c10(Context context, ff0 ff0Var, bg bgVar, j3.a aVar) throws zk0 {
        j3.t.B();
        nk0 nk0VarA = al0.a(context, em0.a(), "", false, false, null, null, ff0Var, null, null, null, pm.a(), null, null);
        this.f6756m = nk0VarA;
        ((View) nk0VarA).setWillNotDraw(true);
    }

    private static final void t(Runnable runnable) {
        k3.t.b();
        if (se0.w()) {
            runnable.run();
        } else {
            m3.b2.f25197i.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.a20
    public final void C(String str, final gy gyVar) {
        this.f6756m.R0(str, new i4.n() { // from class: com.google.android.gms.internal.ads.w00
            @Override // i4.n
            public final boolean a(Object obj) {
                gy gyVar2 = (gy) obj;
                return (gyVar2 instanceof b10) && ((b10) gyVar2).f6305a.equals(gyVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void J(final String str) {
        t(new Runnable() { // from class: com.google.android.gms.internal.ads.y00
            @Override // java.lang.Runnable
            public final void run() {
                this.f17844m.f(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void Z(String str) {
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        t(new Runnable() { // from class: com.google.android.gms.internal.ads.z00
            @Override // java.lang.Runnable
            public final void run() {
                this.f18342m.r(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.p00
    public final /* synthetic */ void a(String str, JSONObject jSONObject) {
        q00.b(this, str, jSONObject);
    }

    final /* synthetic */ void b(String str) {
        this.f6756m.o(str);
    }

    @Override // com.google.android.gms.internal.ads.a20
    public final void b0(String str, gy gyVar) {
        this.f6756m.O0(str, new b10(this, gyVar));
    }

    @Override // com.google.android.gms.internal.ads.p00
    public final /* synthetic */ void c(String str, Map map) {
        q00.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void d() {
        this.f6756m.destroy();
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void e0(final String str) {
        t(new Runnable() { // from class: com.google.android.gms.internal.ads.a10
            @Override // java.lang.Runnable
            public final void run() {
                this.f5904m.l(str);
            }
        });
    }

    final /* synthetic */ void f(String str) {
        this.f6756m.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void f0(final j10 j10Var) {
        this.f6756m.G().i0(new bm0() { // from class: com.google.android.gms.internal.ads.v00
            @Override // com.google.android.gms.internal.ads.bm0
            public final void a() {
                j10 j10Var2 = j10Var;
                final z10 z10Var = j10Var2.f10252a;
                final ArrayList arrayList = j10Var2.f10253b;
                final long j10 = j10Var2.f10254c;
                final y10 y10Var = j10Var2.f10255d;
                final u00 u00Var = j10Var2.f10256e;
                arrayList.add(Long.valueOf(j3.t.b().a() - j10));
                m3.n1.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                m3.b2.f25197i.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.h10
                    @Override // java.lang.Runnable
                    public final void run() {
                        z10Var.i(y10Var, u00Var, arrayList, j10);
                    }
                }, (long) ((Integer) k3.w.c().b(ir.f9903c)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final boolean i() {
        return this.f6756m.B();
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final b20 j() {
        return new b20(this);
    }

    final /* synthetic */ void l(String str) {
        this.f6756m.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final void o(final String str) {
        t(new Runnable() { // from class: com.google.android.gms.internal.ads.x00
            @Override // java.lang.Runnable
            public final void run() {
                this.f17328m.b(str);
            }
        });
    }

    final /* synthetic */ void r(String str) {
        this.f6756m.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final /* synthetic */ void s0(String str, JSONObject jSONObject) {
        q00.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.d10
    public final /* synthetic */ void v(String str, String str2) {
        q00.c(this, str, str2);
    }
}
