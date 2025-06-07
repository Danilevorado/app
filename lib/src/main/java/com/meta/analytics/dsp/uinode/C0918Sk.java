package com.meta.analytics.dsp.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0918Sk extends AnimationAnimationListenerC0739Ln {
    public final /* synthetic */ C0917Sj A00;

    public C0918Sk(C0917Sj c0917Sj) {
        this.A00 = c0917Sj;
    }

    @Override // com.meta.analytics.dsp.uinode.AnimationAnimationListenerC0739Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC0740Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
