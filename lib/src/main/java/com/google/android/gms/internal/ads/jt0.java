package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class jt0 implements l11, a31, f21, k3.a, b21 {
    private boolean A;
    private final AtomicBoolean B = new AtomicBoolean();
    private final ns C;

    /* renamed from: m, reason: collision with root package name */
    private final Context f10699m;

    /* renamed from: n, reason: collision with root package name */
    private final Executor f10700n;

    /* renamed from: o, reason: collision with root package name */
    private final Executor f10701o;

    /* renamed from: p, reason: collision with root package name */
    private final ScheduledExecutorService f10702p;

    /* renamed from: q, reason: collision with root package name */
    private final un2 f10703q;

    /* renamed from: r, reason: collision with root package name */
    private final hn2 f10704r;

    /* renamed from: s, reason: collision with root package name */
    private final ou2 f10705s;

    /* renamed from: t, reason: collision with root package name */
    private final oo2 f10706t;

    /* renamed from: u, reason: collision with root package name */
    private final bg f10707u;

    /* renamed from: v, reason: collision with root package name */
    private final ls f10708v;

    /* renamed from: w, reason: collision with root package name */
    private final au2 f10709w;

    /* renamed from: x, reason: collision with root package name */
    private final WeakReference f10710x;

    /* renamed from: y, reason: collision with root package name */
    private final WeakReference f10711y;

    /* renamed from: z, reason: collision with root package name */
    private final m01 f10712z;

    jt0(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, un2 un2Var, hn2 hn2Var, ou2 ou2Var, oo2 oo2Var, View view, nk0 nk0Var, bg bgVar, ls lsVar, ns nsVar, au2 au2Var, m01 m01Var) {
        this.f10699m = context;
        this.f10700n = executor;
        this.f10701o = executor2;
        this.f10702p = scheduledExecutorService;
        this.f10703q = un2Var;
        this.f10704r = hn2Var;
        this.f10705s = ou2Var;
        this.f10706t = oo2Var;
        this.f10707u = bgVar;
        this.f10710x = new WeakReference(view);
        this.f10711y = new WeakReference(nk0Var);
        this.f10708v = lsVar;
        this.C = nsVar;
        this.f10709w = au2Var;
        this.f10712z = m01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        int i10;
        String strD = ((Boolean) k3.w.c().b(ir.f9918d3)).booleanValue() ? this.f10707u.c().d(this.f10699m, (View) this.f10710x.get(), null) : null;
        if ((((Boolean) k3.w.c().b(ir.f10023n0)).booleanValue() && this.f10703q.f16413b.f15924b.f11679g) || !((Boolean) bt.f6662h.e()).booleanValue()) {
            oo2 oo2Var = this.f10706t;
            ou2 ou2Var = this.f10705s;
            un2 un2Var = this.f10703q;
            hn2 hn2Var = this.f10704r;
            oo2Var.a(ou2Var.d(un2Var, hn2Var, false, strD, null, hn2Var.f9242d));
            return;
        }
        if (((Boolean) bt.f6661g.e()).booleanValue() && ((i10 = this.f10704r.f9238b) == 1 || i10 == 2 || i10 == 5)) {
        }
        qa3.q((ga3) qa3.n(ga3.D(qa3.h(null)), ((Long) k3.w.c().b(ir.R0)).longValue(), TimeUnit.MILLISECONDS, this.f10702p), new it0(this, strD), this.f10700n);
    }

    private final void u(final int i10, final int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.f10710x.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            t();
        } else {
            this.f10702p.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.ct0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7061m.r(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void D() {
        oo2 oo2Var = this.f10706t;
        ou2 ou2Var = this.f10705s;
        un2 un2Var = this.f10703q;
        hn2 hn2Var = this.f10704r;
        oo2Var.a(ou2Var.c(un2Var, hn2Var, hn2Var.f9250h));
    }

    @Override // k3.a
    public final void O() {
        if (!(((Boolean) k3.w.c().b(ir.f10023n0)).booleanValue() && this.f10703q.f16413b.f15924b.f11679g) && ((Boolean) bt.f6658d.e()).booleanValue()) {
            qa3.q(qa3.e(ga3.D(this.f10708v.a()), Throwable.class, new w23() { // from class: com.google.android.gms.internal.ads.dt0
                @Override // com.google.android.gms.internal.ads.w23
                public final Object a(Object obj) {
                    return "failure_click_attok";
                }
            }, of0.f13191f), new ht0(this), this.f10700n);
            return;
        }
        oo2 oo2Var = this.f10706t;
        ou2 ou2Var = this.f10705s;
        un2 un2Var = this.f10703q;
        hn2 hn2Var = this.f10704r;
        oo2Var.c(ou2Var.c(un2Var, hn2Var, hn2Var.f9240c), true == j3.t.q().x(this.f10699m) ? 2 : 1);
    }

    final /* synthetic */ void h() {
        this.f10700n.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8881m.t();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.f21
    public final void l() {
        if (this.B.compareAndSet(false, true)) {
            int iIntValue = ((Integer) k3.w.c().b(ir.f10004l3)).intValue();
            if (iIntValue > 0) {
                u(iIntValue, ((Integer) k3.w.c().b(ir.f10015m3)).intValue());
                return;
            }
            if (((Boolean) k3.w.c().b(ir.f9993k3)).booleanValue()) {
                this.f10701o.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ft0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8414m.h();
                    }
                });
            } else {
                t();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final synchronized void m() {
        oo2 oo2Var;
        List listC;
        m01 m01Var;
        if (this.A) {
            ArrayList arrayList = new ArrayList(this.f10704r.f9242d);
            arrayList.addAll(this.f10704r.f9248g);
            oo2Var = this.f10706t;
            listC = this.f10705s.d(this.f10703q, this.f10704r, true, null, null, arrayList);
        } else {
            oo2 oo2Var2 = this.f10706t;
            ou2 ou2Var = this.f10705s;
            un2 un2Var = this.f10703q;
            hn2 hn2Var = this.f10704r;
            oo2Var2.a(ou2Var.c(un2Var, hn2Var, hn2Var.f9262n));
            if (((Boolean) k3.w.c().b(ir.f9971i3)).booleanValue() && (m01Var = this.f10712z) != null) {
                this.f10706t.a(this.f10705s.c(this.f10712z.c(), this.f10712z.b(), ou2.g(m01Var.b().f9262n, m01Var.a().f())));
            }
            oo2Var = this.f10706t;
            ou2 ou2Var2 = this.f10705s;
            un2 un2Var2 = this.f10703q;
            hn2 hn2Var2 = this.f10704r;
            listC = ou2Var2.c(un2Var2, hn2Var2, hn2Var2.f9248g);
        }
        oo2Var.a(listC);
        this.A = true;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void n() {
    }

    final /* synthetic */ void o(int i10, int i11) {
        u(i10 - 1, i11);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void p() {
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void q() {
        oo2 oo2Var = this.f10706t;
        ou2 ou2Var = this.f10705s;
        un2 un2Var = this.f10703q;
        hn2 hn2Var = this.f10704r;
        oo2Var.a(ou2Var.c(un2Var, hn2Var, hn2Var.f9254j));
    }

    final /* synthetic */ void r(final int i10, final int i11) {
        this.f10700n.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.et0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7963m.o(i10, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void v(aa0 aa0Var, String str, String str2) {
        oo2 oo2Var = this.f10706t;
        ou2 ou2Var = this.f10705s;
        hn2 hn2Var = this.f10704r;
        oo2Var.a(ou2Var.e(hn2Var, hn2Var.f9252i, aa0Var));
    }

    @Override // com.google.android.gms.internal.ads.b21
    public final void v0(k3.w2 w2Var) {
        if (((Boolean) k3.w.c().b(ir.f10056q1)).booleanValue()) {
            this.f10706t.a(this.f10705s.c(this.f10703q, this.f10704r, ou2.f(2, w2Var.f24788m, this.f10704r.f9266p)));
        }
    }
}
