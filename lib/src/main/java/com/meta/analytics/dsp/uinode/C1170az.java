package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1170az implements InterfaceC02551h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1176b5 A01;
    public final /* synthetic */ C1174b3 A02;
    public final /* synthetic */ InterfaceC02551h A03;
    public final /* synthetic */ C02561i A04;
    public final /* synthetic */ C1073Yn A05;
    public final /* synthetic */ EnumSet A06;

    public C1170az(C02561i c02561i, C1073Yn c1073Yn, AbstractC1176b5 abstractC1176b5, C1174b3 c1174b3, int i10, InterfaceC02551h interfaceC02551h, EnumSet enumSet) {
        this.A04 = c02561i;
        this.A05 = c1073Yn;
        this.A01 = abstractC1176b5;
        this.A02 = c1174b3;
        this.A00 = i10;
        this.A03 = interfaceC02551h;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 >= this.A02.A0s()) {
            return;
        }
        C02561i c02561i = this.A04;
        C1073Yn c1073Yn = this.A05;
        EnumSet enumSet = this.A06;
        C1174b3 c1174b3 = this.A02;
        c02561i.A0A(c1073Yn, enumSet, c1174b3, c1174b3.A0v(this.A00 + 1), this.A00 + 1, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551h
    public final void AAe(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AAe(adError);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551h
    public final void AAf() {
        this.A05.A00().AFq(this.A01.A12(), this.A02.A0w());
        if (this.A00 == 0) {
            this.A03.AAf();
        }
        A00();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551h
    public final void AES() {
        if (this.A00 == 0) {
            this.A03.AES();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02551h
    public final void AGm() {
        if (this.A00 == 0) {
            this.A03.AGm();
        }
    }
}
