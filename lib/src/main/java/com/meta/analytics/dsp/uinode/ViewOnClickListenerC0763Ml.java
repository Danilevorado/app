package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0763Ml implements View.OnClickListener {
    public final /* synthetic */ C0765Mn A00;

    public ViewOnClickListenerC0763Ml(C0765Mn c0765Mn) {
        this.A00 = c0765Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A04.A9N();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
