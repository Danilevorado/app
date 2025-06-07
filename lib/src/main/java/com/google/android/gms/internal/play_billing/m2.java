package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class m2 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    private final s2[] f19591a;

    m2(s2... s2VarArr) {
        this.f19591a = s2VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final r2 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            s2 s2Var = this.f19591a[i10];
            if (s2Var.b(cls)) {
                return s2Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f19591a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
