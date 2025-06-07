package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes.dex */
public final class rb4 implements vb4 {

    /* renamed from: h, reason: collision with root package name */
    public static final z33 f14729h = new z33() { // from class: com.google.android.gms.internal.ads.pb4
        @Override // com.google.android.gms.internal.ads.z33
        public final Object a() {
            return rb4.l();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Random f14730i = new Random();

    /* renamed from: d, reason: collision with root package name */
    private final z33 f14734d;

    /* renamed from: e, reason: collision with root package name */
    private ub4 f14735e;

    /* renamed from: g, reason: collision with root package name */
    private String f14737g;

    /* renamed from: a, reason: collision with root package name */
    private final g01 f14731a = new g01();

    /* renamed from: b, reason: collision with root package name */
    private final ey0 f14732b = new ey0();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f14733c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private h11 f14736f = h11.f8946a;

    public rb4(z33 z33Var) {
        this.f14734d = z33Var;
    }

    private final qb4 k(int i10, hh4 hh4Var) {
        long j10 = Long.MAX_VALUE;
        qb4 qb4Var = null;
        for (qb4 qb4Var2 : this.f14733c.values()) {
            qb4Var2.g(i10, hh4Var);
            if (qb4Var2.j(i10, hh4Var)) {
                long j11 = qb4Var2.f14226c;
                if (j11 == -1 || j11 < j10) {
                    qb4Var = qb4Var2;
                    j10 = j11;
                } else if (j11 == j10) {
                    int i11 = sv2.f15560a;
                    if (qb4Var.f14227d != null && qb4Var2.f14227d != null) {
                        qb4Var = qb4Var2;
                    }
                }
            }
        }
        if (qb4Var != null) {
            return qb4Var;
        }
        String strL = l();
        qb4 qb4Var3 = new qb4(this, strL, i10, hh4Var);
        this.f14733c.put(strL, qb4Var3);
        return qb4Var3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l() {
        byte[] bArr = new byte[12];
        f14730i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void m(j94 j94Var) {
        if (j94Var.f10387b.o()) {
            this.f14737g = null;
            return;
        }
        qb4 qb4Var = (qb4) this.f14733c.get(this.f14737g);
        qb4 qb4VarK = k(j94Var.f10388c, j94Var.f10389d);
        this.f14737g = qb4VarK.f14224a;
        b(j94Var);
        hh4 hh4Var = j94Var.f10389d;
        if (hh4Var == null || !hh4Var.b()) {
            return;
        }
        if (qb4Var != null && qb4Var.f14226c == j94Var.f10389d.f10404d && qb4Var.f14227d != null && qb4Var.f14227d.f10402b == j94Var.f10389d.f10402b && qb4Var.f14227d.f10403c == j94Var.f10389d.f10403c) {
            return;
        }
        hh4 hh4Var2 = j94Var.f10389d;
        String unused = k(j94Var.f10388c, new hh4(hh4Var2.f10401a, hh4Var2.f10404d)).f14224a;
        String unused2 = qb4VarK.f14224a;
    }

    @Override // com.google.android.gms.internal.ads.vb4
    public final synchronized String a(h11 h11Var, hh4 hh4Var) {
        return k(h11Var.n(hh4Var.f10401a, this.f14732b).f8041c, hh4Var).f14224a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r10.f10389d.f10404d < r0.f14226c) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.vb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(com.google.android.gms.internal.ads.j94 r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.ub4 r0 = r9.f14735e     // Catch: java.lang.Throwable -> Lcb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.h11 r0 = r10.f10387b     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r0.o()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap r0 = r9.f14733c     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.f14737g     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.qb4 r0 = (com.google.android.gms.internal.ads.qb4) r0     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.hh4 r1 = r10.f10389d     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L41
            if (r0 == 0) goto L41
            long r1 = com.google.android.gms.internal.ads.qb4.b(r0)     // Catch: java.lang.Throwable -> Lcb
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L33
            int r0 = com.google.android.gms.internal.ads.qb4.a(r0)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.f10388c     // Catch: java.lang.Throwable -> Lcb
            if (r0 != r1) goto L3f
            goto L41
        L33:
            com.google.android.gms.internal.ads.hh4 r1 = r10.f10389d     // Catch: java.lang.Throwable -> Lcb
            long r1 = r1.f10404d     // Catch: java.lang.Throwable -> Lcb
            long r3 = com.google.android.gms.internal.ads.qb4.b(r0)     // Catch: java.lang.Throwable -> Lcb
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            monitor-exit(r9)
            return
        L41:
            int r0 = r10.f10388c     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.hh4 r1 = r10.f10389d     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.qb4 r0 = r9.k(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.f14737g     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L53
            java.lang.String r1 = com.google.android.gms.internal.ads.qb4.d(r0)     // Catch: java.lang.Throwable -> Lcb
            r9.f14737g = r1     // Catch: java.lang.Throwable -> Lcb
        L53:
            com.google.android.gms.internal.ads.hh4 r1 = r10.f10389d     // Catch: java.lang.Throwable -> Lcb
            r2 = 1
            if (r1 == 0) goto L9d
            boolean r3 = r1.b()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L9d
            com.google.android.gms.internal.ads.hh4 r3 = new com.google.android.gms.internal.ads.hh4     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r1.f10401a     // Catch: java.lang.Throwable -> Lcb
            long r5 = r1.f10404d     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.f10402b     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.f10388c     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.qb4 r1 = r9.k(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.internal.ads.qb4.i(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L9d
            com.google.android.gms.internal.ads.qb4.f(r1, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.h11 r3 = r10.f10387b     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.hh4 r4 = r10.f10389d     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r4.f10401a     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.ey0 r5 = r9.f14732b     // Catch: java.lang.Throwable -> Lcb
            r3.n(r4, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.ey0 r3 = r9.f14732b     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.hh4 r4 = r10.f10389d     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.f10402b     // Catch: java.lang.Throwable -> Lcb
            r3.h(r4)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.sv2.y(r3)     // Catch: java.lang.Throwable -> Lcb
            long r7 = com.google.android.gms.internal.ads.sv2.y(r3)     // Catch: java.lang.Throwable -> Lcb
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.qb4.d(r1)     // Catch: java.lang.Throwable -> Lcb
        L9d:
            boolean r1 = com.google.android.gms.internal.ads.qb4.i(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto La9
            com.google.android.gms.internal.ads.qb4.f(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.qb4.d(r0)     // Catch: java.lang.Throwable -> Lcb
        La9:
            java.lang.String r1 = com.google.android.gms.internal.ads.qb4.d(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r9.f14737g     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lc9
            boolean r1 = com.google.android.gms.internal.ads.qb4.h(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto Lc9
            com.google.android.gms.internal.ads.qb4.e(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.ub4 r1 = r9.f14735e     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = com.google.android.gms.internal.ads.qb4.d(r0)     // Catch: java.lang.Throwable -> Lcb
            r1.i(r10, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r9)
            return
        Lc9:
            monitor-exit(r9)
            return
        Lcb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rb4.b(com.google.android.gms.internal.ads.j94):void");
    }

    @Override // com.google.android.gms.internal.ads.vb4
    public final void c(ub4 ub4Var) {
        this.f14735e = ub4Var;
    }

    @Override // com.google.android.gms.internal.ads.vb4
    public final synchronized void d(j94 j94Var) {
        ub4 ub4Var;
        this.f14737g = null;
        Iterator it = this.f14733c.values().iterator();
        while (it.hasNext()) {
            qb4 qb4Var = (qb4) it.next();
            it.remove();
            if (qb4Var.f14228e && (ub4Var = this.f14735e) != null) {
                ub4Var.c(j94Var, qb4Var.f14224a, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vb4
    public final synchronized void e(j94 j94Var) {
        Objects.requireNonNull(this.f14735e);
        h11 h11Var = this.f14736f;
        this.f14736f = j94Var.f10387b;
        Iterator it = this.f14733c.values().iterator();
        while (it.hasNext()) {
            qb4 qb4Var = (qb4) it.next();
            if (!qb4Var.l(h11Var, this.f14736f) || qb4Var.k(j94Var)) {
                it.remove();
                if (qb4Var.f14228e) {
                    if (qb4Var.f14224a.equals(this.f14737g)) {
                        this.f14737g = null;
                    }
                    this.f14735e.c(j94Var, qb4Var.f14224a, false);
                }
            }
        }
        m(j94Var);
    }

    @Override // com.google.android.gms.internal.ads.vb4
    public final synchronized String f() {
        return this.f14737g;
    }

    @Override // com.google.android.gms.internal.ads.vb4
    public final synchronized void g(j94 j94Var, int i10) {
        Objects.requireNonNull(this.f14735e);
        Iterator it = this.f14733c.values().iterator();
        while (it.hasNext()) {
            qb4 qb4Var = (qb4) it.next();
            if (qb4Var.k(j94Var)) {
                it.remove();
                if (qb4Var.f14228e) {
                    boolean zEquals = qb4Var.f14224a.equals(this.f14737g);
                    boolean z10 = false;
                    if (i10 == 0 && zEquals && qb4Var.f14229f) {
                        z10 = true;
                    }
                    if (zEquals) {
                        this.f14737g = null;
                    }
                    this.f14735e.c(j94Var, qb4Var.f14224a, z10);
                }
            }
        }
        m(j94Var);
    }
}
