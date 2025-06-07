package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1120aB implements InterfaceC02792f {
    public Drawable A00;
    public final /* synthetic */ AbstractC02782e A01;

    public C1120aB(AbstractC02782e abstractC02782e) {
        this.A01 = abstractC02782e;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02792f
    public final Drawable A6J() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02792f
    public final AbstractC02782e A6K() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02792f
    public final boolean A7l() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02792f
    public final boolean A8G() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02792f
    public final void AFu(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02792f
    public final void AG7(int i10, int i11) {
        if (i10 > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i10);
        }
        if (i11 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i11);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02792f
    public final void AGE(int i10, int i11, int i12, int i13) {
        this.A01.A05.set(i10, i11, i12, i13);
        AbstractC02782e abstractC02782e = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(abstractC02782e.A04.left + i10, this.A01.A04.top + i11, this.A01.A04.right + i12, this.A01.A04.bottom + i13);
    }
}
