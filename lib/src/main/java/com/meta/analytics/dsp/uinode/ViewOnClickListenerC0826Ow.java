package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0826Ow implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"MJZy3ru3ObFHqr", "IunSRocQz0vvNYqEQ6WXTBnuSQec0c7U", "iH4ooasOMZZ6EfnAKOxgPsEqW16lVkcC", "wQIWWSQp6aRcfY56FQGu2w3P9Sd9Rhog", "BeeZAa4D7z23VAiIiGM8IqY8zAew", "Zsw5t3FoKlBodSgf81TTJaZ87jgffbRR", "mBHzM8IKglqg77ZKWneYLvMdHmmr5BMp", "coiV8pY9OkYcSw3BWiptzGAPEmgTqyca"};
    public final /* synthetic */ B4 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
            String[] strArr = A02;
            if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "Zi88no4MMwuxGf1zzv2w2xAR9ETp";
            strArr2[0] = "yxj8C30kQopYdL";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-57, -70, -75, -74, -64};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC0826Ow(B4 b42) {
        this.A00 = b42;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 17));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
