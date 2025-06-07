package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0789Nl {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC0788Nk viewOnClickListenerC0788Nk = new ViewOnClickListenerC0788Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC0788Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC0787Nj(viewOnClickListenerC0788Nk));
        }
    }
}
