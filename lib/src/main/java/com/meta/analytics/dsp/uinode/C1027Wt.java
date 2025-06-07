package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1027Wt implements DD {
    public static String[] A06 = {"f3ASEvE0MACuH7PXtcW6SQzpVLuDWBs6", "UAkl7YLcJ73MhJIfOQ7gtBxP58V39hXf", "sKTt9gGYn0qCOxzPnchEZBW", "TIj2tKxLfGdHgu1Q1GnzrxOOh9OPKkUY", "NlS114awdnJt6ePSWIiXVyR", "Ttbg6FQm3oQML", "hnRFaN1D1NI4WPLkXSYbmAvKq8H9o2zk", "6DjXFLFEMVHWeegs6rtlgiLmiwpKRWRw"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final D6 A04;
    public final C0654Hz A05 = new C0654Hz(32);

    public C1027Wt(D6 d62) {
        this.A04 = d62;
    }

    @Override // com.meta.analytics.dsp.uinode.DD
    public final void A4S(C0654Hz c0654Hz, boolean z10) {
        int i10 = -1;
        if (z10) {
            int iA0E = c0654Hz.A0E();
            int iA06 = c0654Hz.A06();
            String[] strArr = A06;
            String str = strArr[4];
            String str2 = strArr[2];
            int payloadStartOffset = str.length();
            if (payloadStartOffset != str2.length()) {
                throw new RuntimeException();
            }
            A06[5] = "fX8Qw0M3arh1i";
            i10 = iA06 + iA0E;
        }
        if (this.A03) {
            if (!z10) {
                return;
            }
            this.A03 = false;
            c0654Hz.A0Y(i10);
            this.A00 = 0;
        }
        while (c0654Hz.A04() > 0) {
            int payloadStartPosition = this.A00;
            if (payloadStartPosition < 3) {
                if (payloadStartPosition == 0) {
                    int tableId = c0654Hz.A0E();
                    c0654Hz.A0Y(c0654Hz.A06() - 1);
                    if (tableId == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int tableId2 = c0654Hz.A04();
                int iMin = Math.min(tableId2, 3 - this.A00);
                c0654Hz.A0c(this.A05.A00, this.A00, iMin);
                int payloadStartPosition2 = this.A00 + iMin;
                this.A00 = payloadStartPosition2;
                if (payloadStartPosition2 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int iA0E2 = this.A05.A0E();
                    int headerBytesToRead = this.A05.A0E();
                    this.A02 = (iA0E2 & 128) != 0;
                    this.A01 = (((iA0E2 & 15) << 8) | headerBytesToRead) + 3;
                    int headerBytesToRead2 = this.A05.A05();
                    if (headerBytesToRead2 < this.A01) {
                        byte[] bArr = this.A05.A00;
                        C0654Hz c0654Hz2 = this.A05;
                        int headerBytesToRead3 = this.A01;
                        c0654Hz2.A0W(Math.min(4098, Math.max(headerBytesToRead3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int iA04 = c0654Hz.A04();
                int headerBytesToRead4 = this.A01;
                int iMin2 = Math.min(iA04, headerBytesToRead4 - this.A00);
                c0654Hz.A0c(this.A05.A00, this.A00, iMin2);
                int payloadStartPosition3 = this.A00 + iMin2;
                this.A00 = payloadStartPosition3;
                int bodyBytesToRead = this.A01;
                if (payloadStartPosition3 != bodyBytesToRead) {
                    continue;
                } else {
                    if (this.A02) {
                        if (IF.A09(this.A05.A00, 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A05.A0W(this.A01 - 4);
                    } else {
                        this.A05.A0W(bodyBytesToRead);
                    }
                    this.A04.A4R(this.A05);
                    this.A00 = 0;
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.DD
    public final void A8q(IB ib2, InterfaceC0513Bu interfaceC0513Bu, DC dc2) {
        this.A04.A8q(ib2, interfaceC0513Bu, dc2);
        this.A03 = true;
    }

    @Override // com.meta.analytics.dsp.uinode.DD
    public final void AFg() {
        this.A03 = true;
    }
}
