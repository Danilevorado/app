package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0836Pg extends LinearLayout {
    public LinearLayout A00;
    public final int A01;
    public final C1073Yn A02;
    public final O3 A03;
    public final O9 A04;
    public static final int A07 = (int) (LD.A02 * 16.0f);
    public static final int A08 = (int) (LD.A02 * 16.0f);
    public static final int A06 = (int) (LD.A02 * 8.0f);
    public static final int A05 = (int) (LD.A02 * 72.0f);

    public C0836Pg(C0834Pe c0834Pe) {
        super(c0834Pe.A06);
        C1073Yn c1073Yn = c0834Pe.A06;
        this.A02 = c1073Yn;
        this.A03 = new O3(c1073Yn);
        this.A04 = new O9(c1073Yn, c0834Pe.A01, true, false, true);
        this.A01 = c0834Pe.A00;
        A03(c0834Pe);
    }

    public /* synthetic */ C0836Pg(C0834Pe c0834Pe, C0917Sj c0917Sj) {
        this(c0834Pe);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i10) {
        view.setTranslationY(i10);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i10).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C0834Pe c0834Pe) {
        if (!TextUtils.isEmpty(c0834Pe.A03)) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A00 = linearLayout;
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = this.A00;
            int i10 = A08;
            linearLayout2.setPadding(i10, i10 / 2, i10, i10 / 2);
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(-2, -2);
            informativeTextViewParams.setMargins(0, i10 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            AbstractC0740Lo.A0X(textView, false, 16);
            textView.setText(c0834Pe.A03);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC0950Tq(imageView, this.A02).A04().A07(c0834Pe.A02);
            int i11 = A07;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, i11);
            layoutParams2.setMargins(0, 0, i10 / 2, 0);
            this.A00.addView(imageView, layoutParams2);
            this.A00.addView(textView, layoutParams);
            GradientDrawable bgDrawable = new GradientDrawable();
            bgDrawable.setCornerRadius(100.0f);
            bgDrawable.setColor(469762047);
            AbstractC0740Lo.A0S(this.A00, bgDrawable);
            addView(this.A00, informativeTextViewParams);
        }
    }

    private void A03(C0834Pe c0834Pe) {
        AbstractC0740Lo.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (c0834Pe.A04.A00() == C1L.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new AsyncTaskC0950Tq(this.A03, this.A02).A04().A07(c0834Pe.A05.A01());
        this.A04.A03(c0834Pe.A04.A06(), c0834Pe.A05.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        layoutParams.setMargins(0, i10, 0, i10 / 2);
        View view = this.A03;
        int i11 = A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i11, i11);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(c0834Pe);
        AbstractC0740Lo.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC0835Pf interfaceC0835Pf) {
        A00();
        postDelayed(new C0917Sj(this, interfaceC0835Pf), this.A01);
    }
}
