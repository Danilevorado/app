package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N0 implements View.OnClickListener {
    public final /* synthetic */ C0770Ms A00;
    public final /* synthetic */ U5 A01;

    public N0(U5 u52, C0770Ms c0770Ms) {
        this.A01 = u52;
        this.A00 = c0770Ms;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A9O();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
