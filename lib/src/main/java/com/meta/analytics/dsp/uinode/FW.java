package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FW extends AbstractC1177b6 {
    public final C1073Yn A00;

    public FW(C3C c3c, List<V2> list, C1073Yn c1073Yn) {
        super(c3c, list, c1073Yn);
        this.A00 = c1073Yn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03274c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i10) {
        return new UR(new MN(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03274c
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void A0D(UR ur, int i10) {
        super.A0D(ur, i10);
        MN mn = (MN) ur.A0j();
        MZ imageView = (MZ) mn.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i10);
        V2 childAd = ((AbstractC1177b6) this).A01.get(i10);
        childAd.A11().A0K(this.A00);
        childAd.A1N(mn, mn);
    }
}
