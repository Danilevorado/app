package com.meta.analytics.dsp.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0917Sj extends KT {
    public final /* synthetic */ InterfaceC0835Pf A00;
    public final /* synthetic */ C0836Pg A01;

    public C0917Sj(C0836Pg c0836Pg, InterfaceC0835Pf interfaceC0835Pf) {
        this.A01 = c0836Pg;
        this.A00 = interfaceC0835Pf;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0918Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
