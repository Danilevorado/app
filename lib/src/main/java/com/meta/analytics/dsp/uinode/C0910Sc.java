package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0910Sc implements InterfaceC0822Os {
    public final /* synthetic */ C0909Sb A00;

    public C0910Sc(C0909Sb c0909Sb) {
        this.A00 = c0909Sb;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0822Os
    public final void ADb(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0822Os
    public final void ADd(View view) {
        TS ts = (TS) view;
        ts.A16();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) ts.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
