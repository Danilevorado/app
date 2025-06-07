package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class iv1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f10184a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f10185b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10186c = 0;

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String b(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f10185b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(true != z10 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(f10184a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
