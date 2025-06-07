package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class f54 implements t84, u84 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8118a;

    /* renamed from: c, reason: collision with root package name */
    private w84 f8120c;

    /* renamed from: d, reason: collision with root package name */
    private int f8121d;

    /* renamed from: e, reason: collision with root package name */
    private xb4 f8122e;

    /* renamed from: f, reason: collision with root package name */
    private int f8123f;

    /* renamed from: g, reason: collision with root package name */
    private xi4 f8124g;

    /* renamed from: h, reason: collision with root package name */
    private k9[] f8125h;

    /* renamed from: i, reason: collision with root package name */
    private long f8126i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8128k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8129l;

    /* renamed from: b, reason: collision with root package name */
    private final t74 f8119b = new t74();

    /* renamed from: j, reason: collision with root package name */
    private long f8127j = Long.MIN_VALUE;

    public f54(int i10) {
        this.f8118a = i10;
    }

    private final void x(long j10, boolean z10) {
        this.f8128k = false;
        this.f8127j = j10;
        K(j10, z10);
    }

    protected final o54 A(Throwable th, k9 k9Var, boolean z10, int i10) {
        int iO = 4;
        if (k9Var != null && !this.f8129l) {
            this.f8129l = true;
            try {
                iO = o(k9Var) & 7;
            } catch (o54 unused) {
            } catch (Throwable th2) {
                this.f8129l = false;
                throw th2;
            }
            this.f8129l = false;
        }
        return o54.b(th, s(), this.f8121d, k9Var, iO, z10, i10);
    }

    protected final int B(long j10) {
        xi4 xi4Var = this.f8124g;
        Objects.requireNonNull(xi4Var);
        return xi4Var.a(j10 - this.f8126i);
    }

    protected final t74 C() {
        t74 t74Var = this.f8119b;
        t74Var.f15721b = null;
        t74Var.f15720a = null;
        return t74Var;
    }

    protected final w84 D() {
        w84 w84Var = this.f8120c;
        Objects.requireNonNull(w84Var);
        return w84Var;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void E() {
        gt1.f(this.f8123f == 1);
        this.f8123f = 2;
        M();
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void F() {
        gt1.f(this.f8123f == 0);
        t74 t74Var = this.f8119b;
        t74Var.f15721b = null;
        t74Var.f15720a = null;
        L();
    }

    protected final xb4 H() {
        xb4 xb4Var = this.f8122e;
        Objects.requireNonNull(xb4Var);
        return xb4Var;
    }

    protected abstract void I();

    protected abstract void J(boolean z10, boolean z11);

    protected abstract void K(long j10, boolean z10);

    protected abstract void L();

    protected abstract void M();

    protected abstract void N();

    protected abstract void O(k9[] k9VarArr, long j10, long j11);

    @Override // com.google.android.gms.internal.ads.t84
    public final boolean P() {
        return this.f8127j == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void Q() {
        this.f8128k = true;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final boolean T() {
        return this.f8128k;
    }

    @Override // com.google.android.gms.internal.ads.t84, com.google.android.gms.internal.ads.u84
    public final int b() {
        return this.f8118a;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final long e() {
        return this.f8127j;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void f(long j10) {
        x(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.t84
    public w74 i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final u84 j() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final int k() {
        return this.f8123f;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void m() {
        gt1.f(this.f8123f == 1);
        t74 t74Var = this.f8119b;
        t74Var.f15721b = null;
        t74Var.f15720a = null;
        this.f8123f = 0;
        this.f8124g = null;
        this.f8125h = null;
        this.f8128k = false;
        I();
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final xi4 n() {
        return this.f8124g;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void p(k9[] k9VarArr, xi4 xi4Var, long j10, long j11) {
        gt1.f(!this.f8128k);
        this.f8124g = xi4Var;
        if (this.f8127j == Long.MIN_VALUE) {
            this.f8127j = j10;
        }
        this.f8125h = k9VarArr;
        this.f8126i = j11;
        O(k9VarArr, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void q(int i10, xb4 xb4Var) {
        this.f8121d = i10;
        this.f8122e = xb4Var;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void r() {
        xi4 xi4Var = this.f8124g;
        Objects.requireNonNull(xi4Var);
        xi4Var.f();
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void t(w84 w84Var, k9[] k9VarArr, xi4 xi4Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        gt1.f(this.f8123f == 0);
        this.f8120c = w84Var;
        this.f8123f = 1;
        J(z10, z11);
        p(k9VarArr, xi4Var, j11, j12);
        x(j10, z10);
    }

    protected final boolean v() {
        if (P()) {
            return this.f8128k;
        }
        xi4 xi4Var = this.f8124g;
        Objects.requireNonNull(xi4Var);
        return xi4Var.c();
    }

    protected final k9[] w() {
        k9[] k9VarArr = this.f8125h;
        Objects.requireNonNull(k9VarArr);
        return k9VarArr;
    }

    protected final int y(t74 t74Var, w44 w44Var, int i10) {
        xi4 xi4Var = this.f8124g;
        Objects.requireNonNull(xi4Var);
        int iB = xi4Var.b(t74Var, w44Var, i10);
        if (iB == -4) {
            if (w44Var.g()) {
                this.f8127j = Long.MIN_VALUE;
                return this.f8128k ? -4 : -3;
            }
            long j10 = w44Var.f16977e + this.f8126i;
            w44Var.f16977e = j10;
            this.f8127j = Math.max(this.f8127j, j10);
        } else if (iB == -5) {
            k9 k9Var = t74Var.f15720a;
            Objects.requireNonNull(k9Var);
            long j11 = k9Var.f10902p;
            if (j11 != Long.MAX_VALUE) {
                i7 i7VarB = k9Var.b();
                i7VarB.w(j11 + this.f8126i);
                t74Var.f15720a = i7VarB.y();
                return -5;
            }
        }
        return iB;
    }

    @Override // com.google.android.gms.internal.ads.t84
    public final void z() {
        gt1.f(this.f8123f == 2);
        this.f8123f = 1;
        N();
    }
}
