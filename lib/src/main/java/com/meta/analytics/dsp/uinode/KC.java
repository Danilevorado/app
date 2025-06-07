package com.meta.analytics.dsp.uinode;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KC implements InterfaceC0865Qj {
    public static byte[] A06;
    public static String[] A07 = {"A7BI5", "gKWOMBrJHuMwvM90e1kQxbLVjOWHbC33", "UYN9ptwwhG6kseDSIUjMW4tKOOJXD2Z7", "Ja75eMPfNEu2gmMNMrA6", "IMMQ3U1D8CAOequczoeO", "aOtgKGua3vuGYyvCOzm8c8DJStBVo0w", "j", "V23k2coZlnHKKs"};
    public ValueAnimator A00;
    public EnumC0864Qi A01 = EnumC0864Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{40, 25, 44, 40, -9, 35, 32, 35, 38};
    }

    static {
        A05();
    }

    public KC(View view, int i10, int i11, int i12) {
        this.A02 = i10;
        this.A05 = view;
        this.A04 = i11;
        this.A03 = i12;
    }

    private void A06(int i10, int i11) {
        this.A01 = i10 == this.A04 ? EnumC0864Qi.A04 : EnumC0864Qi.A06;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 82), i10, i11);
        this.A00 = objectAnimatorOfInt;
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C0871Qp(this, i10, i11));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10, int i11, boolean z10) {
        if (z10) {
            A06(i10, i11);
            return;
        }
        View view = this.A05;
        if (A07[4].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "Y4rCa4lywlEdVv";
        strArr[0] = "Hdg5N";
        ((TextView) view).setTextColor(i11);
        this.A01 = i11 == this.A03 ? EnumC0864Qi.A03 : EnumC0864Qi.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0865Qj
    public final void A3Y(boolean z10, boolean z11) {
        int endColor = z11 ? this.A03 : this.A04;
        int startColor = z11 ? this.A04 : this.A03;
        A07(endColor, startColor, z10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0865Qj
    public final EnumC0864Qi A82() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0865Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
