package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ck1 {

    /* renamed from: a, reason: collision with root package name */
    private final j11 f6948a;

    /* renamed from: b, reason: collision with root package name */
    private final d91 f6949b;

    /* renamed from: c, reason: collision with root package name */
    private final t21 f6950c;

    /* renamed from: d, reason: collision with root package name */
    private final g31 f6951d;

    /* renamed from: e, reason: collision with root package name */
    private final t31 f6952e;

    /* renamed from: f, reason: collision with root package name */
    private final h61 f6953f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f6954g;

    /* renamed from: h, reason: collision with root package name */
    private final z81 f6955h;

    /* renamed from: i, reason: collision with root package name */
    private final ut0 f6956i;

    /* renamed from: j, reason: collision with root package name */
    private final j3.b f6957j;

    /* renamed from: k, reason: collision with root package name */
    private final zb0 f6958k;

    /* renamed from: l, reason: collision with root package name */
    private final bg f6959l;

    /* renamed from: m, reason: collision with root package name */
    private final y51 f6960m;

    /* renamed from: n, reason: collision with root package name */
    private final jy1 f6961n;

    /* renamed from: o, reason: collision with root package name */
    private final tu2 f6962o;

    /* renamed from: p, reason: collision with root package name */
    private final xm1 f6963p;

    /* renamed from: q, reason: collision with root package name */
    private final ws2 f6964q;

    public ck1(j11 j11Var, t21 t21Var, g31 g31Var, t31 t31Var, h61 h61Var, Executor executor, z81 z81Var, ut0 ut0Var, j3.b bVar, zb0 zb0Var, bg bgVar, y51 y51Var, jy1 jy1Var, tu2 tu2Var, xm1 xm1Var, ws2 ws2Var, d91 d91Var) {
        this.f6948a = j11Var;
        this.f6950c = t21Var;
        this.f6951d = g31Var;
        this.f6952e = t31Var;
        this.f6953f = h61Var;
        this.f6954g = executor;
        this.f6955h = z81Var;
        this.f6956i = ut0Var;
        this.f6957j = bVar;
        this.f6958k = zb0Var;
        this.f6959l = bgVar;
        this.f6960m = y51Var;
        this.f6961n = jy1Var;
        this.f6962o = tu2Var;
        this.f6963p = xm1Var;
        this.f6964q = ws2Var;
        this.f6949b = d91Var;
    }

    public static final ab3 j(nk0 nk0Var, String str, String str2) {
        final tf0 tf0Var = new tf0();
        nk0Var.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.ak1
            @Override // com.google.android.gms.internal.ads.am0
            public final void a(boolean z10) {
                tf0 tf0Var2 = tf0Var;
                if (z10) {
                    tf0Var2.e(null);
                } else {
                    tf0Var2.f(new Exception("Ad Web View failed to load."));
                }
            }
        });
        nk0Var.Y0(str, str2, null);
        return tf0Var;
    }

    final /* synthetic */ void c() {
        this.f6948a.O();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f6953f.A(str, str2);
    }

    final /* synthetic */ void e() {
        this.f6950c.b();
    }

    final /* synthetic */ void f(View view) {
        this.f6957j.a();
    }

    final /* synthetic */ void g(nk0 nk0Var, nk0 nk0Var2, Map map) {
        this.f6956i.f(nk0Var);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        this.f6957j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final nk0 nk0Var, boolean z10, iy iyVar) {
        xf xfVarC;
        nk0Var.G().R(new k3.a() { // from class: com.google.android.gms.internal.ads.sj1
            @Override // k3.a
            public final void O() {
                this.f15290m.c();
            }
        }, this.f6951d, this.f6952e, new zw() { // from class: com.google.android.gms.internal.ads.tj1
            @Override // com.google.android.gms.internal.ads.zw
            public final void A(String str, String str2) {
                this.f15873m.d(str, str2);
            }
        }, new l3.e0() { // from class: com.google.android.gms.internal.ads.uj1
            @Override // l3.e0
            public final void h() {
                this.f16366m.e();
            }
        }, z10, iyVar, this.f6957j, new bk1(this), this.f6958k, this.f6961n, this.f6962o, this.f6963p, this.f6964q, null, this.f6949b, null, null);
        nk0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.vj1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f16732m.h(view, motionEvent);
                return false;
            }
        });
        nk0Var.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.wj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17176m.f(view);
            }
        });
        if (((Boolean) k3.w.c().b(ir.f10014m2)).booleanValue() && (xfVarC = this.f6959l.c()) != null) {
            xfVarC.b((View) nk0Var);
        }
        this.f6955h.o0(nk0Var, this.f6954g);
        this.f6955h.o0(new nj() { // from class: com.google.android.gms.internal.ads.yj1
            @Override // com.google.android.gms.internal.ads.nj
            public final void U(mj mjVar) {
                cm0 cm0VarG = nk0Var.G();
                Rect rect = mjVar.f12146d;
                cm0VarG.l0(rect.left, rect.top, false);
            }
        }, this.f6954g);
        this.f6955h.r0((View) nk0Var);
        nk0Var.O0("/trackActiveViewUnit", new gy() { // from class: com.google.android.gms.internal.ads.zj1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f18606a.g(nk0Var, (nk0) obj, map);
            }
        });
        this.f6956i.g(nk0Var);
    }
}
