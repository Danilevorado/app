package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class e3 implements r2 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f19483a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19484b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f19485c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19486d;

    e3(u2 u2Var, String str, Object[] objArr) {
        this.f19483a = u2Var;
        this.f19484b = str;
        this.f19485c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19486d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f19486d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final u2 a() {
        return this.f19483a;
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final boolean b() {
        return (this.f19486d & 2) == 2;
    }

    final String c() {
        return this.f19484b;
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final int d() {
        int i10 = this.f19486d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    final Object[] e() {
        return this.f19485c;
    }
}
