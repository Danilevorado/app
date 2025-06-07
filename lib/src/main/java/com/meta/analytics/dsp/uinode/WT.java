package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WT implements H8 {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0628Gy A03;
    public final Uri A05;
    public final C0565Ek A07;
    public final InterfaceC0624Gu A08;
    public final C0635Hg A09;
    public volatile boolean A0A;
    public final /* synthetic */ CD A0B;
    public final C0516Bz A06 = new C0516Bz();
    public boolean A04 = true;
    public long A01 = -1;

    public WT(CD cd, Uri uri, InterfaceC0624Gu interfaceC0624Gu, C0565Ek c0565Ek, C0635Hg c0635Hg) {
        this.A0B = cd;
        this.A05 = (Uri) AbstractC0629Ha.A01(uri);
        this.A08 = (InterfaceC0624Gu) AbstractC0629Ha.A01(interfaceC0624Gu);
        this.A07 = (C0565Ek) AbstractC0629Ha.A01(c0565Ek);
        this.A09 = c0635Hg;
    }

    public final void A04(long j10, long j11) {
        this.A06.A00 = j10;
        this.A02 = j11;
        this.A04 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A4A() {
        this.A0A = true;
    }

    @Override // com.meta.analytics.dsp.uinode.H8
    public final void A9P() throws InterruptedException, IOException {
        char cCharAt;
        char cCharAt2;
        C1047Xn c1047Xn;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long jA7i = this.A06.A00;
                C0628Gy c0628Gy = new C0628Gy(this.A05, jA7i, -1L, this.A0B.A0b);
                this.A03 = c0628Gy;
                long jADl = this.A08.ADl(c0628Gy);
                this.A01 = jADl;
                if (jADl != -1) {
                    this.A01 = jADl + jA7i;
                }
                c1047Xn = new C1047Xn(this.A08, jA7i, this.A01);
                InterfaceC0511Bs extractor = this.A07.A02(c1047Xn, this.A08.A8E());
                if (this.A04) {
                    extractor.AFh(jA7i, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AEH(c1047Xn, this.A06);
                    if (c1047Xn.A7i() > this.A0B.A0P + jA7i) {
                        jA7i = c1047Xn.A7i();
                        this.A09.A01();
                        this.A0B.A0R.post(this.A0B.A0a);
                    }
                }
            } finally {
                if (cCharAt != cCharAt2) {
                }
                throw new RuntimeException();
            }
            if (result == 1) {
                result = 0;
            } else {
                C0516Bz c0516Bz = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c0516Bz.A00 = c1047Xn.A7i();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            IF.A0W(this.A08);
        }
    }
}
