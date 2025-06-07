package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f8916a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f8917b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f8918c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8919d = 0;

    public static k9 a(byte[] bArr, String str, String str2, c0 c0Var) {
        il2 il2Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            il2Var = new il2(bArr, bArr.length);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = bArrCopyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                    byte b11 = bArrCopyOf[i10];
                    int i11 = i10 + 1;
                    bArrCopyOf[i10] = bArrCopyOf[i11];
                    bArrCopyOf[i11] = b11;
                }
            }
            int length = bArrCopyOf.length;
            il2Var = new il2(bArrCopyOf, length);
            if (bArrCopyOf[0] == 31) {
                il2 il2Var2 = new il2(bArrCopyOf, length);
                while (il2Var2.a() >= 16) {
                    il2Var2.l(2);
                    il2Var.f(il2Var2.d(14), 14);
                }
            }
            il2Var.i(bArrCopyOf, bArrCopyOf.length);
        }
        il2Var.l(60);
        int i12 = f8916a[il2Var.d(6)];
        int i13 = f8917b[il2Var.d(4)];
        int iD = il2Var.d(5);
        int i14 = iD < 29 ? (f8918c[iD] * AdError.NETWORK_ERROR_CODE) / 2 : -1;
        il2Var.l(10);
        int i15 = i12 + (il2Var.d(2) > 0 ? 1 : 0);
        i7 i7Var = new i7();
        i7Var.h(str);
        i7Var.s("audio/vnd.dts");
        i7Var.d0(i14);
        i7Var.e0(i15);
        i7Var.t(i13);
        i7Var.b(null);
        i7Var.k(str2);
        return i7Var.y();
    }
}
