package com.google.android.gms.internal.ads;

import f3.a;

/* loaded from: classes.dex */
final class kq1 extends a.AbstractC0129a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f11188a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f11189b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ sq1 f11190c;

    kq1(sq1 sq1Var, String str, String str2) {
        this.f11190c = sq1Var;
        this.f11188a = str;
        this.f11189b = str2;
    }

    @Override // d3.d
    public final void a(d3.l lVar) {
        this.f11190c.U5(sq1.T5(lVar), this.f11189b);
    }

    @Override // d3.d
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f11190c.P5(this.f11188a, (f3.a) obj, this.f11189b);
    }
}
