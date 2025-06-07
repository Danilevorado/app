package com.meta.analytics.dsp.uinode;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ji, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0685Ji {
    public static EnumC0683Jg A00(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (LE.A04(i10, screenHeight)) {
            return EnumC0683Jg.A0H;
        }
        if (screenHeight > i10) {
            return EnumC0683Jg.A0J;
        }
        return EnumC0683Jg.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, EnumC0681Je enumC0681Je) {
        int iCeil;
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = enumC0681Je.A03();
        if (i10 >= screenWidth) {
            iCeil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = enumC0681Je.A03();
            iCeil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = enumC0681Je.A02();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iCeil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
