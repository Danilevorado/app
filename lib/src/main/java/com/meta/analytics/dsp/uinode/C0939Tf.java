package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0939Tf extends OL implements OE {
    public static byte[] A03;
    public final AbstractC1176b5 A00;
    public final MC A01;
    public final OG A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-22, -18, -30, -24, -26};
    }

    public C0939Tf(OP op, boolean z10) {
        FrameLayout.LayoutParams layoutParams;
        super(op, true);
        this.A01 = op.A09();
        AbstractC1176b5 abstractC1176b5A04 = op.A04();
        this.A00 = abstractC1176b5A04;
        RelativeLayout relativeLayout = new RelativeLayout(op.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        AbstractC0740Lo.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(op.A05());
        linearLayout.setOrientation(!z10 ? 1 : 0);
        linearLayout.setGravity(80);
        AbstractC0740Lo.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(OL.A07, 0, OL.A07, OL.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z10 ? -2 : -1, -2);
        layoutParams4.setMargins(z10 ? OL.A07 : 0, z10 ? 0 : OL.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z10 ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        OG ogA01 = OG.A01(op.A05(), abstractC1176b5A04, this);
        this.A02 = ogA01;
        OF ofA09 = ogA01.A09(abstractC1176b5A04);
        op.A05().A0F().A00(ofA09.A01);
        if (op.A0C() && !z10) {
            C0844Po c0844Po = new C0844Po(op.A05());
            c0844Po.setPageDetails(op.A04().A10());
            int iA04 = this.A06.A04().A0w().A00().A04(true);
            c0844Po.A02(iA04, iA04);
            AbstractC0740Lo.A0G(1007, c0844Po);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, OL.A07, 0, 0);
            linearLayout.addView(c0844Po, layoutParams6);
            if (C0662Ih.A0z(op.A05())) {
                c0844Po.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0A(op.A04(), op.A08());
        View viewA02 = op.A02();
        if (viewA02 != null && (ofA09.A00 || C0662Ih.A16(getAdContextWrapper()))) {
            if (z10) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(op.A05());
            frameLayout.addView(viewA02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            if (ofA09.A00) {
                getCtaButton().setCreativeAsCtaLoggingHelper(ogA01);
                viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.OJ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.A00.A13(view);
                    }
                });
            } else {
                AbstractC0789Nl.A00(viewA02, C0662Ih.A17(getAdContextWrapper()), new OK(this));
            }
        } else if (viewA02 != null) {
            addView(viewA02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (C0662Ih.A0y(op.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (op.A08() != null) {
                op.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A0v() {
        super.A0v();
        this.A02.A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final void A10(C1G c1g, String str, double d10, Bundle bundle) {
        super.A10(c1g, str, d10, bundle);
    }

    @Override // com.meta.analytics.dsp.uinode.OL
    public final boolean A11() {
        return true;
    }

    public final /* synthetic */ void A13(View view) {
        getCtaButton().A09(A00(0, 5, 88));
    }

    @Override // com.meta.analytics.dsp.uinode.OE
    public final void AC9() {
        this.A01.A43(this.A00.A0L());
    }
}
