package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* loaded from: assets/audience_network.dex */
public final class CV {
    public static String[] A0A = {"VV6EzFzDFGyxh7278LhkWh1nAnO", "a", "RIeoUtwh2k0Lp", "KiUc8yTTjWF6Y9v", "6tIA8m5WM2YSgVpCAFtgKZOFEkm", "A00z45", "ej2X1eDppCFfwh6aI5B812e88v7VHLnd", "obdd9bh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public CP A04;
    public C0520Ce A05;
    public final C4 A06;
    public final C0522Cg A07 = new C0522Cg();
    public final C0654Hz A09 = new C0654Hz(1);
    public final C0654Hz A08 = new C0654Hz();

    public CV(C4 c42) {
        this.A06 = c42;
    }

    private C0521Cf A00() {
        int i10 = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            C0522Cg c0522Cg = this.A07;
            if (A0A[2].length() == 16) {
                throw new RuntimeException();
            }
            A0A[2] = "yH";
            return c0522Cg.A08;
        }
        return this.A05.A00(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C0654Hz c0654Hz = this.A07.A09;
        C0521Cf encryptionBox = A00();
        if (encryptionBox.A00 != 0) {
            c0654Hz.A0Z(encryptionBox.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c0654Hz.A0Z(c0654Hz.A0I() * 6);
        }
    }

    public final int A03() {
        C0654Hz c0654Hz;
        int vectorSize;
        if (!this.A07.A0A) {
            return 0;
        }
        C0521Cf c0521CfA00 = A00();
        if (A0A[5].length() != 6) {
            throw new RuntimeException();
        }
        A0A[1] = "c";
        if (c0521CfA00.A00 != 0) {
            c0654Hz = this.A07.A09;
            vectorSize = c0521CfA00.A00;
        } else {
            byte[] initVectorData = c0521CfA00.A04;
            this.A08.A0b(initVectorData, initVectorData.length);
            c0654Hz = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean z10 = this.A07.A0H[this.A01];
        this.A09.A00[0] = (byte) ((z10 ? 128 : 0) | vectorSize);
        this.A09.A0Y(0);
        C4 c42 = this.A06;
        C0654Hz initializationVectorData = this.A09;
        c42.AFR(initializationVectorData, 1);
        this.A06.AFR(c0654Hz, vectorSize);
        if (!z10) {
            return vectorSize + 1;
        }
        C0654Hz c0654Hz2 = this.A07.A09;
        int iA0I = c0654Hz2.A0I();
        c0654Hz2.A0Z(-2);
        int i10 = (iA0I * 6) + 2;
        this.A06.AFR(c0654Hz2, i10);
        return vectorSize + 1 + i10;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j10) {
        long jA01 = C9W.A01(j10);
        for (int i10 = this.A01; i10 < this.A07.A00 && this.A07.A00(i10) < jA01; i10++) {
            if (this.A07.A0I[i10]) {
                this.A03 = i10;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C0521Cf encryptionBox = this.A05.A00(this.A07.A07.A02);
        this.A06.A5n(this.A05.A07.A0I(drmInitData.A02(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A07(C0520Ce c0520Ce, CP cp) {
        this.A05 = (C0520Ce) AbstractC0629Ha.A01(c0520Ce);
        this.A04 = (CP) AbstractC0629Ha.A01(cp);
        this.A06.A5n(c0520Ce.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        int i10 = this.A00 + 1;
        this.A00 = i10;
        int[] iArr = this.A07.A0E;
        int i11 = this.A02;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.A02 = i11 + 1;
        this.A00 = 0;
        return false;
    }
}
