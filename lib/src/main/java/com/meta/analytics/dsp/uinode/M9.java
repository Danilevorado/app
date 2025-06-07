package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class M9 extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2S A02;
    public final C1073Yn A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (LD.A02 * 50.0f);
        A05 = (int) (LD.A02 * 10.0f);
        A06 = (int) (LD.A02 * 20.0f);
        A09 = (int) (LD.A02 * 4.0f);
        A07 = (int) (LD.A02 * 12.0f);
    }

    public M9(C1073Yn c1073Yn, int i10) {
        super(c1073Yn);
        this.A03 = c1073Yn;
        this.A02 = C2T.A00(c1073Yn.A01());
        setOrientation(0);
        this.A00 = new ImageView(c1073Yn);
        this.A01 = new ImageView(c1073Yn);
        A04(i10);
    }

    private void A04(int i10) {
        EnumC0748Lw enumC0748Lw;
        A05(this.A00, EnumC0748Lw.AD_CHOICES_ICON);
        if (i10 == 2) {
            int i11 = A05;
            setPadding(i11, i11 / 3, i11, i11 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            textView.setPadding(0, i11 / 2, i11 / 2, i11 / 2);
            AbstractC0740Lo.A0X(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            int i12 = A07;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, i12);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        int i13 = A05;
        setPadding(i13, i13, i13, i13);
        if (i10 == 1) {
            enumC0748Lw = EnumC0748Lw.AN_INFO_ICON;
        } else {
            enumC0748Lw = EnumC0748Lw.DEFAULT_INFO_ICON;
        }
        A05(this.A01, enumC0748Lw);
        int i14 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i14, i14);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i14, i14);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, EnumC0748Lw enumC0748Lw) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC0749Lx.A01(enumC0748Lw));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C02481a c02481a, String str, JA ja2, MC mc) {
        setOnClickListener(new M8(this, ja2, mc, str, c02481a));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i10);
        AbstractC0740Lo.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i10) {
        this.A00.setColorFilter(i10);
        this.A01.setColorFilter(i10);
    }
}
