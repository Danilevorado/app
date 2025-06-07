package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6782a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6783b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f6784c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6785d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f6786e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c6(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            com.google.android.gms.internal.ads.gt1.d(r2)
            r4.f6782a = r5
            r4.f6783b = r6
            r4.f6785d = r7
            r4.f6786e = r11
            com.google.android.gms.internal.ads.r0 r5 = new com.google.android.gms.internal.ads.r0
            r7 = 2
            if (r6 != 0) goto L21
            goto L77
        L21:
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r1
            goto L52
        L34:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r2
            goto L52
        L47:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L51
            r0 = r7
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L77
            if (r0 == r1) goto L77
            if (r0 == r7) goto L76
            if (r0 == r2) goto L76
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            com.google.android.gms.internal.ads.ad2.e(r7, r6)
            goto L77
        L76:
            r1 = r7
        L77:
            r5.<init>(r1, r8, r9, r10)
            r4.f6784c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c6.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
