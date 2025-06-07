package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03344j {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C03344j A00(AnonymousClass56 anonymousClass56, int i10) {
        View view = anonymousClass56.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C03344j A01(AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 0);
    }
}
