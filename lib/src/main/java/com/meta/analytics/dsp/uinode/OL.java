package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public abstract class OL extends RelativeLayout {
    public static final int A07 = (int) (LD.A02 * 16.0f);
    public static final int A08 = (int) (LD.A02 * 28.0f);
    public C1P A00;
    public boolean A01;
    public final C1073Yn A02;
    public final J2 A03;
    public final ViewOnClickListenerC0945Tl A04;
    public final O9 A05;
    public final OP A06;

    public abstract boolean A11();

    public OL(OP op, boolean z10) {
        C1P c1pA00;
        super(op.A05());
        this.A06 = op;
        C1073Yn c1073YnA05 = op.A05();
        this.A02 = c1073YnA05;
        this.A03 = op.A06();
        if (op.A00() == 1) {
            c1pA00 = op.A04().A0w().A01();
        } else {
            c1pA00 = op.A04().A0w().A00();
        }
        this.A00 = c1pA00;
        this.A01 = z10;
        ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl = new ViewOnClickListenerC0945Tl(op.A05(), op.A04(), this.A00, op.A06(), op.A09(), op.A0B(), op.A07());
        this.A04 = viewOnClickListenerC0945Tl;
        viewOnClickListenerC0945Tl.setRoundedCornersEnabled(A00());
        viewOnClickListenerC0945Tl.setViewShowsOverMedia(A0D());
        AbstractC0740Lo.A0G(AdError.NO_FILL_ERROR_CODE, viewOnClickListenerC0945Tl);
        O9 o92 = new O9(c1073YnA05, this.A00, this.A01, A01(), A02());
        this.A05 = o92;
        AbstractC0740Lo.A0K(o92);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public void A0B(C9H c9h) {
    }

    public void A0C(AnonymousClass93 anonymousClass93) {
    }

    public boolean A0D() {
        return true;
    }

    public void A0v() {
    }

    public void A0w() {
    }

    public void A0x() {
    }

    public void A0y() {
    }

    public void A0z() {
    }

    public void A10(C1G c1g, String str, double d10, Bundle bundle) {
        this.A05.A03(c1g.A0E().A05(), c1g.A0E().A01(), null, false, !A11() && d10 > 0.0d && d10 < 1.0d);
        this.A04.setCta(c1g.A0F(), str, new HashMap());
    }

    public boolean A12(boolean z10) {
        return false;
    }

    public C1073Yn getAdContextWrapper() {
        return this.A02;
    }

    public J2 getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C1P getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC0945Tl getCtaButton() {
        return this.A04;
    }

    public O9 getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1P c1pA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c1pA00 = this.A06.A04().A0w().A01();
        } else {
            c1pA00 = this.A06.A04().A0w().A00();
        }
        this.A00 = c1pA00;
        this.A04.setViewShowsOverMedia(A0D());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A02(this.A00, this.A01);
    }
}
