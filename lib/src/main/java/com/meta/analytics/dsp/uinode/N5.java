package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N5 implements View.OnClickListener {
    public final /* synthetic */ C2W A00;
    public final /* synthetic */ C0770Ms A01;
    public final /* synthetic */ N6 A02;

    public N5(N6 n62, C0770Ms c0770Ms, C2W c2w) {
        this.A02 = n62;
        this.A01 = c0770Ms;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A02.ACS(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
