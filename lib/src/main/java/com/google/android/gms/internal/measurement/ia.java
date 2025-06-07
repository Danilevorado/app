package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class ia implements v9 {

    /* renamed from: a, reason: collision with root package name */
    private final y9 f19009a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19010b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f19011c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19012d;

    ia(y9 y9Var, String str, Object[] objArr) {
        this.f19009a = y9Var;
        this.f19010b = str;
        this.f19011c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19012d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f19012d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final y9 a() {
        return this.f19009a;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final boolean b() {
        return (this.f19012d & 2) == 2;
    }

    final String c() {
        return this.f19010b;
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final int d() {
        return (this.f19012d & 1) == 1 ? 1 : 2;
    }

    final Object[] e() {
        return this.f19011c;
    }
}
