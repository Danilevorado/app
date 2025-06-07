package com.meta.analytics.dsp.uinode;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0873Qr implements Animator.AnimatorListener {
    public final /* synthetic */ KA A00;

    public C0873Qr(KA ka2) {
        this.A00 = ka2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = EnumC0864Qi.A05;
        AbstractC0740Lo.A0H(this.A00.A05);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
