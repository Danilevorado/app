package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class JB implements View.OnAttachStateChangeListener {
    public final /* synthetic */ J9 A00;
    public final /* synthetic */ JA A01;

    public JB(JA ja2, J9 j92) {
        this.A01 = ja2;
        this.A00 = j92;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
