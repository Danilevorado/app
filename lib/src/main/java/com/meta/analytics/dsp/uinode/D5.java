package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class D5 {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0537Cy A05;
    public final C0653Hy A06 = new C0653Hy(new byte[64]);
    public final IB A07;

    public D5(InterfaceC0537Cy interfaceC0537Cy, IB ib2) {
        this.A05 = interfaceC0537Cy;
        this.A07 = ib2;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long jA04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j10 = jA04 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j10);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AFg();
    }

    public final void A03(C0654Hz c0654Hz) throws C04629v {
        c0654Hz.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0654Hz.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ADt(this.A01, true);
        this.A05.A4R(c0654Hz);
        this.A05.ADs();
    }
}
