package com.meta.analytics.dsp.uinode;

import android.text.Layout;

/* loaded from: assets/audience_network.dex */
public final class WA extends C0592Fn {
    public final long A00;
    public final long A01;

    public WA(long j10, long j11, CharSequence charSequence) {
        this(j10, j11, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public WA(long j10, long j11, CharSequence charSequence, Layout.Alignment alignment, float f5, int i10, int i11, float f10, int i12, float f11) {
        super(charSequence, alignment, f5, i10, i11, f10, i12, f11);
        this.A01 = j10;
        this.A00 = j11;
    }

    public WA(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        return super.A01 == Float.MIN_VALUE && this.A02 == Float.MIN_VALUE;
    }
}
