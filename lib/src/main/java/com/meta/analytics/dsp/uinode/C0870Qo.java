package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0870Qo extends AnimatorListenerAdapter {
    public final /* synthetic */ KF A00;

    public C0870Qo(KF kf) {
        this.A00 = kf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00.A04) {
            AbstractC0740Lo.A0L(this.A00.A03);
        }
        this.A00.A03.setAlpha(1.0f);
        this.A00.A01 = EnumC0864Qi.A03;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00.A04) {
            AbstractC0740Lo.A0H(this.A00.A03);
        }
        this.A00.A01 = EnumC0864Qi.A05;
        if (this.A00.A00 != null) {
            this.A00.A00.setListener(null);
            this.A00.A00 = null;
        }
    }
}
