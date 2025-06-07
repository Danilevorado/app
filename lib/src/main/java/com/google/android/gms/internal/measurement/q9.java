package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class q9 implements w9 {

    /* renamed from: a, reason: collision with root package name */
    private final w9[] f19223a;

    q9(w9... w9VarArr) {
        this.f19223a = w9VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final v9 a(Class cls) {
        w9[] w9VarArr = this.f19223a;
        for (int i10 = 0; i10 < 2; i10++) {
            w9 w9Var = w9VarArr[i10];
            if (w9Var.b(cls)) {
                return w9Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.w9
    public final boolean b(Class cls) {
        w9[] w9VarArr = this.f19223a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (w9VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
