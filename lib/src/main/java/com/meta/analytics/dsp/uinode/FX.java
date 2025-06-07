package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1177b6 {
    public final C1073Yn A00;
    public final JR A01;

    public FX(C1073Yn c1073Yn, C3C c3c, List<V2> list, JR jr) {
        super(c3c, list, c1073Yn);
        this.A00 = c1073Yn;
        this.A01 = jr == null ? new JR() : jr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03274c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i10) {
        return new UR(new MI(this.A00, this.A01));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03274c
    /* renamed from: A0H */
    public final void A0D(UR ur, int i10) {
        super.A0D(ur, i10);
        MI mi = (MI) ur.A0j();
        A0F(mi.getImageCardView(), i10);
        if (((AbstractC1177b6) this).A01.get(i10) != null) {
            mi.setTitle(((AbstractC1177b6) this).A01.get(i10).getAdHeadline());
            mi.setSubtitle(((AbstractC1177b6) this).A01.get(i10).getAdLinkDescription());
            mi.setButtonText(((AbstractC1177b6) this).A01.get(i10).getAdCallToAction());
        }
        V2 v22 = ((AbstractC1177b6) this).A01.get(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mi);
        v22.A1O(mi, mi, arrayList);
    }
}
