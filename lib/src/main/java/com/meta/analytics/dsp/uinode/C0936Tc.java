package com.meta.analytics.dsp.uinode;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0936Tc extends OL implements OE {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC1176b5 A00;
    public final MC A01;
    public final OG A02;
    public final C0816Om A03;
    public final C0844Po A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{52, 48, 60, 58, 56};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C0936Tc(OP op, boolean z10) {
        int id;
        int iA01;
        super(op, z10);
        this.A01 = op.A09();
        AbstractC1176b5 abstractC1176b5A04 = op.A04();
        this.A00 = abstractC1176b5A04;
        C0816Om c0816Om = new C0816Om(op.A05(), op.A02());
        this.A03 = c0816Om;
        c0816Om.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(OL.A07, OL.A07, OL.A07, OL.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (op.A0C()) {
            C0844Po c0844Po = new C0844Po(op.A05());
            this.A04 = c0844Po;
            c0844Po.setPageDetails(op.A04().A10());
            AbstractC0740Lo.A0G(1007, c0844Po);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(2, getCtaButton().getId());
            layoutParams2.setMargins(OL.A07, OL.A07 - (OL.A07 / 2), OL.A07, 0);
            c0844Po.setLayoutParams(layoutParams2);
            id = c0844Po.getId();
            iA01 = op.A01() - (OL.A07 / 2);
        } else {
            id = getCtaButton().getId();
            iA01 = op.A01();
            this.A04 = null;
        }
        FrameLayout frameLayout = new FrameLayout(op.A05());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(10);
        layoutParams3.addRule(2, id);
        layoutParams3.setMargins(0, iA01, 0, 0);
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 17;
        layoutParams4.setMargins(OL.A07, 0, OL.A07, 0);
        frameLayout.addView(c0816Om, layoutParams4);
        addView(frameLayout);
        View view = this.A04;
        if (view != null) {
            addView(view);
        }
        addView(getCtaButton());
        getCtaButton().A0A(op.A04(), op.A08());
        View viewA02 = op.A02();
        OG ogA01 = OG.A01(op.A05(), abstractC1176b5A04, this);
        this.A02 = ogA01;
        OF ofA09 = ogA01.A09(abstractC1176b5A04);
        op.A05().A0F().A00(ofA09.A01);
        if (viewA02 != null && ofA09.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(ogA01);
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.A00.A13(view2);
                }
            });
        } else if (viewA02 != null && C0662Ih.A16(getAdContextWrapper())) {
            AbstractC0789Nl.A00(viewA02, C0662Ih.A17(getAdContextWrapper()), new OW(this));
        }
        if (C0662Ih.A0y(op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C0662Ih.A0z(op.A05())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A02() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A0D() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A10(C1G c1g, String str, double d10, Bundle bundle) {
        super.A10(c1g, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) ((A06 - (OL.A07 * 2)) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return false;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 75));
    }

    @Override // com.meta.analytics.dsp.uinode.OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
