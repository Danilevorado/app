package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1110a0 implements C3D {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C03073h A01;

    public C1110a0(C03073h c03073h) {
        this.A01 = c03073h;
    }

    @Override // com.meta.analytics.dsp.uinode.C3D
    public final C03103k AAk(View view, C03103k c03103k) {
        C03103k c03103kA06 = C3T.A06(view, c03103k);
        if (c03103kA06.A07()) {
            return c03103kA06;
        }
        Rect rect = this.A00;
        rect.left = c03103kA06.A03();
        rect.top = c03103kA06.A05();
        rect.right = c03103kA06.A04();
        rect.bottom = c03103kA06.A02();
        int i10 = this.A01.getChildCount();
        for (int count = 0; count < i10; count++) {
            C03103k c03103kA05 = C3T.A05(this.A01.getChildAt(count), c03103kA06);
            rect.left = Math.min(c03103kA05.A03(), rect.left);
            rect.top = Math.min(c03103kA05.A05(), rect.top);
            rect.right = Math.min(c03103kA05.A04(), rect.right);
            rect.bottom = Math.min(c03103kA05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C03103k applied = c03103kA06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
