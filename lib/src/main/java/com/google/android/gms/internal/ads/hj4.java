package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class hj4 extends pg4 {

    /* renamed from: k, reason: collision with root package name */
    protected final jh4 f9158k;

    protected hj4(jh4 jh4Var) {
        this.f9158k = jh4Var;
    }

    @Override // com.google.android.gms.internal.ads.pg4
    protected final /* synthetic */ hh4 A(Object obj, hh4 hh4Var) {
        return C(hh4Var);
    }

    @Override // com.google.android.gms.internal.ads.pg4
    protected final /* synthetic */ void B(Object obj, jh4 jh4Var, h11 h11Var) {
        D(h11Var);
    }

    protected abstract hh4 C(hh4 hh4Var);

    protected abstract void D(h11 h11Var);

    protected abstract void E();

    @Override // com.google.android.gms.internal.ads.jh4
    public final v30 L() {
        return this.f9158k.L();
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public abstract void a(fh4 fh4Var);

    @Override // com.google.android.gms.internal.ads.ig4, com.google.android.gms.internal.ads.jh4
    public final h11 g0() {
        this.f9158k.g0();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pg4, com.google.android.gms.internal.ads.ig4
    protected final void s(wy3 wy3Var) {
        super.s(wy3Var);
        E();
    }

    @Override // com.google.android.gms.internal.ads.ig4, com.google.android.gms.internal.ads.jh4
    public final boolean u() {
        this.f9158k.u();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pg4
    protected final /* bridge */ /* synthetic */ int y(Object obj, int i10) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.pg4
    protected final /* synthetic */ long z(Object obj, long j10) {
        return j10;
    }
}
