package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nv1 extends v80 {

    /* renamed from: m, reason: collision with root package name */
    private final Context f12870m;

    /* renamed from: n, reason: collision with root package name */
    private final bb3 f12871n;

    /* renamed from: o, reason: collision with root package name */
    private final fw1 f12872o;

    /* renamed from: p, reason: collision with root package name */
    private final cs0 f12873p;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque f12874q;

    /* renamed from: r, reason: collision with root package name */
    private final cu2 f12875r;

    /* renamed from: s, reason: collision with root package name */
    private final w90 f12876s;

    /* renamed from: t, reason: collision with root package name */
    private final cw1 f12877t;

    public nv1(Context context, bb3 bb3Var, w90 w90Var, cs0 cs0Var, fw1 fw1Var, ArrayDeque arrayDeque, cw1 cw1Var, cu2 cu2Var) {
        ir.a(context);
        this.f12870m = context;
        this.f12871n = bb3Var;
        this.f12876s = w90Var;
        this.f12872o = fw1Var;
        this.f12873p = cs0Var;
        this.f12874q = arrayDeque;
        this.f12877t = cw1Var;
        this.f12875r = cu2Var;
    }

    private final synchronized kv1 Q5(String str) {
        Iterator it = this.f12874q.iterator();
        while (it.hasNext()) {
            kv1 kv1Var = (kv1) it.next();
            if (kv1Var.f11248c.equals(str)) {
                it.remove();
                return kv1Var;
            }
        }
        return null;
    }

    private static ab3 R5(ab3 ab3Var, ls2 ls2Var, n20 n20Var, au2 au2Var, ot2 ot2Var) {
        d20 d20VarA = n20Var.a("AFMA_getAdDictionary", k20.f10786b, new f20() { // from class: com.google.android.gms.internal.ads.dv1
            @Override // com.google.android.gms.internal.ads.f20
            public final Object a(JSONObject jSONObject) {
                return new n90(jSONObject);
            }
        });
        zt2.d(ab3Var, ot2Var);
        qr2 qr2VarA = ls2Var.b(fs2.BUILD_URL, ab3Var).f(d20VarA).a();
        zt2.c(qr2VarA, au2Var, ot2Var);
        return qr2VarA;
    }

    private static ab3 S5(k90 k90Var, ls2 ls2Var, final df2 df2Var) {
        w93 w93Var = new w93() { // from class: com.google.android.gms.internal.ads.xu1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return df2Var.b().a(k3.t.b().j((Bundle) obj));
            }
        };
        return ls2Var.b(fs2.GMS_SIGNALS, qa3.h(k90Var.f10913m)).f(w93Var).e(new nr2() { // from class: com.google.android.gms.internal.ads.yu1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                m3.n1.k("Ad request signals:");
                m3.n1.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void T5(kv1 kv1Var) {
        p();
        this.f12874q.addLast(kv1Var);
    }

    private final void U5(ab3 ab3Var, f90 f90Var) {
        qa3.q(qa3.m(ab3Var, new w93() { // from class: com.google.android.gms.internal.ads.gv1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h(ep2.a((InputStream) obj));
            }
        }, of0.f13186a), new jv1(this, f90Var), of0.f13191f);
    }

    private final synchronized void p() {
        int iIntValue = ((Long) kt.f11216d.e()).intValue();
        while (this.f12874q.size() >= iIntValue) {
            this.f12874q.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void D3(String str, f90 f90Var) {
        U5(O5(str), f90Var);
    }

    public final ab3 L5(final k90 k90Var, int i10) {
        if (!((Boolean) kt.f11213a.e()).booleanValue()) {
            return qa3.g(new Exception("Split request is disabled."));
        }
        zp2 zp2Var = k90Var.f10921u;
        if (zp2Var == null) {
            return qa3.g(new Exception("Pool configuration missing from request."));
        }
        if (zp2Var.f18686q == 0 || zp2Var.f18687r == 0) {
            return qa3.g(new Exception("Caching is disabled."));
        }
        n20 n20VarB = j3.t.h().b(this.f12870m, ff0.f(), this.f12875r);
        df2 df2VarA = this.f12873p.a(k90Var, i10);
        ls2 ls2VarC = df2VarA.c();
        final ab3 ab3VarS5 = S5(k90Var, ls2VarC, df2VarA);
        au2 au2VarD = df2VarA.d();
        final ot2 ot2VarA = nt2.a(this.f12870m, 9);
        final ab3 ab3VarR5 = R5(ab3VarS5, ls2VarC, n20VarB, au2VarD, ot2VarA);
        return ls2VarC.a(fs2.GET_URL_AND_CACHE_KEY, ab3VarS5, ab3VarR5).a(new Callable() { // from class: com.google.android.gms.internal.ads.cv1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7087a.P5(ab3VarR5, ab3VarS5, k90Var, ot2VarA);
            }
        }).a();
    }

    public final ab3 M5(k90 k90Var, int i10) {
        String str;
        tr2 tr2VarA;
        Callable callable;
        n20 n20VarB = j3.t.h().b(this.f12870m, ff0.f(), this.f12875r);
        df2 df2VarA = this.f12873p.a(k90Var, i10);
        d20 d20VarA = n20VarB.a("google.afma.response.normalize", mv1.f12259d, k20.f10787c);
        kv1 kv1VarQ5 = null;
        if (((Boolean) kt.f11213a.e()).booleanValue()) {
            kv1VarQ5 = Q5(k90Var.f10920t);
            if (kv1VarQ5 == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                m3.n1.k(str);
            }
        } else {
            String str2 = k90Var.f10922v;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                m3.n1.k(str);
            }
        }
        ot2 ot2VarA = kv1VarQ5 == null ? nt2.a(this.f12870m, 9) : kv1VarQ5.f11250e;
        au2 au2VarD = df2VarA.d();
        au2VarD.d(k90Var.f10913m.getStringArrayList("ad_types"));
        ew1 ew1Var = new ew1(k90Var.f10919s, au2VarD, ot2VarA);
        bw1 bw1Var = new bw1(this.f12870m, k90Var.f10914n.f8252m, this.f12876s, i10);
        ls2 ls2VarC = df2VarA.c();
        ot2 ot2VarA2 = nt2.a(this.f12870m, 11);
        if (kv1VarQ5 == null) {
            final ab3 ab3VarS5 = S5(k90Var, ls2VarC, df2VarA);
            final ab3 ab3VarR5 = R5(ab3VarS5, ls2VarC, n20VarB, au2VarD, ot2VarA);
            ot2 ot2VarA3 = nt2.a(this.f12870m, 10);
            final qr2 qr2VarA = ls2VarC.a(fs2.HTTP, ab3VarR5, ab3VarS5).a(new Callable() { // from class: com.google.android.gms.internal.ads.av1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new dw1((JSONObject) ab3VarS5.get(), (n90) ab3VarR5.get());
                }
            }).e(ew1Var).e(new vt2(ot2VarA3)).e(bw1Var).a();
            zt2.a(qr2VarA, au2VarD, ot2VarA3);
            zt2.d(qr2VarA, ot2VarA2);
            tr2VarA = ls2VarC.a(fs2.PRE_PROCESS, ab3VarS5, ab3VarR5, qr2VarA);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.bv1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new mv1((aw1) qr2VarA.get(), (JSONObject) ab3VarS5.get(), (n90) ab3VarR5.get());
                }
            };
        } else {
            dw1 dw1Var = new dw1(kv1VarQ5.f11247b, kv1VarQ5.f11246a);
            ot2 ot2VarA4 = nt2.a(this.f12870m, 10);
            final qr2 qr2VarA2 = ls2VarC.b(fs2.HTTP, qa3.h(dw1Var)).e(ew1Var).e(new vt2(ot2VarA4)).e(bw1Var).a();
            zt2.a(qr2VarA2, au2VarD, ot2VarA4);
            final ab3 ab3VarH = qa3.h(kv1VarQ5);
            zt2.d(qr2VarA2, ot2VarA2);
            tr2VarA = ls2VarC.a(fs2.PRE_PROCESS, qr2VarA2, ab3VarH);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.fv1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ab3 ab3Var = qr2VarA2;
                    ab3 ab3Var2 = ab3VarH;
                    return new mv1((aw1) ab3Var.get(), ((kv1) ab3Var2.get()).f11247b, ((kv1) ab3Var2.get()).f11246a);
                }
            };
        }
        qr2 qr2VarA3 = tr2VarA.a(callable).f(d20VarA).a();
        zt2.a(qr2VarA3, au2VarD, ot2VarA2);
        return qr2VarA3;
    }

    public final ab3 N5(k90 k90Var, int i10) {
        n20 n20VarB = j3.t.h().b(this.f12870m, ff0.f(), this.f12875r);
        if (!((Boolean) pt.f14035a.e()).booleanValue()) {
            return qa3.g(new Exception("Signal collection disabled."));
        }
        df2 df2VarA = this.f12873p.a(k90Var, i10);
        final ne2 ne2VarA = df2VarA.a();
        d20 d20VarA = n20VarB.a("google.afma.request.getSignals", k20.f10786b, k20.f10787c);
        ot2 ot2VarA = nt2.a(this.f12870m, 22);
        qr2 qr2VarA = df2VarA.c().b(fs2.GET_SIGNALS, qa3.h(k90Var.f10913m)).e(new vt2(ot2VarA)).f(new w93() { // from class: com.google.android.gms.internal.ads.ev1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return ne2VarA.a(k3.t.b().j((Bundle) obj));
            }
        }).b(fs2.JS_SIGNALS).f(d20VarA).a();
        au2 au2VarD = df2VarA.d();
        au2VarD.d(k90Var.f10913m.getStringArrayList("ad_types"));
        zt2.b(qr2VarA, au2VarD, ot2VarA);
        if (((Boolean) ct.f7060e.e()).booleanValue()) {
            fw1 fw1Var = this.f12872o;
            fw1Var.getClass();
            qr2VarA.b(new zu1(fw1Var), this.f12871n);
        }
        return qr2VarA;
    }

    public final ab3 O5(String str) {
        if (((Boolean) kt.f11213a.e()).booleanValue()) {
            return Q5(str) == null ? qa3.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : qa3.h(new hv1(this));
        }
        return qa3.g(new Exception("Split request is disabled."));
    }

    final /* synthetic */ InputStream P5(ab3 ab3Var, ab3 ab3Var2, k90 k90Var, ot2 ot2Var) {
        String strC = ((n90) ab3Var.get()).c();
        T5(new kv1((n90) ab3Var.get(), (JSONObject) ab3Var2.get(), k90Var.f10920t, strC, ot2Var));
        return new ByteArrayInputStream(strC.getBytes(u23.f16142c));
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void Q2(k90 k90Var, f90 f90Var) {
        U5(N5(k90Var, Binder.getCallingUid()), f90Var);
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void R1(k90 k90Var, f90 f90Var) {
        ab3 ab3VarM5 = M5(k90Var, Binder.getCallingUid());
        U5(ab3VarM5, f90Var);
        if (((Boolean) ct.f7058c.e()).booleanValue()) {
            fw1 fw1Var = this.f12872o;
            fw1Var.getClass();
            ab3VarM5.b(new zu1(fw1Var), this.f12871n);
        }
    }

    @Override // com.google.android.gms.internal.ads.w80
    public final void e4(k90 k90Var, f90 f90Var) {
        U5(L5(k90Var, Binder.getCallingUid()), f90Var);
    }
}
