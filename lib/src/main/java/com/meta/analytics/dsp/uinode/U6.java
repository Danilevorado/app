package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class U6 extends AbstractC0766Mo {
    public static final int A03 = (int) (LD.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2S A01;
    public final C1073Yn A02;

    public U6(C1073Yn c1073Yn, J2 j22, String str, C02481a c02481a, MD md, MC mc) {
        super(c1073Yn, j22, str, c02481a, md, mc);
        this.A02 = c1073Yn;
        this.A01 = C2T.A00(c1073Yn.A01());
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A00 = relativeLayout;
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC0740Lo.A0M(relativeLayout, -1728053248);
        relativeLayout.setOnClickListener(new ViewOnClickListenerC0771Mt(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            AbstractC0740Lo.A0V(this, transitionSet);
            return;
        }
        AbstractC0740Lo.A0T(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0L() {
        C2W c2wA0A = this.A01.A0A();
        N3 n32 = new N3(this.A02);
        n32.setInfo(EnumC0748Lw.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        n32.setOnClickListener(new ViewOnClickListenerC0772Mu(this));
        C2W c2wA0B = this.A01.A0B();
        N3 n33 = new N3(this.A02);
        n33.setInfo(EnumC0748Lw.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        n33.setOnClickListener(new ViewOnClickListenerC0773Mv(this));
        N3 n34 = new N3(this.A02);
        n34.setInfo(EnumC0748Lw.AD_CHOICES_ICON, this.A01.A0M(), "");
        n34.setOnClickListener(new ViewOnClickListenerC0774Mw(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i10 = A03;
        linearLayout.setPadding(i10 * 2, i10, i10 * 2, i10);
        AbstractC0740Lo.A0M(linearLayout, -1);
        if (!c2wA0A.A05().isEmpty()) {
            linearLayout.addView(n32, layoutParams);
        }
        if (!c2wA0B.A05().isEmpty()) {
            linearLayout.addView(n33, layoutParams);
        }
        linearLayout.addView(n34, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0M() {
        AbstractC0740Lo.A0I(this);
        this.A00.removeAllViews();
        AbstractC0740Lo.A0J(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0N(C2W c2w, C2U c2u) {
        String strA0E;
        int i10;
        if (c2u == C2U.A04) {
            return;
        }
        boolean z10 = c2u == C2U.A05;
        C0764Mm c0764Mm = new C0764Mm(this.A02, this.A0B);
        if (z10) {
            strA0E = this.A01.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C0764Mm c0764MmA0E = c0764Mm.A0I(strA0E).A0H(this.A01.A0D()).A0F(c2w.A04()).A0E(z10 ? EnumC0748Lw.REPORT_AD : EnumC0748Lw.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        C0765Mn adHiddenView = c0764MmA0E.A0D(i10).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        AbstractC0740Lo.A0M(adHiddenView, -1);
        AbstractC0740Lo.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0O(C2W c2w, C2U c2u) {
        String strA0H;
        boolean z10 = c2u == C2U.A05;
        C1073Yn c1073Yn = this.A02;
        InterfaceC0768Mq interfaceC0768Mq = this.A0B;
        if (z10) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        N6 n62 = new N6(c1073Yn, c2w, interfaceC0768Mq, strA0H, z10 ? EnumC0748Lw.REPORT_AD : EnumC0748Lw.HIDE_AD);
        n62.setClickable(true);
        AbstractC0740Lo.A0M(n62, -1);
        int i10 = A03;
        n62.setPadding(i10 * 2, i10, i10 * 2, i10);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(n62, A0B(false));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final boolean A0P() {
        return false;
    }
}
