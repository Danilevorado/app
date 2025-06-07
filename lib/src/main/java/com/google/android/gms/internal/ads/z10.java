package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z10 {

    /* renamed from: b, reason: collision with root package name */
    private final Context f18356b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18357c;

    /* renamed from: d, reason: collision with root package name */
    private final ff0 f18358d;

    /* renamed from: e, reason: collision with root package name */
    private final cu2 f18359e;

    /* renamed from: f, reason: collision with root package name */
    private final m3.d0 f18360f;

    /* renamed from: g, reason: collision with root package name */
    private final m3.d0 f18361g;

    /* renamed from: h, reason: collision with root package name */
    private y10 f18362h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f18355a = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f18363i = 1;

    public z10(Context context, ff0 ff0Var, String str, m3.d0 d0Var, m3.d0 d0Var2, cu2 cu2Var) {
        this.f18357c = str;
        this.f18356b = context.getApplicationContext();
        this.f18358d = ff0Var;
        this.f18359e = cu2Var;
        this.f18360f = d0Var;
        this.f18361g = d0Var2;
    }

    public final t10 b(bg bgVar) {
        synchronized (this.f18355a) {
            synchronized (this.f18355a) {
                y10 y10Var = this.f18362h;
                if (y10Var != null && this.f18363i == 0) {
                    y10Var.e(new xf0() { // from class: com.google.android.gms.internal.ads.e10
                        @Override // com.google.android.gms.internal.ads.xf0
                        public final void a(Object obj) {
                            this.f7587a.k((u00) obj);
                        }
                    }, new vf0() { // from class: com.google.android.gms.internal.ads.f10
                        @Override // com.google.android.gms.internal.ads.vf0
                        public final void a() {
                        }
                    });
                }
            }
            y10 y10Var2 = this.f18362h;
            if (y10Var2 != null && y10Var2.a() != -1) {
                int i10 = this.f18363i;
                if (i10 == 0) {
                    return this.f18362h.f();
                }
                if (i10 != 1) {
                    return this.f18362h.f();
                }
                this.f18363i = 2;
                d(null);
                return this.f18362h.f();
            }
            this.f18363i = 2;
            y10 y10VarD = d(null);
            this.f18362h = y10VarD;
            return y10VarD.f();
        }
    }

    protected final y10 d(bg bgVar) {
        ot2 ot2VarA = nt2.a(this.f18356b, 6);
        ot2VarA.g();
        final y10 y10Var = new y10(this.f18361g);
        final bg bgVar2 = null;
        of0.f13190e.execute(new Runnable(bgVar2, y10Var) { // from class: com.google.android.gms.internal.ads.i10

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ y10 f9481n;

            {
                this.f9481n = y10Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9480m.j(null, this.f9481n);
            }
        });
        y10Var.e(new o10(this, y10Var, ot2VarA), new p10(this, y10Var, ot2VarA));
        return y10Var;
    }

    final /* synthetic */ void i(y10 y10Var, final u00 u00Var, ArrayList arrayList, long j10) {
        synchronized (this.f18355a) {
            if (y10Var.a() != -1 && y10Var.a() != 1) {
                y10Var.c();
                of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g10
                    @Override // java.lang.Runnable
                    public final void run() {
                        u00Var.d();
                    }
                });
                m3.n1.k("Could not receive /jsLoaded in " + String.valueOf(k3.w.c().b(ir.f9903c)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + y10Var.a() + ". Update status(onEngLoadedTimeout) is " + this.f18363i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (j3.t.b().a() - j10) + " ms. Rejecting.");
            }
        }
    }

    final /* synthetic */ void j(bg bgVar, y10 y10Var) {
        long jA = j3.t.b().a();
        ArrayList arrayList = new ArrayList();
        try {
            c10 c10Var = new c10(this.f18356b, this.f18358d, null, null);
            c10Var.f0(new j10(this, arrayList, jA, y10Var, c10Var));
            c10Var.b0("/jsLoaded", new k10(this, jA, y10Var, c10Var));
            m3.d1 d1Var = new m3.d1();
            l10 l10Var = new l10(this, null, c10Var, d1Var);
            d1Var.b(l10Var);
            c10Var.b0("/requestReload", l10Var);
            if (this.f18357c.endsWith(".js")) {
                c10Var.Z(this.f18357c);
            } else if (this.f18357c.startsWith("<html>")) {
                c10Var.J(this.f18357c);
            } else {
                c10Var.e0(this.f18357c);
            }
            m3.b2.f25197i.postDelayed(new n10(this, y10Var, c10Var, arrayList, jA), ((Integer) k3.w.c().b(ir.f9914d)).intValue());
        } catch (Throwable th) {
            ze0.e("Error creating webview.", th);
            j3.t.q().u(th, "SdkJavascriptFactory.loadJavascriptEngine");
            y10Var.c();
        }
    }

    final /* synthetic */ void k(u00 u00Var) {
        if (u00Var.i()) {
            this.f18363i = 1;
        }
    }
}
