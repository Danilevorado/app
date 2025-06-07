package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0847Pr extends FrameLayout {
    public static final int A08 = (int) (LD.A02 * 16.0f);
    public BZ A00;
    public SF A01;
    public C9I A02;
    public C0722Kw A03;
    public C7R A04;
    public C7C A05;
    public final C1073Yn A06;
    public final JA A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(J2 j22, String str, Map<String, String> map) {
        A02();
        this.A02 = new C9I(this.A06, j22, this.A00, str, map);
        if (C0662Ih.A1X(this.A06)) {
            this.A01 = new SF(this.A06, j22, this.A00, str, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C0847Pr(C1073Yn c1073Yn, JA ja2) {
        super(c1073Yn);
        this.A07 = ja2;
        this.A06 = c1073Yn;
        setUpView(c1073Yn);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        SF sf = this.A01;
        if (sf != null) {
            sf.A0C();
            this.A01 = null;
        }
        C9I c9i = this.A02;
        if (c9i != null) {
            c9i.A0i();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC04358s abstractC04358s) {
        this.A00.getEventBus().A05(abstractC04358s);
    }

    public final void A05(QM qm) {
        this.A00.A0b(qm, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public SA getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1073Yn c1073Yn) {
        this.A00.A0X();
        C7R c7r = new C7R(c1073Yn);
        this.A04 = c7r;
        this.A00.A0c(c7r);
        this.A03 = new C0722Kw(c1073Yn, this.A07);
        this.A00.A0c(new AnonymousClass86(c1073Yn));
        this.A00.A0c(this.A03);
        C7C c7c = new C7C(c1073Yn, true, this.A07);
        this.A05 = c7c;
        this.A00.A0c(c7c);
        this.A00.A0c(new L7(this.A05, QZ.A03, true, true));
        if (!this.A00.A0g()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i10 = A08;
        layoutParams.setMargins(i10, i10, i10, i10);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C1073Yn c1073Yn) {
        BZ bz = new BZ(c1073Yn);
        this.A00 = bz;
        bz.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AbstractC0740Lo.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC0846Pq(this));
    }

    private void setUpView(C1073Yn c1073Yn) {
        setUpVideo(c1073Yn);
        setUpPlugins(c1073Yn);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f5) {
        this.A00.setVolume(f5);
        this.A03.A09();
    }
}
