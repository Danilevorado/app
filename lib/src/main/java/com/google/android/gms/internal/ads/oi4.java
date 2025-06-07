package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class oi4 extends ig4 implements fi4 {

    /* renamed from: h, reason: collision with root package name */
    private final v30 f13259h;

    /* renamed from: i, reason: collision with root package name */
    private final ew f13260i;

    /* renamed from: j, reason: collision with root package name */
    private final s43 f13261j;

    /* renamed from: k, reason: collision with root package name */
    private final le4 f13262k;

    /* renamed from: l, reason: collision with root package name */
    private final int f13263l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13264m;

    /* renamed from: n, reason: collision with root package name */
    private long f13265n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13266o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13267p;

    /* renamed from: q, reason: collision with root package name */
    private wy3 f13268q;

    /* renamed from: r, reason: collision with root package name */
    private final li4 f13269r;

    /* renamed from: s, reason: collision with root package name */
    private final ll4 f13270s;

    /* synthetic */ oi4(v30 v30Var, s43 s43Var, li4 li4Var, le4 le4Var, ll4 ll4Var, int i10, ni4 ni4Var) {
        ew ewVar = v30Var.f16553b;
        Objects.requireNonNull(ewVar);
        this.f13260i = ewVar;
        this.f13259h = v30Var;
        this.f13261j = s43Var;
        this.f13269r = li4Var;
        this.f13262k = le4Var;
        this.f13270s = ll4Var;
        this.f13263l = i10;
        this.f13264m = true;
        this.f13265n = -9223372036854775807L;
    }

    private final void x() {
        long j10 = this.f13265n;
        boolean z10 = this.f13266o;
        boolean z11 = this.f13267p;
        v30 v30Var = this.f13259h;
        cj4 cj4Var = new cj4(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, v30Var, z11 ? v30Var.f16555d : null);
        t(this.f13264m ? new ki4(this, cj4Var) : cj4Var);
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final v30 L() {
        return this.f13259h;
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void a(fh4 fh4Var) {
        ((ji4) fh4Var).z();
    }

    @Override // com.google.android.gms.internal.ads.fi4
    public final void d(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f13265n;
        }
        if (!this.f13264m && this.f13265n == j10 && this.f13266o == z10 && this.f13267p == z11) {
            return;
        }
        this.f13265n = j10;
        this.f13266o = z10;
        this.f13267p = z11;
        this.f13264m = false;
        x();
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final fh4 g(hh4 hh4Var, hl4 hl4Var, long j10) {
        t53 t53VarA = this.f13261j.a();
        wy3 wy3Var = this.f13268q;
        if (wy3Var != null) {
            t53VarA.b(wy3Var);
        }
        Uri uri = this.f13260i.f8000a;
        li4 li4Var = this.f13269r;
        l();
        return new ji4(uri, t53VarA, new jg4(li4Var.f11625a), this.f13262k, m(hh4Var), this.f13270s, o(hh4Var), this, hl4Var, null, this.f13263l);
    }

    @Override // com.google.android.gms.internal.ads.ig4
    protected final void s(wy3 wy3Var) {
        this.f13268q = wy3Var;
        Objects.requireNonNull(Looper.myLooper());
        l();
        x();
    }

    @Override // com.google.android.gms.internal.ads.ig4
    protected final void v() {
    }
}
