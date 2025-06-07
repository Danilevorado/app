package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0944Tk extends KT {
    public final /* synthetic */ AbstractC0799Nv A00;

    public C0944Tk(AbstractC0799Nv abstractC0799Nv) {
        this.A00 = abstractC0799Nv;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (this.A00.isPressed()) {
            this.A00.postDelayed(this, r2.A07);
        } else {
            this.A00.setPressed(true);
            AbstractC0799Nv abstractC0799Nv = this.A00;
            abstractC0799Nv.postOnAnimationDelayed(abstractC0799Nv.A09, 250L);
        }
    }
}
