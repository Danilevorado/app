package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f8062a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f8063b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f8064c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f8065d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f8066e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f8067f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f8068g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!m(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f8063b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            int i17 = i13 - 1;
            return ((((i11 == 3 ? f8064c[i17] : f8065d[i17]) * 12) / i15) + i16) * 4;
        }
        int i18 = i13 - 1;
        int i19 = i11 == 3 ? i12 == 2 ? f8066e[i18] : f8067f[i18] : f8068g[i18];
        if (i11 == 3) {
            return ((i19 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i19) / i15) + i16;
    }

    public static int c(int i10) {
        int i11;
        int i12;
        if (!m(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = i10 >>> 12;
        int i14 = (i10 >>> 10) & 3;
        int i15 = i13 & 15;
        if (i15 == 0 || i15 == 15 || i14 == 3) {
            return -1;
        }
        return l(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, int i11) {
        return i11 != 1 ? i11 != 2 ? 384 : 1152 : i10 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }
}
