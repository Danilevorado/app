package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1199bS implements AnonymousClass61 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1194bN A01;
    public final /* synthetic */ C1194bN A02;
    public final /* synthetic */ C8T A03;

    public C1199bS(C1194bN c1194bN, int i10, C8T c8t, C1194bN c1194bN2) {
        this.A01 = c1194bN;
        this.A00 = i10;
        this.A03 = c8t;
        this.A02 = c1194bN2;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.A00.ABw(this.A02, C0679Jb.A00(AdErrorType.NO_FILL));
    }
}
