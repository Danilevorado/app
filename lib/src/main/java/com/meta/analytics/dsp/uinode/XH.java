package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class XH extends AbstractC0530Co {
    public static byte[] A02;
    public static String[] A03 = {"8dTWvXK8tch0WiEnFvHb8QUOTjgSOqY9", "GP5XsFGUIcP3F8wb7eo6", "CqCUMDrIKsNfOt03xA9INRdZ8", "ntm6pkiJXJn0b4vYMFRbAtYqalurqDmt", "MKNWZ4ceQqyXKZHhShlPBWdiS", "qmQfSGtBK4Bh2Swsb", "DS4", "jEA"};
    public XI A00;
    public C0641Hm A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-97, -77, -94, -89, -83, 109, -92, -86, -97, -95};
    }

    static {
        A03();
    }

    private int A00(C0654Hz c0654Hz) {
        int i10 = (c0654Hz.A00[2] & 255) >> 4;
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int i11 = i10 - 2;
                String[] strArr = A03;
                String str = strArr[3];
                String str2 = strArr[0];
                int iCharAt = str.charAt(11);
                int blockSizeCode = str2.charAt(11);
                if (iCharAt == blockSizeCode) {
                    A03[1] = "m7WV3F64xJdvTLT";
                    return 576 << i11;
                }
                String[] strArr2 = A03;
                strArr2[6] = "ZGd";
                strArr2[7] = "V9k";
                return 576 << i11;
            case 6:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                c0654Hz.A0Z(4);
                c0654Hz.A0O();
                String[] strArr3 = A03;
                String str3 = strArr3[3];
                String str4 = strArr3[0];
                int iCharAt2 = str3.charAt(11);
                int blockSizeCode2 = str4.charAt(11);
                if (iCharAt2 != blockSizeCode2) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[6] = "ycs";
                strArr4[7] = "AJV";
                int value = i10 == 6 ? c0654Hz.A0E() : c0654Hz.A0I();
                c0654Hz.A0Y(0);
                int blockSizeCode3 = value + 1;
                return blockSizeCode3;
            case 8:
            case 9:
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode4 = 256 << (i10 - 8);
                return blockSizeCode4;
            default:
                return -1;
        }
    }

    public static boolean A04(C0654Hz c0654Hz) {
        return c0654Hz.A04() >= 5 && c0654Hz.A0E() == 127 && c0654Hz.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0530Co
    public final long A07(C0654Hz c0654Hz) {
        if (!A05(c0654Hz.A00)) {
            return -1L;
        }
        return A00(c0654Hz);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0530Co
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0530Co
    public final boolean A0A(C0654Hz c0654Hz, long j10, C0529Cn c0529Cn) throws InterruptedException, IOException {
        byte[] bArr = c0654Hz.A00;
        if (this.A01 == null) {
            this.A01 = new C0641Hm(bArr, 17);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, c0654Hz.A07());
            bArrCopyOfRange[4] = Byte.MIN_VALUE;
            c0529Cn.A00 = Format.A07(null, A02(0, 10, 50), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, Collections.singletonList(bArrCopyOfRange), null, 0, null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            XI xi = new XI(this);
            this.A00 = xi;
            xi.A01(c0654Hz);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        XI xi2 = this.A00;
        if (A03[5].length() != 17) {
            throw new RuntimeException();
        }
        A03[1] = "qWJSCS9yuHod5mMI2FbA5J9U";
        if (xi2 != null) {
            xi2.A00(j10);
            c0529Cn.A01 = this.A00;
        }
        return false;
    }
}
