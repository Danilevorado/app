package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class mp0 implements zn1 {

    /* renamed from: a, reason: collision with root package name */
    private final Long f12217a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12218b;

    /* renamed from: c, reason: collision with root package name */
    private final ho0 f12219c;

    /* renamed from: d, reason: collision with root package name */
    private final qp0 f12220d;

    /* renamed from: e, reason: collision with root package name */
    private final mp0 f12221e = this;

    /* synthetic */ mp0(ho0 ho0Var, qp0 qp0Var, Long l10, String str, lp0 lp0Var) {
        this.f12219c = ho0Var;
        this.f12220d = qp0Var;
        this.f12217a = l10;
        this.f12218b = str;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final ko1 a() {
        long jLongValue = this.f12217a.longValue();
        qp0 qp0Var = this.f12220d;
        return lo1.a(jLongValue, qp0Var.f14431a, eo1.c(qp0Var.f14432b), this.f12219c, this.f12218b);
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final oo1 b() {
        long jLongValue = this.f12217a.longValue();
        qp0 qp0Var = this.f12220d;
        return po1.a(jLongValue, qp0Var.f14431a, eo1.c(qp0Var.f14432b), this.f12219c, this.f12218b);
    }
}
