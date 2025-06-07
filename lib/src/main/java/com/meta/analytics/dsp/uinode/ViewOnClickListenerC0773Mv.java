package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0773Mv implements View.OnClickListener {
    public final /* synthetic */ U6 A00;

    public ViewOnClickListenerC0773Mv(U6 u62) {
        this.A00 = u62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.ACI(C2U.A05);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
