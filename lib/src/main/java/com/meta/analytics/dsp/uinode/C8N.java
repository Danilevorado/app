package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8N extends MX {
    public final /* synthetic */ LX A00;

    public C8N(LX lx) {
        this.A00 = lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MY my) {
        if (this.A00.A01 == null || this.A00.A03 || my.A00().getAction() != 0) {
            return;
        }
        this.A00.A05.removeCallbacksAndMessages(null);
        if (this.A00.A0D(EnumC0864Qi.A05)) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        if (this.A00.A02) {
            this.A00.A05.postDelayed(new C0733Lh(this), this.A00.A00);
        }
    }
}
