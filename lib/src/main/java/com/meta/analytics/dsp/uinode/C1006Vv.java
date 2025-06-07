package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1006Vv implements InterfaceC0623Gt {
    public final HG<? super C1007Vw> A00;

    public C1006Vv() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C1006Vv(HG<? super C1007Vw> hg) {
        this.A00 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0623Gt
    public final InterfaceC0624Gu A4X() {
        return new C1007Vw(this.A00);
    }
}
