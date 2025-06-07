package com.meta.analytics.dsp.uinode;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0867Ql implements Animator.AnimatorListener {
    public final /* synthetic */ KI A00;

    public C0867Ql(KI ki) {
        this.A00 = ki;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A02 = EnumC0864Qi.A05;
        AbstractC0740Lo.A0H(this.A00.A05);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
