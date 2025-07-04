package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class KI implements InterfaceC0865Qj {
    public int A00;
    public ValueAnimator A01;
    public EnumC0864Qi A02 = EnumC0864Qi.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public KI(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A03 = i10;
        this.A00 = i11;
        this.A04 = i12;
    }

    private ValueAnimator A00(int i10, int i11, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C0868Qm(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z10) {
        if (z10) {
            this.A02 = EnumC0864Qi.A06;
            ValueAnimator valueAnimatorA00 = A00(this.A00, this.A04, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C0867Ql(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        AbstractC0740Lo.A0H(this.A05);
        this.A02 = EnumC0864Qi.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        AbstractC0740Lo.A0L(this.A05);
        if (z10) {
            this.A02 = EnumC0864Qi.A04;
            ValueAnimator valueAnimatorA00 = A00(this.A04, this.A00, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C0866Qk(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC0864Qi.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0865Qj
    public final void A3Y(boolean z10, boolean z11) {
        if (z11) {
            A07(z10);
        } else {
            A08(z10);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0865Qj
    public final EnumC0864Qi A82() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0865Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
