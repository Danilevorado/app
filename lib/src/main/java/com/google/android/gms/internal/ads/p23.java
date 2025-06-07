package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class p23 extends o23 {

    /* renamed from: m, reason: collision with root package name */
    private final char f13529m;

    p23(char c10) {
        this.f13529m = c10;
    }

    @Override // com.google.android.gms.internal.ads.t23
    public final boolean b(char c10) {
        return c10 == this.f13529m;
    }

    public final String toString() {
        int i10 = this.f13529m;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
