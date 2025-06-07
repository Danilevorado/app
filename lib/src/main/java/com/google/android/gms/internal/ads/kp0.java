package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class kp0 implements yn1 {

    /* renamed from: a, reason: collision with root package name */
    private final ho0 f11178a;

    /* renamed from: b, reason: collision with root package name */
    private final qp0 f11179b;

    /* renamed from: c, reason: collision with root package name */
    private Long f11180c;

    /* renamed from: d, reason: collision with root package name */
    private String f11181d;

    /* synthetic */ kp0(ho0 ho0Var, qp0 qp0Var, jp0 jp0Var) {
        this.f11178a = ho0Var;
        this.f11179b = qp0Var;
    }

    @Override // com.google.android.gms.internal.ads.yn1
    public final /* bridge */ /* synthetic */ yn1 a(long j10) {
        this.f11180c = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yn1
    public final zn1 d() {
        k44.c(this.f11180c, Long.class);
        k44.c(this.f11181d, String.class);
        return new mp0(this.f11178a, this.f11179b, this.f11180c, this.f11181d, null);
    }

    @Override // com.google.android.gms.internal.ads.yn1
    public final /* synthetic */ yn1 o(String str) {
        Objects.requireNonNull(str);
        this.f11181d = str;
        return this;
    }
}
