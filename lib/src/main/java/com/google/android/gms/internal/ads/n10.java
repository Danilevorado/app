package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class n10 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ y10 f12353m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ u00 f12354n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ ArrayList f12355o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ long f12356p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ z10 f12357q;

    n10(z10 z10Var, y10 y10Var, u00 u00Var, ArrayList arrayList, long j10) {
        this.f12357q = z10Var;
        this.f12353m = y10Var;
        this.f12354n = u00Var;
        this.f12355o = arrayList;
        this.f12356p = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        synchronized (this.f12357q.f18355a) {
            if (this.f12353m.a() != -1 && this.f12353m.a() != 1) {
                this.f12353m.c();
                bb3 bb3Var = of0.f13190e;
                final u00 u00Var = this.f12354n;
                bb3Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.m10
                    @Override // java.lang.Runnable
                    public final void run() {
                        u00Var.d();
                    }
                });
                String strValueOf = String.valueOf(k3.w.c().b(ir.f9914d));
                int iA = this.f12353m.a();
                int i10 = this.f12357q.f18363i;
                if (this.f12355o.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.f12355o.get(0));
                }
                m3.n1.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iA + ". Update status(fullLoadTimeout) is " + i10 + str + " ms. Total latency(fullLoadTimeout) is " + (j3.t.b().a() - this.f12356p) + " ms at timeout. Rejecting.");
            }
        }
    }
}
