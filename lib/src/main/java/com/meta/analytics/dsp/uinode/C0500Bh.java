package com.meta.analytics.dsp.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0500Bh extends C1098Zn {
    public final /* synthetic */ C0499Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.C1098Zn
    public final int A0O(View view, int i10) {
        AbstractC03394o abstractC03394oA08 = A08();
        if (!abstractC03394oA08.A20()) {
            return 0;
        }
        C03404p c03404p = (C03404p) view.getLayoutParams();
        return A0N(abstractC03394oA08.A0k(view) - c03404p.leftMargin, abstractC03394oA08.A0n(view) + c03404p.rightMargin, abstractC03394oA08.A0e(), abstractC03394oA08.A0h() - abstractC03394oA08.A0f(), i10) + this.A00.A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0500Bh(C0499Bg c0499Bg, C1073Yn c1073Yn) {
        super(c1073Yn);
        this.A00 = c0499Bg;
    }

    @Override // com.meta.analytics.dsp.uinode.C1098Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C1098Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.meta.analytics.dsp.uinode.C1098Zn
    public final PointF A0P(int i10) {
        return this.A00.A4O(i10);
    }
}
