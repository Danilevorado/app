package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: assets/audience_network.dex */
public class QY extends AnimatorListenerAdapter {
    public final /* synthetic */ L7 A00;

    public QY(L7 l72) {
        this.A00 = l72;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.setVisibility(8);
    }
}
