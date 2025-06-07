package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public abstract class OA {
    public static final int A00 = AbstractC0740Lo.A00();

    public static void A00(C1073Yn c1073Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC0950Tq(viewGroup, c1073Yn).A07(str);
        View view = new View(c1073Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0740Lo.A0R(view, c1073Yn);
        viewGroup.addView(view, 0);
    }
}
