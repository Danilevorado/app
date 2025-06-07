package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class a23 extends x13 {

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ b5.j f5929n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ x13 f5930o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ h23 f5931p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a23(h23 h23Var, b5.j jVar, b5.j jVar2, x13 x13Var) {
        super(jVar);
        this.f5931p = h23Var;
        this.f5929n = jVar2;
        this.f5930o = x13Var;
    }

    @Override // com.google.android.gms.internal.ads.x13
    public final void a() {
        synchronized (this.f5931p.f8973f) {
            h23.n(this.f5931p, this.f5929n);
            if (this.f5931p.f8978k.getAndIncrement() > 0) {
                this.f5931p.f8969b.c("Already connected to the service.", new Object[0]);
            }
            h23.p(this.f5931p, this.f5930o);
        }
    }
}
