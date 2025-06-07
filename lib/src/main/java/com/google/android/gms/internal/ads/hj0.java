package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class hj0 extends yi0 implements bh0 {

    /* renamed from: p, reason: collision with root package name */
    private ch0 f9150p;

    /* renamed from: q, reason: collision with root package name */
    private String f9151q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9152r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9153s;

    /* renamed from: t, reason: collision with root package name */
    private qi0 f9154t;

    /* renamed from: u, reason: collision with root package name */
    private long f9155u;

    /* renamed from: v, reason: collision with root package name */
    private long f9156v;

    public hj0(lh0 lh0Var, kh0 kh0Var) {
        super(lh0Var);
        ak0 ak0Var = new ak0(lh0Var.getContext(), kh0Var, (lh0) this.f18054o.get(), null);
        ze0.f("ExoPlayerAdapter initialized.");
        this.f9150p = ak0Var;
        ak0Var.C(this);
    }

    protected static final String B(String str) {
        return "cache:".concat(String.valueOf(se0.g(str)));
    }

    private static String C(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void D(long j10) {
        m3.b2.f25197i.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.gj0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f8757m.A();
            }
        }, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.hj0, com.google.android.gms.internal.ads.yi0] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.hj0] */
    /* JADX WARN: Type inference failed for: r2v30 */
    final /* synthetic */ void A() throws Throwable {
        String str;
        hj0 hj0VarBooleanValue;
        hj0 hj0Var;
        gr grVarC;
        long jLongValue;
        long jIntValue;
        hj0 hj0Var2;
        long j10;
        long j11;
        String str2;
        long j12;
        String strB = B(this.f9151q);
        String str3 = "error";
        try {
            zq zqVar = ir.f10131x;
            grVarC = k3.w.c();
            jLongValue = ((Long) grVarC.b(zqVar)).longValue() * 1000;
            jIntValue = ((Integer) k3.w.c().b(ir.f10120w)).intValue();
            hj0VarBooleanValue = ((Boolean) k3.w.c().b(ir.I1)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e5) {
            e = e5;
            str = strB;
            hj0VarBooleanValue = this;
        }
        synchronized (this) {
            try {
                long jA = j3.t.b().a();
                long j13 = this.f9155u;
                if (jA - j13 <= jLongValue) {
                    try {
                        if (this.f9152r) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.f9153s) {
                            if (!this.f9150p.M()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jV = this.f9150p.V();
                            if (jV > 0) {
                                long jR = this.f9150p.R();
                                if (jR != this.f9156v) {
                                    try {
                                        j11 = jIntValue;
                                        str2 = strB;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hj0VarBooleanValue = this;
                                        str = strB;
                                    }
                                    try {
                                        q(this.f9151q, strB, jR, jV, jR > 0, hj0VarBooleanValue != 0 ? this.f9150p.r() : -1L, hj0VarBooleanValue != 0 ? this.f9150p.T() : -1L, hj0VarBooleanValue != 0 ? this.f9150p.s() : -1L, ch0.O(), ch0.Q());
                                        hj0VarBooleanValue = this;
                                        j10 = jR;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        hj0VarBooleanValue = this;
                                        str = str2;
                                        throw th;
                                    }
                                    try {
                                        hj0VarBooleanValue.f9156v = j10;
                                        j12 = jV;
                                        hj0VarBooleanValue = hj0VarBooleanValue;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str = str2;
                                        throw th;
                                    }
                                } else {
                                    j10 = jR;
                                    j11 = jIntValue;
                                    str2 = strB;
                                    hj0VarBooleanValue = this;
                                    j12 = jV;
                                }
                                if (j10 >= j12) {
                                    hj0VarBooleanValue.o(hj0VarBooleanValue.f9151q, str2, j12);
                                } else {
                                    long jS = hj0VarBooleanValue.f9150p.S();
                                    hj0Var2 = hj0VarBooleanValue;
                                    if (jS >= j11) {
                                        hj0Var2 = hj0VarBooleanValue;
                                        if (j10 > 0) {
                                        }
                                    }
                                }
                                hj0Var = hj0VarBooleanValue;
                            } else {
                                hj0Var2 = this;
                            }
                            hj0Var2.D(((Long) k3.w.c().b(ir.f10142y)).longValue());
                            return;
                        }
                        hj0Var = this;
                        j3.t.A().h(hj0Var.f9154t);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = grVarC;
                        str = j13;
                    }
                } else {
                    str = strB;
                    hj0VarBooleanValue = this;
                    try {
                        throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = strB;
                hj0VarBooleanValue = this;
            }
            try {
                throw th;
            } catch (Exception e10) {
                e = e10;
                String str4 = str3;
                ze0.g("Failed to preload url " + hj0VarBooleanValue.f9151q + " Exception: " + e.getMessage());
                j3.t.q().t(e, "VideoStreamExoPlayerCache.preload");
                b();
                hj0VarBooleanValue.l(hj0VarBooleanValue.f9151q, str, str4, C(str4, e));
                hj0Var = hj0VarBooleanValue;
                j3.t.A().h(hj0Var.f9154t);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void a(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.yi0, c4.d
    public final void b() {
        ch0 ch0Var = this.f9150p;
        if (ch0Var != null) {
            ch0Var.C(null);
            this.f9150p.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void d(int i10, int i11) {
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void e(String str, Exception exc) {
        ze0.h("Precache exception", exc);
        j3.t.q().t(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void f(final boolean z10, final long j10) {
        final lh0 lh0Var = (lh0) this.f18054o.get();
        if (lh0Var != null) {
            of0.f13190e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fj0
                @Override // java.lang.Runnable
                public final void run() {
                    lh0Var.r0(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void g(String str, Exception exc) {
        ze0.h("Precache error", exc);
        j3.t.q().t(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void j() {
        synchronized (this) {
            this.f9152r = true;
            notify();
            b();
        }
        String str = this.f9151q;
        if (str != null) {
            l(this.f9151q, B(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void r(int i10) {
        this.f9150p.A(i10);
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void s(int i10) {
        this.f9150p.B(i10);
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void t(int i10) {
        this.f9150p.D(i10);
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void u(int i10) {
        this.f9150p.E(i10);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void v() {
        ze0.g("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final boolean w(String str) {
        return x(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.yi0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.yi0
    public final boolean x(String str, String[] strArr) throws Throwable {
        ?? r62;
        String str2;
        ?? r52;
        long j10;
        long j11;
        long j12;
        ?? r12;
        long j13;
        String str3;
        long j14;
        long j15;
        hj0 hj0Var = this;
        String str4 = str;
        hj0Var.f9151q = str4;
        String str5 = "error";
        String strB = B(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            hj0Var.f9150p.w(uriArr, hj0Var.f18053n);
            lh0 lh0Var = (lh0) hj0Var.f18054o.get();
            if (lh0Var != null) {
                lh0Var.F(strB, hj0Var);
            }
            i4.e eVarB = j3.t.b();
            long jA = eVarB.a();
            long jLongValue = ((Long) k3.w.c().b(ir.f10142y)).longValue();
            long jLongValue2 = ((Long) k3.w.c().b(ir.f10131x)).longValue() * 1000;
            long jIntValue = ((Integer) k3.w.c().b(ir.f10120w)).intValue();
            boolean zBooleanValue = ((Boolean) k3.w.c().b(ir.I1)).booleanValue();
            long j16 = -1;
            long j17 = jIntValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (eVarB.a() - jA > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (hj0Var.f9152r) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (hj0Var.f9153s) {
                            break;
                        }
                        if (!hj0Var.f9150p.M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jV = hj0Var.f9150p.V();
                        if (jV > 0) {
                            long jR = hj0Var.f9150p.R();
                            if (jR != j16) {
                                try {
                                    j10 = j17;
                                    long j18 = jV;
                                    j11 = jLongValue2;
                                    j13 = jLongValue;
                                    str3 = strB;
                                    try {
                                        q(str, strB, jR, j18, jR > 0, zBooleanValue ? hj0Var.f9150p.r() : -1L, zBooleanValue ? hj0Var.f9150p.T() : -1L, zBooleanValue ? hj0Var.f9150p.s() : -1L, ch0.O(), ch0.Q());
                                        j15 = jR;
                                        j14 = jV;
                                        r62 = j18;
                                    } catch (Throwable th) {
                                        th = th;
                                        r52 = this;
                                        r62 = str;
                                        str2 = str3;
                                        try {
                                            throw th;
                                        } catch (Exception e5) {
                                            e = e5;
                                            String str6 = str5;
                                            ze0.g("Failed to preload url " + r62 + " Exception: " + e.getMessage());
                                            j3.t.q().t(e, "VideoStreamExoPlayerCache.preload");
                                            b();
                                            r52.l(r62, str2, str6, C(str6, e));
                                            return false;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r52 = this;
                                    r62 = str;
                                    str2 = strB;
                                }
                            } else {
                                j10 = j17;
                                j11 = jLongValue2;
                                j13 = jLongValue;
                                str3 = strB;
                                j14 = jV;
                                j15 = j16;
                                r62 = j17;
                            }
                            r52 = (jR > j14 ? 1 : (jR == j14 ? 0 : -1));
                            if (r52 >= 0) {
                                o(str, str3, j14);
                                break;
                            }
                            try {
                                hj0 hj0Var2 = this;
                                r62 = str;
                                str2 = str3;
                                if (hj0Var2.f9150p.S() >= j10 && jR > 0) {
                                    break;
                                }
                                j12 = j13;
                                r12 = j15;
                                r52 = hj0Var2;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } else {
                            j10 = j17;
                            j11 = jLongValue2;
                            r62 = str4;
                            str2 = strB;
                            r52 = hj0Var;
                            j12 = jLongValue;
                            r12 = j16;
                        }
                        try {
                            try {
                                r52.wait(j12);
                            } catch (Throwable th4) {
                                th = th4;
                                str5 = r12;
                                throw th;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r62 = str4;
                        str2 = strB;
                        r52 = hj0Var;
                    }
                }
                jLongValue = j12;
                hj0Var = r52;
                str4 = r62;
                strB = str2;
                j17 = j10;
                jLongValue2 = j11;
                j16 = r12;
            }
            return true;
        } catch (Exception e10) {
            e = e10;
            r62 = str4;
            str2 = strB;
            r52 = hj0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final boolean y(String str, String[] strArr, qi0 qi0Var) {
        this.f9151q = str;
        this.f9154t = qi0Var;
        String strB = B(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.f9150p.w(uriArr, this.f18053n);
            lh0 lh0Var = (lh0) this.f18054o.get();
            if (lh0Var != null) {
                lh0Var.F(strB, this);
            }
            this.f9155u = j3.t.b().a();
            this.f9156v = -1L;
            D(0L);
            return true;
        } catch (Exception e5) {
            ze0.g("Failed to preload url " + str + " Exception: " + e5.getMessage());
            j3.t.q().t(e5, "VideoStreamExoPlayerCache.preload");
            b();
            l(str, strB, "error", C("error", e5));
            return false;
        }
    }

    public final ch0 z() {
        synchronized (this) {
            this.f9153s = true;
            notify();
        }
        this.f9150p.C(null);
        ch0 ch0Var = this.f9150p;
        this.f9150p = null;
        return ch0Var;
    }
}
