package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0989Ve implements InterfaceC0645Hq {
    public long A00;
    public long A01;
    public C04649x A02 = C04649x.A04;
    public boolean A03;
    public final InterfaceC0632Hd A04;

    public C0989Ve(InterfaceC0632Hd interfaceC0632Hd) {
        this.A04 = interfaceC0632Hd;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A5T();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A7k());
            this.A03 = false;
        }
    }

    public final void A02(long j10) {
        this.A01 = j10;
        if (this.A03) {
            this.A00 = this.A04.A5T();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0645Hq
    public final C04649x A7h() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0645Hq
    public final long A7k() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA5T = this.A04.A5T();
            long positionUs = this.A00;
            long j10 = jA5T - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = C9W.A00(j10);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A00(j10);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0645Hq
    public final C04649x AGA(C04649x c04649x) {
        if (this.A03) {
            A02(A7k());
        }
        this.A02 = c04649x;
        return c04649x;
    }
}
