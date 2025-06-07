package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bz3 implements hz3 {

    /* renamed from: a, reason: collision with root package name */
    private final hz3[] f6729a;

    bz3(hz3... hz3VarArr) {
        this.f6729a = hz3VarArr;
    }

    @Override // com.google.android.gms.internal.ads.hz3
    public final gz3 a(Class cls) {
        hz3[] hz3VarArr = this.f6729a;
        for (int i10 = 0; i10 < 2; i10++) {
            hz3 hz3Var = hz3VarArr[i10];
            if (hz3Var.b(cls)) {
                return hz3Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.hz3
    public final boolean b(Class cls) {
        hz3[] hz3VarArr = this.f6729a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (hz3VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
