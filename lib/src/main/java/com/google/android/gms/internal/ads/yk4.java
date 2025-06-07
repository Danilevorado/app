package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yk4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18085a;

    /* renamed from: b, reason: collision with root package name */
    public final w84[] f18086b;

    /* renamed from: c, reason: collision with root package name */
    public final rk4[] f18087c;

    /* renamed from: d, reason: collision with root package name */
    public final rc1 f18088d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18089e;

    public yk4(w84[] w84VarArr, rk4[] rk4VarArr, rc1 rc1Var, Object obj) {
        this.f18086b = w84VarArr;
        this.f18087c = (rk4[]) rk4VarArr.clone();
        this.f18088d = rc1Var;
        this.f18089e = obj;
        this.f18085a = w84VarArr.length;
    }

    public final boolean a(yk4 yk4Var, int i10) {
        return yk4Var != null && sv2.b(this.f18086b[i10], yk4Var.f18086b[i10]) && sv2.b(this.f18087c[i10], yk4Var.f18087c[i10]);
    }

    public final boolean b(int i10) {
        return this.f18086b[i10] != null;
    }
}
