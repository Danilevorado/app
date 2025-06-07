package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
final class m54 implements w74 {

    /* renamed from: a, reason: collision with root package name */
    private final a94 f11934a;

    /* renamed from: b, reason: collision with root package name */
    private final l54 f11935b;

    /* renamed from: c, reason: collision with root package name */
    private t84 f11936c;

    /* renamed from: d, reason: collision with root package name */
    private w74 f11937d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11938e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11939f;

    public m54(l54 l54Var, hu1 hu1Var) {
        this.f11935b = l54Var;
        this.f11934a = new a94(hu1Var);
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final long a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.t84 r0 = r4.f11936c
            if (r0 == 0) goto L66
            boolean r0 = r0.V()
            if (r0 != 0) goto L66
            com.google.android.gms.internal.ads.t84 r0 = r4.f11936c
            boolean r0 = r0.G()
            if (r0 != 0) goto L1d
            if (r5 != 0) goto L66
            com.google.android.gms.internal.ads.t84 r5 = r4.f11936c
            boolean r5 = r5.P()
            if (r5 == 0) goto L1d
            goto L66
        L1d:
            com.google.android.gms.internal.ads.w74 r5 = r4.f11937d
            java.util.Objects.requireNonNull(r5)
            long r0 = r5.a()
            boolean r2 = r4.f11938e
            if (r2 == 0) goto L46
            com.google.android.gms.internal.ads.a94 r2 = r4.f11934a
            long r2 = r2.a()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3a
            com.google.android.gms.internal.ads.a94 r5 = r4.f11934a
            r5.e()
            goto L72
        L3a:
            r2 = 0
            r4.f11938e = r2
            boolean r2 = r4.f11939f
            if (r2 == 0) goto L46
            com.google.android.gms.internal.ads.a94 r2 = r4.f11934a
            r2.c()
        L46:
            com.google.android.gms.internal.ads.a94 r2 = r4.f11934a
            r2.b(r0)
            com.google.android.gms.internal.ads.sl0 r5 = r5.d()
            com.google.android.gms.internal.ads.a94 r0 = r4.f11934a
            com.google.android.gms.internal.ads.sl0 r0 = r0.d()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L72
            com.google.android.gms.internal.ads.a94 r0 = r4.f11934a
            r0.h(r5)
            com.google.android.gms.internal.ads.l54 r0 = r4.f11935b
            r0.b(r5)
            goto L72
        L66:
            r5 = 1
            r4.f11938e = r5
            boolean r5 = r4.f11939f
            if (r5 == 0) goto L72
            com.google.android.gms.internal.ads.a94 r5 = r4.f11934a
            r5.c()
        L72:
            boolean r5 = r4.f11938e
            if (r5 == 0) goto L7d
            com.google.android.gms.internal.ads.a94 r5 = r4.f11934a
            long r0 = r5.a()
            goto L86
        L7d:
            com.google.android.gms.internal.ads.w74 r5 = r4.f11937d
            java.util.Objects.requireNonNull(r5)
            long r0 = r5.a()
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m54.b(boolean):long");
    }

    public final void c(t84 t84Var) {
        if (t84Var == this.f11936c) {
            this.f11937d = null;
            this.f11936c = null;
            this.f11938e = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final sl0 d() {
        w74 w74Var = this.f11937d;
        return w74Var != null ? w74Var.d() : this.f11934a.d();
    }

    public final void e(t84 t84Var) throws o54 {
        w74 w74Var;
        w74 w74VarI = t84Var.i();
        if (w74VarI == null || w74VarI == (w74Var = this.f11937d)) {
            return;
        }
        if (w74Var != null) {
            throw o54.d(new IllegalStateException("Multiple renderer media clocks enabled."), AdError.NETWORK_ERROR_CODE);
        }
        this.f11937d = w74VarI;
        this.f11936c = t84Var;
        w74VarI.h(this.f11934a.d());
    }

    public final void f(long j10) {
        this.f11934a.b(j10);
    }

    public final void g() {
        this.f11939f = true;
        this.f11934a.c();
    }

    @Override // com.google.android.gms.internal.ads.w74
    public final void h(sl0 sl0Var) {
        w74 w74Var = this.f11937d;
        if (w74Var != null) {
            w74Var.h(sl0Var);
            sl0Var = this.f11937d.d();
        }
        this.f11934a.h(sl0Var);
    }

    public final void i() {
        this.f11939f = false;
        this.f11934a.e();
    }
}
