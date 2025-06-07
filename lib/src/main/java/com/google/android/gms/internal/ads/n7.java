package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class n7 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f12441f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f12442a;

    /* renamed from: b, reason: collision with root package name */
    private int f12443b;

    /* renamed from: c, reason: collision with root package name */
    public int f12444c;

    /* renamed from: d, reason: collision with root package name */
    public int f12445d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f12446e = new byte[128];

    public n7(int i10) {
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f12442a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f12446e;
            int length = bArr2.length;
            int i13 = this.f12444c + i12;
            if (length < i13) {
                this.f12446e = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f12446e, this.f12444c, i12);
            this.f12444c += i12;
        }
    }

    public final void b() {
        this.f12442a = false;
        this.f12444c = 0;
        this.f12443b = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.f12443b
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L45
            r4 = 181(0xb5, float:2.54E-43)
            r5 = 2
            java.lang.String r6 = "Unexpected start code value"
            java.lang.String r7 = "H263Reader"
            if (r0 == r3) goto L39
            if (r0 == r5) goto L31
            if (r0 == r2) goto L22
            r0 = 179(0xb3, float:2.51E-43)
            if (r9 == r0) goto L1a
            if (r9 != r4) goto L4d
        L1a:
            int r9 = r8.f12444c
            int r9 = r9 - r10
            r8.f12444c = r9
            r8.f12442a = r1
            return r3
        L22:
            r9 = r9 & 240(0xf0, float:3.36E-43)
            r10 = 32
            if (r9 == r10) goto L29
            goto L3b
        L29:
            int r9 = r8.f12444c
            r8.f12445d = r9
            r9 = 4
            r8.f12443b = r9
            goto L4d
        L31:
            r10 = 31
            if (r9 <= r10) goto L36
            goto L3b
        L36:
            r8.f12443b = r2
            goto L4d
        L39:
            if (r9 == r4) goto L42
        L3b:
            com.google.android.gms.internal.ads.ad2.e(r7, r6)
            r8.b()
            goto L4d
        L42:
            r8.f12443b = r5
            goto L4d
        L45:
            r10 = 176(0xb0, float:2.47E-43)
            if (r9 != r10) goto L4d
            r8.f12443b = r3
            r8.f12442a = r3
        L4d:
            byte[] r9 = com.google.android.gms.internal.ads.n7.f12441f
            r8.a(r9, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n7.c(int, int):boolean");
    }
}
