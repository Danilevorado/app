package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o4 {
    public byte[] N;
    public t0 T;
    public boolean U;
    public s0 X;
    public int Y;

    /* renamed from: a, reason: collision with root package name */
    public String f12972a;

    /* renamed from: b, reason: collision with root package name */
    public String f12973b;

    /* renamed from: c, reason: collision with root package name */
    public int f12974c;

    /* renamed from: d, reason: collision with root package name */
    public int f12975d;

    /* renamed from: e, reason: collision with root package name */
    public int f12976e;

    /* renamed from: f, reason: collision with root package name */
    public int f12977f;

    /* renamed from: g, reason: collision with root package name */
    private int f12978g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12979h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f12980i;

    /* renamed from: j, reason: collision with root package name */
    public r0 f12981j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f12982k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f12983l;

    /* renamed from: m, reason: collision with root package name */
    public int f12984m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f12985n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f12986o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f12987p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f12988q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f12989r = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f12990s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    public float f12991t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f12992u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f12993v = null;

    /* renamed from: w, reason: collision with root package name */
    public int f12994w = -1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12995x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f12996y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f12997z = -1;
    public int A = -1;
    public int B = AdError.NETWORK_ERROR_CODE;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    private String W = "eng";

    protected o4() {
    }

    private static Pair f(jm2 jm2Var) throws oh0 {
        try {
            jm2Var.g(16);
            long jY = jm2Var.y();
            if (jY == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jY == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jY != 826496599) {
                ad2.e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iK = jm2Var.k() + 20;
            byte[] bArrH = jm2Var.h();
            while (true) {
                int length = bArrH.length;
                if (iK >= length - 4) {
                    throw oh0.a("Failed to find FourCC VC1 initialization data", null);
                }
                if (bArrH[iK] == 0 && bArrH[iK + 1] == 0 && bArrH[iK + 2] == 1 && bArrH[iK + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrH, iK, length)));
                }
                iK++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw oh0.a("Error parsing FourCC private data", null);
        }
    }

    private static List g(byte[] bArr) throws oh0 {
        int i10;
        int i11;
        try {
            if (bArr[0] != 2) {
                throw oh0.a("Error parsing vorbis codec private", null);
            }
            int i12 = 0;
            int i13 = 1;
            while (true) {
                i10 = bArr[i13] & 255;
                if (i10 != 255) {
                    break;
                }
                i13++;
                i12 += 255;
            }
            int i14 = i12 + i10;
            int i15 = i13 + 1;
            int i16 = 0;
            while (true) {
                i11 = bArr[i15] & 255;
                if (i11 != 255) {
                    break;
                }
                i15++;
                i16 += 255;
            }
            int i17 = i15 + 1;
            int i18 = i16 + i11;
            if (bArr[i17] != 1) {
                throw oh0.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i14];
            System.arraycopy(bArr, i17, bArr2, 0, i14);
            int i19 = i17 + i14;
            if (bArr[i19] != 3) {
                throw oh0.a("Error parsing vorbis codec private", null);
            }
            int i20 = i19 + i18;
            if (bArr[i20] != 5) {
                throw oh0.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i20, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw oh0.a("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(jm2 jm2Var) throws oh0 {
        try {
            int iQ = jm2Var.q();
            if (iQ == 1) {
                return true;
            }
            if (iQ == 65534) {
                jm2Var.f(24);
                if (jm2Var.z() == p4.f13545h0.getMostSignificantBits()) {
                    if (jm2Var.z() == p4.f13545h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw oh0.a("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(String str) throws oh0 {
        byte[] bArr = this.f12982k;
        if (bArr != null) {
            return bArr;
        }
        throw oh0.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0568  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.n r21, int r22) throws com.google.android.gms.internal.ads.oh0 {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o4.e(com.google.android.gms.internal.ads.n, int):void");
    }
}
