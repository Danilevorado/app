package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ut0 implements nj, g21, l3.t, f21 {

    /* renamed from: m, reason: collision with root package name */
    private final pt0 f16443m;

    /* renamed from: n, reason: collision with root package name */
    private final qt0 f16444n;

    /* renamed from: p, reason: collision with root package name */
    private final a30 f16446p;

    /* renamed from: q, reason: collision with root package name */
    private final Executor f16447q;

    /* renamed from: r, reason: collision with root package name */
    private final i4.e f16448r;

    /* renamed from: o, reason: collision with root package name */
    private final Set f16445o = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f16449s = new AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    private final tt0 f16450t = new tt0();

    /* renamed from: u, reason: collision with root package name */
    private boolean f16451u = false;

    /* renamed from: v, reason: collision with root package name */
    private WeakReference f16452v = new WeakReference(this);

    public ut0(x20 x20Var, qt0 qt0Var, Executor executor, pt0 pt0Var, i4.e eVar) {
        this.f16443m = pt0Var;
        h20 h20Var = k20.f10786b;
        this.f16446p = x20Var.a("google.afma.activeView.handleUpdate", h20Var, h20Var);
        this.f16444n = qt0Var;
        this.f16447q = executor;
        this.f16448r = eVar;
    }

    private final void k() {
        Iterator it = this.f16445o.iterator();
        while (it.hasNext()) {
            this.f16443m.f((nk0) it.next());
        }
        this.f16443m.e();
    }

    @Override // l3.t
    public final void C(int i10) {
    }

    @Override // l3.t
    public final synchronized void L0() {
        this.f16450t.f16024b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final synchronized void U(mj mjVar) {
        tt0 tt0Var = this.f16450t;
        tt0Var.f16023a = mjVar.f12152j;
        tt0Var.f16028f = mjVar;
        a();
    }

    public final synchronized void a() {
        if (this.f16452v.get() == null) {
            h();
            return;
        }
        if (this.f16451u || !this.f16449s.get()) {
            return;
        }
        try {
            this.f16450t.f16026d = this.f16448r.b();
            final JSONObject jSONObjectA = this.f16444n.b(this.f16450t);
            for (final nk0 nk0Var : this.f16445o) {
                this.f16447q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.st0
                    @Override // java.lang.Runnable
                    public final void run() {
                        nk0Var.s0("AFMA_updateActiveView", jSONObjectA);
                    }
                });
            }
            rf0.b(this.f16446p.b(jSONObjectA), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e5) {
            m3.n1.l("Failed to call ActiveViewJS", e5);
        }
    }

    @Override // l3.t
    public final void b() {
    }

    @Override // l3.t
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final synchronized void d(Context context) {
        this.f16450t.f16027e = "u";
        a();
        k();
        this.f16451u = true;
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final synchronized void e(Context context) {
        this.f16450t.f16024b = false;
        a();
    }

    public final synchronized void f(nk0 nk0Var) {
        this.f16445o.add(nk0Var);
        this.f16443m.d(nk0Var);
    }

    public final void g(Object obj) {
        this.f16452v = new WeakReference(obj);
    }

    public final synchronized void h() {
        k();
        this.f16451u = true;
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final synchronized void l() {
        if (this.f16449s.compareAndSet(false, true)) {
            this.f16443m.c(this);
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.g21
    public final synchronized void o(Context context) {
        this.f16450t.f16024b = true;
        a();
    }

    @Override // l3.t
    public final synchronized void w0() {
        this.f16450t.f16024b = false;
        a();
    }

    @Override // l3.t
    public final void x4() {
    }
}
