package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0609Gf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0619Gp A06;
    public final InterfaceC0632Hd A07;

    public W8(InterfaceC0619Gp interfaceC0619Gp) {
        this(interfaceC0619Gp, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC0632Hd.A00);
    }

    public W8(InterfaceC0619Gp interfaceC0619Gp, int i10, int i11, int i12, float f5, float f10, long j10, InterfaceC0632Hd interfaceC0632Hd) {
        this.A06 = interfaceC0619Gp;
        this.A03 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = f5;
        this.A01 = f10;
        this.A05 = j10;
        this.A07 = interfaceC0632Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0609Gf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0508Bp A4o(TrackGroup trackGroup, int... iArr) {
        return new C0508Bp(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
