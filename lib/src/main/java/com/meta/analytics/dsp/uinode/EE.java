package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class EE implements XV {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public EE(long j10, long j11, By by) {
        this.A04 = j11;
        this.A01 = by.A02;
        this.A00 = by.A00;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j10 - j11;
            this.A03 = A88(j10);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j10) {
        long j11 = this.A02;
        if (j11 == -1) {
            return new C0(new C2(0L, this.A04));
        }
        int i10 = this.A01;
        long jA0E = IF.A0E((((this.A00 * j10) / 8000000) / i10) * i10, 0L, j11 - i10);
        long j12 = this.A04 + jA0E;
        long jA88 = A88(j12);
        C2 seekPoint = new C2(jA88, j12);
        if (jA88 < j10) {
            long j13 = this.A02;
            int i11 = this.A01;
            if (jA0E != j13 - i11) {
                long j14 = i11 + j12;
                return new C0(seekPoint, new C2(A88(j14), j14));
            }
        }
        return new C0(seekPoint);
    }

    @Override // com.meta.analytics.dsp.uinode.XV
    public final long A88(long j10) {
        return ((Math.max(0L, j10 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return this.A02 != -1;
    }
}
