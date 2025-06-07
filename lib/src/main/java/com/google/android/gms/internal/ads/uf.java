package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class uf implements xf {
    private static uf D;
    private volatile boolean A;
    private volatile boolean B;
    private final int C;

    /* renamed from: m, reason: collision with root package name */
    private final Context f16307m;

    /* renamed from: n, reason: collision with root package name */
    private final ty2 f16308n;

    /* renamed from: o, reason: collision with root package name */
    private final bz2 f16309o;

    /* renamed from: p, reason: collision with root package name */
    private final dz2 f16310p;

    /* renamed from: q, reason: collision with root package name */
    private final xg f16311q;

    /* renamed from: r, reason: collision with root package name */
    private final dx2 f16312r;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f16313s;

    /* renamed from: t, reason: collision with root package name */
    private final az2 f16314t;

    /* renamed from: v, reason: collision with root package name */
    private final nh f16316v;

    /* renamed from: w, reason: collision with root package name */
    private final eh f16317w;

    /* renamed from: x, reason: collision with root package name */
    private final vg f16318x;

    /* renamed from: y, reason: collision with root package name */
    volatile long f16319y = 0;

    /* renamed from: z, reason: collision with root package name */
    private final Object f16320z = new Object();

    /* renamed from: u, reason: collision with root package name */
    private final CountDownLatch f16315u = new CountDownLatch(1);

    uf(Context context, dx2 dx2Var, ty2 ty2Var, bz2 bz2Var, dz2 dz2Var, xg xgVar, Executor executor, yw2 yw2Var, int i10, nh nhVar, eh ehVar, vg vgVar) {
        this.B = false;
        this.f16307m = context;
        this.f16312r = dx2Var;
        this.f16308n = ty2Var;
        this.f16309o = bz2Var;
        this.f16310p = dz2Var;
        this.f16311q = xgVar;
        this.f16313s = executor;
        this.C = i10;
        this.f16316v = nhVar;
        this.f16317w = ehVar;
        this.f16318x = vgVar;
        this.B = false;
        this.f16314t = new sf(this, yw2Var);
    }

    public static synchronized uf i(String str, Context context, boolean z10, boolean z11) {
        return j(str, context, Executors.newCachedThreadPool(), z10, z11);
    }

    public static synchronized uf j(String str, Context context, Executor executor, boolean z10, boolean z11) {
        if (D == null) {
            ex2 ex2VarA = fx2.a();
            ex2VarA.a(str);
            ex2VarA.c(z10);
            fx2 fx2VarD = ex2VarA.d();
            dx2 dx2VarA = dx2.a(context, executor, z11);
            fg fgVarC = ((Boolean) k3.w.c().b(ir.W2)).booleanValue() ? fg.c(context) : null;
            nh nhVarD = ((Boolean) k3.w.c().b(ir.X2)).booleanValue() ? nh.d(context, executor) : null;
            eh ehVar = ((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue() ? new eh() : null;
            vg vgVar = ((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue() ? new vg() : null;
            xx2 xx2VarE = xx2.e(context, executor, dx2VarA, fx2VarD);
            wg wgVar = new wg(context);
            xg xgVar = new xg(fx2VarD, xx2VarE, new lh(context, wgVar), wgVar, fgVarC, nhVarD, ehVar, vgVar);
            int iB = gy2.b(context, dx2VarA);
            yw2 yw2Var = new yw2();
            uf ufVar = new uf(context, dx2VarA, new ty2(context, iB), new bz2(context, iB, new rf(dx2VarA), ((Boolean) k3.w.c().b(ir.X1)).booleanValue()), new dz2(context, xgVar, dx2VarA, yw2Var), xgVar, executor, yw2Var, iB, nhVarD, ehVar, vgVar);
            D = ufVar;
            ufVar.o();
            D.p();
        }
        return D;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[Catch: all -> 0x0115, ny3 -> 0x0117, TryCatch #1 {ny3 -> 0x0117, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:38:0x00d6, B:41:0x00e0, B:43:0x00e6, B:45:0x00ee, B:46:0x00f0, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:47:0x00fa, B:48:0x0103, B:49:0x010c), top: B:58:0x0021, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void n(com.google.android.gms.internal.ads.uf r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uf.n(com.google.android.gms.internal.ads.uf):void");
    }

    private final void s() {
        nh nhVar = this.f16316v;
        if (nhVar != null) {
            nhVar.h();
        }
    }

    private final sy2 t(int i10) {
        if (gy2.a(this.C)) {
            return ((Boolean) k3.w.c().b(ir.V1)).booleanValue() ? this.f16309o.c(1) : this.f16308n.c(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void a(MotionEvent motionEvent) {
        gx2 gx2VarA = this.f16310p.a();
        if (gx2VarA != null) {
            try {
                gx2VarA.b(null, motionEvent);
            } catch (cz2 e5) {
                this.f16312r.c(e5.a(), -1L, e5);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void b(View view) {
        this.f16311q.c(view);
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void c(StackTraceElement[] stackTraceElementArr) {
        vg vgVar = this.f16318x;
        if (vgVar != null) {
            vgVar.b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String d(Context context, View view, Activity activity) {
        s();
        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
            this.f16317w.k(context, view);
        }
        p();
        gx2 gx2VarA = this.f16310p.a();
        if (gx2VarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = gx2VarA.d(context, null, view, activity);
        this.f16312r.f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strD, null);
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String e(Context context) {
        s();
        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
            this.f16317w.j();
        }
        p();
        gx2 gx2VarA = this.f16310p.a();
        if (gx2VarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = gx2VarA.a(context, null);
        this.f16312r.f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strA, null);
        return strA;
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void f(int i10, int i11, int i12) {
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String h(Context context, String str, View view, Activity activity) {
        s();
        if (((Boolean) k3.w.c().b(ir.f10035o2)).booleanValue()) {
            this.f16317w.i();
        }
        p();
        gx2 gx2VarA = this.f16310p.a();
        if (gx2VarA == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = gx2VarA.c(context, null, str, view, activity);
        this.f16312r.f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strC, null);
        return strC;
    }

    final synchronized void o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        sy2 sy2VarT = t(1);
        if (sy2VarT == null) {
            this.f16312r.d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f16310p.c(sy2VarT)) {
            this.B = true;
            this.f16315u.countDown();
        }
    }

    public final void p() {
        if (this.A) {
            return;
        }
        synchronized (this.f16320z) {
            if (!this.A) {
                if ((System.currentTimeMillis() / 1000) - this.f16319y < 3600) {
                    return;
                }
                sy2 sy2VarB = this.f16310p.b();
                if ((sy2VarB == null || sy2VarB.d(3600L)) && gy2.a(this.C)) {
                    this.f16313s.execute(new tf(this));
                }
            }
        }
    }

    public final synchronized boolean r() {
        return this.B;
    }
}
