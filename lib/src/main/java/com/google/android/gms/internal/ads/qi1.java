package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qi1 {

    /* renamed from: b, reason: collision with root package name */
    private final j3.a f14334b;

    /* renamed from: c, reason: collision with root package name */
    private final al0 f14335c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f14336d;

    /* renamed from: e, reason: collision with root package name */
    private final xm1 f14337e;

    /* renamed from: f, reason: collision with root package name */
    private final ws2 f14338f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f14339g;

    /* renamed from: h, reason: collision with root package name */
    private final bg f14340h;

    /* renamed from: i, reason: collision with root package name */
    private final ff0 f14341i;

    /* renamed from: k, reason: collision with root package name */
    private final jy1 f14343k;

    /* renamed from: l, reason: collision with root package name */
    private final tu2 f14344l;

    /* renamed from: m, reason: collision with root package name */
    private ab3 f14345m;

    /* renamed from: a, reason: collision with root package name */
    private final di1 f14333a = new di1();

    /* renamed from: j, reason: collision with root package name */
    private final uy f14342j = new uy();

    qi1(ni1 ni1Var) {
        this.f14336d = ni1Var.f12649c;
        this.f14339g = ni1Var.f12653g;
        this.f14340h = ni1Var.f12654h;
        this.f14341i = ni1Var.f12655i;
        this.f14334b = ni1Var.f12647a;
        this.f14335c = ni1Var.f12648b;
        this.f14343k = ni1Var.f12652f;
        this.f14344l = ni1Var.f12656j;
        this.f14337e = ni1Var.f12650d;
        this.f14338f = ni1Var.f12651e;
    }

    final /* synthetic */ nk0 a(nk0 nk0Var) {
        nk0Var.O0("/result", this.f14342j);
        cm0 cm0VarG = nk0Var.G();
        di1 di1Var = this.f14333a;
        cm0VarG.R(null, di1Var, di1Var, di1Var, di1Var, false, null, new j3.b(this.f14336d, null, null), null, null, this.f14343k, this.f14344l, this.f14337e, this.f14338f, null, null, null, null);
        return nk0Var;
    }

    final /* synthetic */ ab3 c(String str, JSONObject jSONObject, nk0 nk0Var) {
        return this.f14342j.b(nk0Var, str, jSONObject);
    }

    public final synchronized ab3 d(final String str, final JSONObject jSONObject) {
        ab3 ab3Var = this.f14345m;
        if (ab3Var == null) {
            return qa3.h(null);
        }
        return qa3.m(ab3Var, new w93() { // from class: com.google.android.gms.internal.ads.ei1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f7803a.c(str, jSONObject, (nk0) obj);
            }
        }, this.f14339g);
    }

    public final synchronized void e(hn2 hn2Var, ln2 ln2Var) {
        ab3 ab3Var = this.f14345m;
        if (ab3Var == null) {
            return;
        }
        qa3.q(ab3Var, new ki1(this, hn2Var, ln2Var), this.f14339g);
    }

    public final synchronized void f() {
        ab3 ab3Var = this.f14345m;
        if (ab3Var == null) {
            return;
        }
        qa3.q(ab3Var, new gi1(this), this.f14339g);
        this.f14345m = null;
    }

    public final synchronized void g(String str, Map map) {
        ab3 ab3Var = this.f14345m;
        if (ab3Var == null) {
            return;
        }
        qa3.q(ab3Var, new ji1(this, "sendMessageToNativeJs", map), this.f14339g);
    }

    public final synchronized void h() {
        final Context context = this.f14336d;
        final ff0 ff0Var = this.f14341i;
        final String str = (String) k3.w.c().b(ir.f10058q3);
        final bg bgVar = this.f14340h;
        final j3.a aVar = this.f14334b;
        ab3 ab3VarL = qa3.l(qa3.k(new v93() { // from class: com.google.android.gms.internal.ads.xk0
            @Override // com.google.android.gms.internal.ads.v93
            public final ab3 a() throws zk0 {
                Context context2 = context;
                bg bgVar2 = bgVar;
                ff0 ff0Var2 = ff0Var;
                j3.a aVar2 = aVar;
                String str2 = str;
                j3.t.B();
                nk0 nk0VarA = al0.a(context2, em0.a(), "", false, false, bgVar2, null, ff0Var2, null, null, aVar2, pm.a(), null, null);
                final sf0 sf0VarG = sf0.g(nk0VarA);
                nk0VarA.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.yk0
                    @Override // com.google.android.gms.internal.ads.am0
                    public final void a(boolean z10) {
                        sf0VarG.h();
                    }
                });
                nk0VarA.loadUrl(str2);
                return sf0VarG;
            }
        }, of0.f13190e), new w23() { // from class: com.google.android.gms.internal.ads.fi1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                nk0 nk0Var = (nk0) obj;
                this.f8290a.a(nk0Var);
                return nk0Var;
            }
        }, this.f14339g);
        this.f14345m = ab3VarL;
        rf0.a(ab3VarL, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void i(String str, gy gyVar) {
        ab3 ab3Var = this.f14345m;
        if (ab3Var == null) {
            return;
        }
        qa3.q(ab3Var, new hi1(this, str, gyVar), this.f14339g);
    }

    public final void j(WeakReference weakReference, String str, gy gyVar) {
        i(str, new pi1(this, weakReference, str, gyVar, null));
    }

    public final synchronized void k(String str, gy gyVar) {
        ab3 ab3Var = this.f14345m;
        if (ab3Var == null) {
            return;
        }
        qa3.q(ab3Var, new ii1(this, str, gyVar), this.f14339g);
    }
}
