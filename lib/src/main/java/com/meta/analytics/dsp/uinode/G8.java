package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class G8 {
    public static String[] A09 = {"Ae51WtdtbsQ7oHVSUK2kH2lkhYtCD", "qx7lDBYo1odo5Y55vJBjPuPd0SCIUsyA", "8Fm6CMM7j8ObWzEih", "Wlrw6QUG7RBgeIlzL5kKGv4h4BsSo73q", "KMN6ZJtdLdMqvcVUA0dmI7c1fz02SP9b", "8oEfNfnBPUmBxW5HI", "jCL3JtrXJCo63I6Hw50xrAvVkRQtnXEj", "6zRYHFDNSsaLRa7ASpeJIQcC6Xopjreo"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C0654Hz A07 = new C0654Hz();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C0654Hz c0654Hz, int i10) {
        int iA06;
        int position;
        int totalLength;
        if (i10 < 4) {
            return;
        }
        c0654Hz.A0Z(3);
        int i11 = i10 - 4;
        if (((c0654Hz.A0E() & 128) != 0 ? 1 : 0) == 0) {
            iA06 = this.A07.A06();
            position = this.A07.A07();
            if (iA06 >= position) {
                return;
            } else {
                return;
            }
        }
        String[] strArr = A09;
        if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
            String[] strArr2 = A09;
            strArr2[2] = "m4TsyqBzkyxUuct48";
            strArr2[5] = "zfIYrv7wq9TBAE9Jz";
            if (i11 < 7 || (totalLength = c0654Hz.A0G()) < 4) {
                return;
            }
            this.A01 = c0654Hz.A0I();
            this.A00 = c0654Hz.A0I();
            this.A07.A0W(totalLength - 4);
            i11 -= 7;
            iA06 = this.A07.A06();
            position = this.A07.A07();
            if (iA06 >= position && i11 > 0) {
                int bytesToRead = Math.min(i11, position - iA06);
                C0654Hz c0654Hz2 = this.A07;
                String[] strArr3 = A09;
                if (strArr3[4].charAt(22) == strArr3[7].charAt(22)) {
                    A09[6] = "1YWr3OwQ0jPjYWbciqj9BosGRiIvHZyi";
                    c0654Hz.A0c(c0654Hz2.A00, iA06, bytesToRead);
                    this.A07.A0Y(iA06 + bytesToRead);
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C0654Hz c0654Hz, int i10) {
        if (i10 < 19) {
            return;
        }
        this.A05 = c0654Hz.A0I();
        this.A04 = c0654Hz.A0I();
        c0654Hz.A0Z(11);
        this.A02 = c0654Hz.A0I();
        this.A03 = c0654Hz.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C0654Hz c0654Hz, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        c0654Hz.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i11 = i10 / 5;
        for (int index = 0; index < i11; index++) {
            int iA0E = c0654Hz.A0E();
            int a10 = c0654Hz.A0E();
            int iA0E2 = c0654Hz.A0E();
            int iA0E3 = c0654Hz.A0E();
            int entryCount = iA0E2 - 128;
            int i12 = (int) (a10 + (entryCount * 1.402d));
            int g10 = (int) ((a10 - ((iA0E3 - 128) * 0.34414d)) - ((iA0E2 - 128) * 0.71414d));
            int entryCount2 = c0654Hz.A0E() << 24;
            this.A08[iA0E] = entryCount2 | (IF.A06(i12, 0, 255) << 16) | (IF.A06(g10, 0, 255) << 8) | IF.A06((int) (a10 + ((iA0E3 - 128) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    public final C0592Fn A06() {
        int iA0E;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A07() == 0 || this.A07.A06() != this.A07.A07()) {
            return null;
        }
        boolean z10 = this.A06;
        if (A09[6].charAt(24) == 'V') {
            throw new RuntimeException();
        }
        A09[1] = "nq70zeHujM7cnH9A4IhpB5iOObfNW5He";
        if (!z10) {
            return null;
        }
        this.A07.A0Y(0);
        int[] iArr = new int[this.A01 * this.A00];
        int switchBits = 0;
        while (switchBits < iArr.length) {
            int argbBitmapDataIndex = this.A07.A0E();
            if (argbBitmapDataIndex != 0) {
                int[] argbBitmapData = this.A08;
                iArr[switchBits] = argbBitmapData[argbBitmapDataIndex];
                switchBits++;
            } else {
                int argbBitmapDataIndex2 = this.A07.A0E();
                if (argbBitmapDataIndex2 != 0) {
                    if ((argbBitmapDataIndex2 & 64) == 0) {
                        iA0E = argbBitmapDataIndex2 & 63;
                    } else {
                        iA0E = ((argbBitmapDataIndex2 & 63) << 8) | this.A07.A0E();
                    }
                    Arrays.fill(iArr, switchBits, switchBits + iA0E, (argbBitmapDataIndex2 & 128) == 0 ? 0 : this.A08[this.A07.A0E()]);
                    switchBits += iA0E;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888);
        float f5 = this.A02;
        int argbBitmapDataIndex3 = this.A05;
        float f10 = f5 / argbBitmapDataIndex3;
        float f11 = this.A03;
        int i10 = this.A04;
        return new C0592Fn(bitmapCreateBitmap, f10, 0, f11 / i10, 0, this.A01 / argbBitmapDataIndex3, this.A00 / i10);
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
