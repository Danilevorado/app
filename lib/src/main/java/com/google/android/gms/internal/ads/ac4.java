package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ac4 {

    /* renamed from: c, reason: collision with root package name */
    public static final ac4 f6037c = new ac4(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    private static final ac4 f6038d = new ac4(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final f63 f6039e;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f6040a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6041b;

    static {
        e63 e63Var = new e63();
        e63Var.a(5, 6);
        e63Var.a(17, 6);
        e63Var.a(7, 6);
        e63Var.a(18, 6);
        e63Var.a(6, 8);
        e63Var.a(8, 8);
        e63Var.a(14, 8);
        f6039e = e63Var.c();
    }

    public ac4(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f6040a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.f6041b = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(com.google.android.gms.internal.ads.k9 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f10898l
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = r10.f10895i
            int r0 = com.google.android.gms.internal.ads.ng0.a(r0, r1)
            com.google.android.gms.internal.ads.f63 r1 = com.google.android.gms.internal.ads.ac4.f6039e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2a
            boolean r0 = r9.c(r6)
            if (r0 != 0) goto L29
            r0 = r4
            goto L33
        L29:
            r0 = r6
        L2a:
            if (r0 != r5) goto L33
            boolean r7 = r9.c(r5)
            if (r7 != 0) goto L33
            r0 = r2
        L33:
            boolean r7 = r9.c(r0)
            if (r7 != 0) goto L3a
            return r3
        L3a:
            int r7 = r10.f10911y
            r8 = -1
            if (r7 == r8) goto L45
            if (r0 != r6) goto L42
            goto L45
        L42:
            if (r7 <= r5) goto L6d
            return r3
        L45:
            int r10 = r10.f10912z
            if (r10 != r8) goto L4c
            r10 = 48000(0xbb80, float:6.7262E-41)
        L4c:
            int r6 = com.google.android.gms.internal.ads.sv2.f15560a
            r7 = 29
            if (r6 < r7) goto L57
            int r7 = com.google.android.gms.internal.ads.zb4.a(r0, r10)
            goto L6d
        L57:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.util.Objects.requireNonNull(r10)
            int r7 = r10.intValue()
        L6d:
            int r10 = com.google.android.gms.internal.ads.sv2.f15560a
            r1 = 28
            if (r10 > r1) goto L81
            if (r7 != r2) goto L77
            r4 = r5
            goto L82
        L77:
            r1 = 3
            if (r7 == r1) goto L82
            r1 = 4
            if (r7 == r1) goto L82
            r1 = 5
            if (r7 != r1) goto L81
            goto L82
        L81:
            r4 = r7
        L82:
            r1 = 26
            if (r10 > r1) goto L94
            java.lang.String r10 = com.google.android.gms.internal.ads.sv2.f15561b
            java.lang.String r1 = "fugu"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L94
            r10 = 1
            if (r4 != r10) goto L94
            r4 = 2
        L94:
            int r10 = com.google.android.gms.internal.ads.sv2.n(r4)
            if (r10 != 0) goto L9b
            return r3
        L9b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ac4.a(com.google.android.gms.internal.ads.k9):android.util.Pair");
    }

    public final boolean c(int i10) {
        return Arrays.binarySearch(this.f6040a, i10) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac4) && Arrays.equals(this.f6040a, ((ac4) obj).f6040a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f6040a) * 31) + 8;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + Arrays.toString(this.f6040a) + "]";
    }
}
