package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class nq1 extends u3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f12835a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f12836b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ sq1 f12837c;

    nq1(sq1 sq1Var, String str, String str2) {
        this.f12837c = sq1Var;
        this.f12835a = str;
        this.f12836b = str2;
    }

    @Override // d3.d
    public final void a(d3.l lVar) {
        this.f12837c.U5(sq1.T5(lVar), this.f12836b);
    }

    @Override // d3.d
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f12837c.P5(this.f12835a, (u3.c) obj, this.f12836b);
    }
}
