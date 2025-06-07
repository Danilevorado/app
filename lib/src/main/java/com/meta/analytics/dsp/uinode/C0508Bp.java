package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0508Bp extends W7 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC0619Gp A0A;
    public final InterfaceC0632Hd A0B;

    public C0508Bp(TrackGroup trackGroup, int[] iArr, InterfaceC0619Gp interfaceC0619Gp, long j10, long j11, long j12, float f5, float f10, long j13, InterfaceC0632Hd interfaceC0632Hd) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0619Gp;
        this.A07 = j10 * 1000;
        this.A06 = j11 * 1000;
        this.A08 = 1000 * j12;
        this.A04 = f5;
        this.A05 = f10;
        this.A09 = j13;
        this.A0B = interfaceC0632Hd;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j10) {
        long jA67 = (long) (this.A0A.A67() * this.A04);
        int i10 = 0;
        for (int i11 = 0; i11 < super.A03; i11++) {
            if (j10 == Long.MIN_VALUE || !A00(i11, j10)) {
                if (Math.round(A76(i11).A04 * this.A00) <= jA67) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.meta.analytics.dsp.uinode.W7, com.meta.analytics.dsp.uinode.InterfaceC0610Gg
    public final void A5U() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0610Gg
    public final int A7v() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.W7, com.meta.analytics.dsp.uinode.InterfaceC0610Gg
    public final void ACc(float f5) {
        this.A00 = f5;
    }
}
