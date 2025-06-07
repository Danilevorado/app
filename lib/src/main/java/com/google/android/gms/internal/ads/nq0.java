package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class nq0 implements s3.z {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f12832a;

    /* renamed from: b, reason: collision with root package name */
    private u01 f12833b;

    /* renamed from: c, reason: collision with root package name */
    private s3.g f12834c;

    /* synthetic */ nq0(ho0 ho0Var, mq0 mq0Var) {
        this.f12832a = ho0Var;
    }

    @Override // s3.z
    public final /* synthetic */ s3.z a(s3.g gVar) {
        this.f12834c = gVar;
        return this;
    }

    @Override // s3.z
    public final /* synthetic */ s3.z b(u01 u01Var) {
        this.f12833b = u01Var;
        return this;
    }

    @Override // s3.z
    public final s3.a0 d() {
        k44.c(this.f12833b, u01.class);
        k44.c(this.f12834c, s3.g.class);
        return new pq0(this.f12832a, this.f12834c, new oy0(), new ln1(), this.f12833b, null, null, null);
    }
}
