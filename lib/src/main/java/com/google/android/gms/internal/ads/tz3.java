package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class tz3 implements gz3 {

    /* renamed from: a, reason: collision with root package name */
    private final jz3 f16110a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16111b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f16112c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16113d;

    tz3(jz3 jz3Var, String str, Object[] objArr) {
        this.f16110a = jz3Var;
        this.f16111b = str;
        this.f16112c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f16113d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f16113d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gz3
    public final jz3 a() {
        return this.f16110a;
    }

    @Override // com.google.android.gms.internal.ads.gz3
    public final boolean b() {
        return (this.f16113d & 2) == 2;
    }

    final String c() {
        return this.f16111b;
    }

    @Override // com.google.android.gms.internal.ads.gz3
    public final int d() {
        return (this.f16113d & 1) == 1 ? 1 : 2;
    }

    final Object[] e() {
        return this.f16112c;
    }
}
