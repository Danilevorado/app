package com.meta.analytics.dsp.uinode;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Oo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0818Oo extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC0945Tl A02;
    public static final int A05 = (int) (LD.A02 * 36.0f);
    public static final int A06 = (int) (LD.A02 * 36.0f);
    public static final int A03 = (int) (LD.A02 * 23.0f);
    public static final int A04 = (int) (LD.A02 * 3.0f);
    public static final int A07 = (int) (LD.A02 * 4.0f);

    public C0818Oo(C1073Yn c1073Yn, AbstractC1176b5 abstractC1176b5, J2 j22, MC mc, RE re, C0732Lg c0732Lg, C1P c1p, InterfaceC0794Nq interfaceC0794Nq) {
        super(c1073Yn);
        this.A00 = c1p.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c1073Yn);
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(c1073Yn, abstractC1176b5.A0x().A0F().A04());
        ViewOnClickListenerC0945Tl viewOnClickListenerC0945Tl = new ViewOnClickListenerC0945Tl(c1073Yn, abstractC1176b5.A0L(), null, j22, mc, re, c0732Lg, abstractC1176b5.A0y());
        this.A02 = viewOnClickListenerC0945Tl;
        viewOnClickListenerC0945Tl.setCta(abstractC1176b5.A0x().A0F(), abstractC1176b5.A12(), new HashMap(), interfaceC0794Nq);
        viewOnClickListenerC0945Tl.setIsInAppBrowser(true);
        addView(viewOnClickListenerC0945Tl, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C1073Yn c1073Yn, View view) {
        ImageView imageView = new ImageView(c1073Yn);
        imageView.setImageBitmap(AbstractC0749Lx.A01(EnumC0748Lw.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i10 = A03;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        int i11 = A04;
        imageView.setPadding(i11, i11, i11, i11);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1073Yn c1073Yn, String str) {
        Button button = new Button(c1073Yn);
        AbstractC0740Lo.A0K(button);
        int i10 = A06;
        button.setPadding(i10, 0, i10, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC0740Lo.A0O(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1073Yn, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1176b5 abstractC1176b5, MB mb2) {
        this.A02.A0A(abstractC1176b5, mb2);
    }
}
