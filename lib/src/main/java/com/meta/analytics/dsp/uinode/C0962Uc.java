package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Uc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0962Uc extends AnimationAnimationListenerC0739Ln {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C0962Uc(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.meta.analytics.dsp.uinode.AnimationAnimationListenerC0739Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
