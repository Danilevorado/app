package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class PQ extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final RD A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC1176b5 A05;
    public final C1073Yn A06;
    public final J2 A07;
    public final C0732Lg A08;
    public final MC A09;
    public final InterfaceC0761Mj A0A;
    public final RE A0B;

    public abstract void A0z();

    public abstract void A10();

    public abstract void A11();

    public abstract void A12(boolean z10);

    public abstract void A13(boolean z10);

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract C0832Pc getFullScreenAdStyle();

    public PQ(C1073Yn c1073Yn, InterfaceC0761Mj interfaceC0761Mj, J2 j22, AbstractC1176b5 abstractC1176b5, int i10, boolean z10, boolean z11, MC mc) {
        super(c1073Yn);
        this.A08 = new C0732Lg();
        this.A00 = false;
        TB tb2 = new TB(this);
        this.A02 = tb2;
        this.A01 = i10;
        this.A06 = c1073Yn;
        this.A04 = z10;
        this.A03 = z11;
        this.A09 = mc;
        this.A0A = interfaceC0761Mj;
        this.A05 = abstractC1176b5;
        this.A07 = j22;
        RE re = new RE(this, 1, new WeakReference(tb2), c1073Yn);
        this.A0B = re;
        re.A0W(abstractC1176b5.A0C());
        re.A0X(abstractC1176b5.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC1176b5 getAdDataBundle() {
        return this.A05;
    }

    public RE getAdViewabilityChecker() {
        return this.A0B;
    }

    public C0732Lg getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
