package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9Y extends AbstractC0926Ss {
    public OL A00;
    public final ImageView A01;
    public final C5T A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C9Y(C1073Yn c1073Yn, InterfaceC0761Mj interfaceC0761Mj, J2 j22, AbstractC1176b5 abstractC1176b5, C03786c c03786c, MC mc) {
        super(c1073Yn, interfaceC0761Mj, j22, abstractC1176b5, c03786c, mc);
        this.A02 = new C0921Sn(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC0950Tq(imageView, super.A03).A05(super.A01.A0x().A0D().A00(), super.A01.A0x().A0D().A01()).A06(new C0920Sm(this)).A07(super.A01.A0x().A0D().A07());
    }

    private OL A01(int i10) {
        if (this.A01.getParent() != null) {
            AbstractC0740Lo.A0J(this.A01);
        }
        return OM.A00(new OO(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i10).A0K(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i10) {
        AbstractC0740Lo.A0J(this.A00);
        OL olA01 = A01(i10);
        this.A00 = olA01;
        C1P colors = olA01.getColors();
        OL ol = this.A00;
        AbstractC0740Lo.A0M(this, colors.A07(ol != null && (ol.A11() || (this.A00 instanceof AbstractC0940Tg))));
        this.A07.setFullscreen(this.A00.A11());
        this.A07.A06(colors, ViewOnClickListenerC0945Tl.A08(super.A01));
        addView(this.A00, 0, AbstractC0926Ss.A0E);
        OL ol2 = this.A00;
        setUpFullscreenMode(ol2 != null && ol2.A11());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0926Ss
    public final void A0Q() {
        AbstractC0740Lo.A0L(this.A00);
        AbstractC0740Lo.A0L(this.A07);
        this.A03.set(true);
        A05();
        int iA03 = super.A01.A0x().A0D().A03();
        if (iA03 > 0) {
            OL ol = this.A00;
            if (ol != null) {
                ol.A0z();
            }
            A0R(iA03, new C0919Sl(this));
            return;
        }
        this.A05.set(true);
        MB mb2 = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        mb2.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0926Ss
    public final void A0S(C5V c5v) {
        c5v.A0N(this.A02);
        int orientation = c5v.A0J().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        AbstractC0740Lo.A0H(this.A00);
        AbstractC0740Lo.A0H(this.A07);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0926Ss
    public final boolean A0T() {
        OL ol = this.A00;
        return ol != null && ol.A12(false);
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACW(boolean z10) {
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACu(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        OL ol = this.A00;
        if (ol != null) {
            return ol.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0926Ss, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0x().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0926Ss, com.meta.analytics.dsp.uinode.MD
    public final void onDestroy() {
        if (C0662Ih.A1W(super.A03)) {
            super.A03.A0A().AGk(this.A01);
        }
        OL ol = this.A00;
        if (ol != null) {
            ol.A0v();
        }
        super.onDestroy();
    }
}
