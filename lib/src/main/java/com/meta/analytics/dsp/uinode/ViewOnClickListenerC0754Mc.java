package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0754Mc implements View.OnClickListener {
    public final /* synthetic */ UA A00;

    public ViewOnClickListenerC0754Mc(UA ua2) {
        this.A00 = ua2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A07.ABX();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
