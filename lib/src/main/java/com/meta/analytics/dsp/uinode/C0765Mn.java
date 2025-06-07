package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0765Mn extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2S A02;
    public final C1073Yn A03;
    public final InterfaceC0768Mq A04;
    public final boolean A05;

    static {
        int i10 = (int) (LD.A02 * 16.0f);
        A09 = i10;
        A0A = (int) (LD.A02 * 8.0f);
        A0D = (int) (LD.A02 * 44.0f);
        int i11 = (int) (LD.A02 * 10.0f);
        A08 = i11;
        A07 = i10 - i11;
        A0E = (int) (LD.A02 * 75.0f);
        A0B = (int) (LD.A02 * 25.0f);
        A0F = (int) (LD.A02 * 45.0f);
        A0C = (int) (LD.A02 * 15.0f);
        A06 = (int) (LD.A02 * 16.0f);
    }

    public C0765Mn(C0764Mm c0764Mm) {
        super(c0764Mm.A0C);
        C1073Yn c1073Yn = c0764Mm.A0C;
        this.A03 = c1073Yn;
        this.A02 = C2T.A00(c1073Yn.A01());
        this.A04 = c0764Mm.A02;
        this.A01 = c0764Mm.A0B ? A0E : A0F;
        this.A00 = c0764Mm.A0B ? A0B : A0C;
        this.A05 = c0764Mm.A07;
        setFocusable(true);
        View viewA01 = A01(c0764Mm);
        View viewA00 = A00(c0764Mm);
        View footerView = getFooterView();
        AbstractC0740Lo.A0K(viewA01);
        AbstractC0740Lo.A0K(viewA00);
        AbstractC0740Lo.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, viewA01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i10 = A09;
        layoutParams.setMargins(i10, 0, i10, i10);
        addView(viewA01, footerParams);
        addView(viewA00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(c0764Mm.A08 ? 0 : 8);
    }

    public /* synthetic */ C0765Mn(C0764Mm c0764Mm, ViewOnClickListenerC0762Mk viewOnClickListenerC0762Mk) {
        this(c0764Mm);
    }

    private View A00(C0764Mm c0764Mm) {
        ImageView imageView = new ImageView(getContext());
        int i10 = this.A00;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setImageBitmap(AbstractC0749Lx.A01(c0764Mm.A01));
        imageView.setColorFilter(-1);
        int i11 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(c0764Mm.A00);
        AbstractC0740Lo.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i12 = A09;
        layoutParams.setMargins(i12, 0, i12, i12);
        TextView textView = new TextView(getContext());
        AbstractC0740Lo.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(c0764Mm.A06);
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i12, 0, i12, i12);
        TextView textView2 = new TextView(getContext());
        AbstractC0740Lo.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(c0764Mm.A05);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i12, 0, i12, i12);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        if (c0764Mm.A09) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(c0764Mm.A04)) {
                O3 o32 = new O3(this.A03);
                int i13 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i13, i13);
                subtitleParams.setMargins(0, 0, A0A, 0);
                o32.setFullCircleCorners(true);
                new AsyncTaskC0950Tq(o32, this.A03).A05(i13, i13).A07(c0764Mm.A04);
                linearLayout2.addView(o32, subtitleParams);
            }
            C0770Ms c0770Ms = new C0770Ms(this.A03);
            c0770Ms.setData(c0764Mm.A03, EnumC0748Lw.CHECKMARK);
            c0770Ms.setSelected(true);
            linearLayout2.addView(c0770Ms, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C0764Mm c0764Mm) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (c0764Mm.A0A) {
            ImageView imageView = new ImageView(getContext());
            int i10 = A08;
            imageView.setPadding(i10, i10, i10, i10);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC0749Lx.A01(EnumC0748Lw.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC0762Mk(this));
            int i11 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            int i12 = A07;
            layoutParams.setMargins(i12, i12, i12, i12);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(AbstractC0749Lx.A01(EnumC0748Lw.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i10 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        AbstractC0740Lo.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i11 = A0A;
        managePrefsText.setPadding(i11, i11, i11, i11);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0763Ml(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
