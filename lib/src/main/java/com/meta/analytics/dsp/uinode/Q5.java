package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class Q5 {
    public ViewOnClickListenerC0945Tl A00;
    public final C1C A01;
    public final C1N A02;
    public final C1R A03;
    public final C02481a A04;
    public final C1073Yn A05;
    public final JA A06;
    public static String[] A07 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A0A = (int) (LD.A02 * 4.0f);
    public static final int A08 = (int) (LD.A02 * 72.0f);
    public static final int A09 = (int) (LD.A02 * 8.0f);

    public Q5(C1073Yn c1073Yn, J2 j22, AbstractC1176b5 abstractC1176b5) {
        this.A05 = c1073Yn;
        this.A06 = new JA(abstractC1176b5.A12(), j22);
        this.A01 = abstractC1176b5.A0w();
        this.A02 = abstractC1176b5.A0x().A0E();
        this.A04 = abstractC1176b5.A10();
        this.A03 = abstractC1176b5.A0x().A0G();
    }

    private View A00(ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl) {
        O9 o92 = new O9(this.A05, this.A01.A01(), true, false, false);
        o92.A03(this.A02.A06(), this.A02.A01(), null, false, true);
        o92.setAlignment(17);
        O3 o32 = new O3(this.A05);
        AbstractC0740Lo.A0M(o32, 0);
        o32.setRadius(50);
        new AsyncTaskC0950Tq(o32, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i10 = A08;
        linearLayout.addView(o32, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = A09;
        imageParams.setMargins(0, i11, 0, i11);
        linearLayout.addView(o92, imageParams);
        if (viewOnClickListenerC0945Tl != null) {
            AbstractC0740Lo.A0J(viewOnClickListenerC0945Tl);
            linearLayout.addView(viewOnClickListenerC0945Tl, imageParams);
            if (TextUtils.isEmpty(viewOnClickListenerC0945Tl.getText())) {
                AbstractC0740Lo.A0H(viewOnClickListenerC0945Tl);
            }
        }
        return linearLayout;
    }

    private C0556Eb A01() {
        C0556Eb c0556Eb = new C0556Eb(this.A05);
        c0556Eb.setLayoutManager(new C1099Zo(this.A05, 0, false));
        c0556Eb.setAdapter(new SM(this.A05, this.A03.A01(), A0A, this.A00));
        return c0556Eb;
    }

    private final Q4 A02() {
        if (!this.A03.A01().isEmpty()) {
            return Q4.A04;
        }
        Q4 q42 = Q4.A03;
        String[] strArr = A07;
        if (strArr[3].charAt(8) == strArr[7].charAt(8)) {
            throw new RuntimeException();
        }
        A07[4] = "qwlEjiYhEcV8j1J";
        return q42;
    }

    public final Pair<Q4, View> A03(ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl) {
        View viewA01;
        this.A00 = viewOnClickListenerC0945Tl;
        Q4 q4A02 = A02();
        switch (Q3.A00[q4A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl2 = this.A00;
                if (A07[4].length() == 15) {
                    String[] strArr = A07;
                    strArr[3] = "Oe6IO8Uak3tx5GvHWoKp5mKUb4E2rtDt";
                    strArr[7] = "t7tx5cDm578ghKblxCWBuUm65hKnqcQl";
                    viewA01 = A00(viewOnClickListenerC0945Tl2);
                    break;
                } else {
                    throw new RuntimeException();
                }
        }
        JC.A04(viewA01, this.A06, J9.A0S);
        return new Pair<>(q4A02, viewA01);
    }
}
