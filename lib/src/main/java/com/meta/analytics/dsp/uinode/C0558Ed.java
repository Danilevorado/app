package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0558Ed extends C1098Zn {
    public final /* synthetic */ C0557Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0558Ed(C0557Ec c0557Ec, Context context) {
        super(context);
        this.A00 = c0557Ec;
    }

    @Override // com.meta.analytics.dsp.uinode.C1098Zn, com.meta.analytics.dsp.uinode.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C03494z c03494z) {
        C0557Ec c0557Ec = this.A00;
        int[] iArrA0H = c0557Ec.A0H(((ZY) c0557Ec).A00.getLayoutManager(), view);
        int time = iArrA0H[0];
        int dy = iArrA0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c03494z.A04(time, dy, dx, ((C1098Zn) this).A04);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C1098Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C1098Zn
    public final int A0L(int i10) {
        return Math.min(100, super.A0L(i10));
    }
}
