package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class U4 extends AbstractC0766Mo {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2S A03;
    public final C1073Yn A04;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (LD.A02 * 8.0f);
        A07 = (int) (LD.A02 * 10.0f);
        A06 = (int) (LD.A02 * 44.0f);
    }

    public U4(C1073Yn c1073Yn, J2 j22, String str) {
        super(c1073Yn, j22, str);
        this.A04 = c1073Yn;
        this.A03 = C2T.A00(c1073Yn.A01());
        ImageView imageView = new ImageView(getContext());
        this.A00 = imageView;
        int i10 = A07;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setColorFilter(-10459280);
        int i11 = A06;
        LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i11, i11);
        closeButtonParams.gravity = 3;
        imageView.setLayoutParams(closeButtonParams);
        ScrollView scrollView = new ScrollView(getContext());
        this.A02 = scrollView;
        scrollView.setFillViewport(true);
        AbstractC0740Lo.A0M(scrollView, -218103809);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        int i12 = A08;
        linearLayout.setPadding(i12, i12, i12, i12);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0L() {
        this.A00.setImageBitmap(AbstractC0749Lx.A01(EnumC0748Lw.CROSS));
        this.A00.setOnClickListener(new N7(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        C0770Ms c0770Ms = new C0770Ms(this.A04);
        c0770Ms.setData(this.A03.A0H(), EnumC0748Lw.HIDE_AD);
        c0770Ms.setOnClickListener(new N8(this, c0770Ms));
        C0770Ms c0770Ms2 = new C0770Ms(this.A04);
        c0770Ms2.setData(this.A03.A0L(), EnumC0748Lw.REPORT_AD);
        c0770Ms2.setOnClickListener(new N9(this, c0770Ms2));
        C0770Ms c0770Ms3 = new C0770Ms(this.A04);
        c0770Ms3.setData(this.A03.A0M(), EnumC0748Lw.AD_CHOICES_ICON);
        c0770Ms3.setOnClickListener(new NA(this, c0770Ms3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        menuParams.setMargins(i10, i10, i10, i10);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC0740Lo.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c0770Ms, menuParams);
        linearLayout.addView(c0770Ms2, menuParams);
        linearLayout.addView(c0770Ms3, menuParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0M() {
        AbstractC0740Lo.A0I(this);
        AbstractC0740Lo.A0J(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0N(C2W c2w, C2U c2u) {
        String strA0H;
        EnumC0748Lw enumC0748Lw;
        int i10;
        this.A00.setOnClickListener(null);
        if (c2u == C2U.A05) {
            strA0H = this.A03.A0F();
            enumC0748Lw = EnumC0748Lw.REPORT_AD;
            i10 = -552389;
        } else {
            strA0H = this.A03.A0H();
            enumC0748Lw = EnumC0748Lw.HIDE_AD;
            i10 = -13272859;
        }
        C0764Mm c0764MmA0I = new C0764Mm(this.A04, this.A0B).A0I(strA0H);
        String title = this.A03.A0D();
        C0764Mm c0764MmA0H = c0764MmA0I.A0H(title);
        String title2 = c2w.A04();
        C0765Mn adHiddenView = c0764MmA0H.A0F(title2).A0K(false).A0E(enumC0748Lw).A0D(i10).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC0740Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final void A0O(C2W c2w, C2U c2u) {
        boolean isReportFlow = c2u == C2U.A05;
        N6 n62 = new N6(this.A04, c2w, this.A0B, isReportFlow ? EnumC0748Lw.REPORT_AD : EnumC0748Lw.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(AbstractC0749Lx.A01(EnumC0748Lw.BACK_ARROW));
        this.A00.setOnClickListener(new NB(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        AbstractC0740Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(n62, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0766Mo
    public final boolean A0P() {
        return true;
    }
}
