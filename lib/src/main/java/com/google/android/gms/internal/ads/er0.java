package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class er0 extends k3.j1 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f7938m;

    /* renamed from: n, reason: collision with root package name */
    private final ff0 f7939n;

    /* renamed from: o, reason: collision with root package name */
    private final qk1 f7940o;

    /* renamed from: p, reason: collision with root package name */
    private final cz1 f7941p;

    /* renamed from: q, reason: collision with root package name */
    private final l52 f7942q;

    /* renamed from: r, reason: collision with root package name */
    private final bp1 f7943r;

    /* renamed from: s, reason: collision with root package name */
    private final ed0 f7944s;

    /* renamed from: t, reason: collision with root package name */
    private final vk1 f7945t;

    /* renamed from: u, reason: collision with root package name */
    private final xp1 f7946u;

    /* renamed from: v, reason: collision with root package name */
    private final xt f7947v;

    /* renamed from: w, reason: collision with root package name */
    private final cu2 f7948w;

    /* renamed from: x, reason: collision with root package name */
    private final yo2 f7949x;

    /* renamed from: y, reason: collision with root package name */
    private final jr f7950y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7951z = false;

    er0(Context context, ff0 ff0Var, qk1 qk1Var, cz1 cz1Var, l52 l52Var, bp1 bp1Var, ed0 ed0Var, vk1 vk1Var, xp1 xp1Var, xt xtVar, cu2 cu2Var, yo2 yo2Var, jr jrVar) {
        this.f7938m = context;
        this.f7939n = ff0Var;
        this.f7940o = qk1Var;
        this.f7941p = cz1Var;
        this.f7942q = l52Var;
        this.f7943r = bp1Var;
        this.f7944s = ed0Var;
        this.f7945t = vk1Var;
        this.f7946u = xp1Var;
        this.f7947v = xtVar;
        this.f7948w = cu2Var;
        this.f7949x = yo2Var;
        this.f7950y = jrVar;
    }

    final /* synthetic */ void D() {
        this.f7947v.a(new g80());
    }

    @Override // k3.k1
    public final synchronized void K0(boolean z10) {
        j3.t.t().c(z10);
    }

    @Override // k3.k1
    public final void K3(k3.w1 w1Var) {
        this.f7946u.h(w1Var, wp1.API);
    }

    final void L5(Runnable runnable) {
        e4.p.e("Adapters must be initialized on the main thread.");
        Map mapE = j3.t.q().h().g().e();
        if (mapE.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                ze0.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f7940o.d()) {
            HashMap map = new HashMap();
            Iterator it = mapE.values().iterator();
            while (it.hasNext()) {
                for (i30 i30Var : ((j30) it.next()).f10270a) {
                    String str = i30Var.f9503k;
                    for (String str2 : i30Var.f9495c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    dz1 dz1VarA = this.f7941p.a(str3, jSONObject);
                    if (dz1VarA != null) {
                        ap2 ap2Var = (ap2) dz1VarA.f7558b;
                        if (!ap2Var.c() && ap2Var.b()) {
                            ap2Var.o(this.f7938m, (z02) dz1VarA.f7559c, (List) entry.getValue());
                            ze0.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (io2 e5) {
                    ze0.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e5);
                }
            }
        }
    }

    @Override // k3.k1
    public final void S0(b00 b00Var) {
        this.f7943r.s(b00Var);
    }

    @Override // k3.k1
    public final void V2(k3.q3 q3Var) {
        this.f7944s.v(this.f7938m, q3Var);
    }

    @Override // k3.k1
    public final void Z(String str) {
        this.f7942q.f(str);
    }

    final void b() {
        if (j3.t.q().h().I()) {
            if (j3.t.u().j(this.f7938m, j3.t.q().h().l(), this.f7939n.f8252m)) {
                return;
            }
            j3.t.q().h().u(false);
            j3.t.q().h().m("");
        }
    }

    @Override // k3.k1
    public final synchronized float c() {
        return j3.t.t().a();
    }

    @Override // k3.k1
    public final String e() {
        return this.f7939n.f8252m;
    }

    final /* synthetic */ void f() {
        ip2.b(this.f7938m, true);
    }

    @Override // k3.k1
    public final synchronized void g1(float f5) {
        j3.t.t().d(f5);
    }

    @Override // k3.k1
    public final List h() {
        return this.f7943r.g();
    }

    @Override // k3.k1
    public final void i() {
        this.f7943r.l();
    }

    @Override // k3.k1
    public final synchronized void k() {
        if (this.f7951z) {
            ze0.g("Mobile ads is initialized already.");
            return;
        }
        ir.a(this.f7938m);
        this.f7950y.a();
        j3.t.q().s(this.f7938m, this.f7939n);
        j3.t.e().i(this.f7938m);
        this.f7951z = true;
        this.f7943r.r();
        this.f7942q.d();
        if (((Boolean) k3.w.c().b(ir.E3)).booleanValue()) {
            this.f7945t.c();
        }
        this.f7946u.g();
        if (((Boolean) k3.w.c().b(ir.A8)).booleanValue()) {
            of0.f13186a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ar0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6219m.b();
                }
            });
        }
        if (((Boolean) k3.w.c().b(ir.f10042o9)).booleanValue()) {
            of0.f13186a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18698m.D();
                }
            });
        }
        if (((Boolean) k3.w.c().b(ir.f10134x2)).booleanValue()) {
            of0.f13186a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.br0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6646m.f();
                }
            });
        }
    }

    @Override // k3.k1
    public final void m0(String str) {
        if (((Boolean) k3.w.c().b(ir.J8)).booleanValue()) {
            j3.t.q().w(str);
        }
    }

    @Override // k3.k1
    public final void n1(o30 o30Var) {
        this.f7949x.e(o30Var);
    }

    @Override // k3.k1
    public final synchronized boolean v() {
        return j3.t.t().e();
    }

    @Override // k3.k1
    public final void w4(l4.a aVar, String str) {
        if (aVar == null) {
            ze0.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) l4.b.L0(aVar);
        if (context == null) {
            ze0.d("Context is null. Failed to open debug menu.");
            return;
        }
        m3.t tVar = new m3.t(context);
        tVar.n(str);
        tVar.o(this.f7939n.f8252m);
        tVar.r();
    }

    @Override // k3.k1
    public final void x0(boolean z10) throws RemoteException {
        try {
            g03.j(this.f7938m).o(z10);
        } catch (IOException e5) {
            throw new RemoteException(e5.getMessage());
        }
    }

    @Override // k3.k1
    public final void x3(String str, l4.a aVar) throws JSONException {
        String strJ;
        Runnable runnable;
        ir.a(this.f7938m);
        if (((Boolean) k3.w.c().b(ir.I3)).booleanValue()) {
            j3.t.r();
            strJ = m3.b2.J(this.f7938m);
        } else {
            strJ = "";
        }
        boolean z10 = true;
        String str2 = true == TextUtils.isEmpty(strJ) ? str : strJ;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) k3.w.c().b(ir.D3)).booleanValue();
        zq zqVar = ir.M0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) k3.w.c().b(zqVar)).booleanValue();
        if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) l4.b.L0(aVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.cr0
                @Override // java.lang.Runnable
                public final void run() {
                    final er0 er0Var = this.f7042m;
                    final Runnable runnable3 = runnable2;
                    of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dr0
                        @Override // java.lang.Runnable
                        public final void run() {
                            er0Var.L5(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z10 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z10) {
            j3.t.c().a(this.f7938m, this.f7939n, str2, runnable3, this.f7948w);
        }
    }

    @Override // k3.k1
    public final synchronized void y0(String str) {
        ir.a(this.f7938m);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) k3.w.c().b(ir.D3)).booleanValue()) {
                j3.t.c().a(this.f7938m, this.f7939n, str, null, this.f7948w);
            }
        }
    }
}
