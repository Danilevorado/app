package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ed4 {

    /* renamed from: a, reason: collision with root package name */
    private ac4 f7728a = ac4.f6037c;

    /* renamed from: b, reason: collision with root package name */
    final dd4 f7729b = dd4.f7266a;

    /* renamed from: c, reason: collision with root package name */
    private gd4 f7730c;

    public final ed4 b(ac4 ac4Var) {
        this.f7728a = ac4Var;
        return this;
    }

    public final ed4 c(zl1[] zl1VarArr) {
        this.f7730c = new gd4(zl1VarArr);
        return this;
    }

    public final qd4 d() {
        if (this.f7730c == null) {
            this.f7730c = new gd4(new zl1[0]);
        }
        return new qd4(this, null);
    }
}
