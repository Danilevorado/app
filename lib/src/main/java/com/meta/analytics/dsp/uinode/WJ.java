package com.meta.analytics.dsp.uinode;

import android.text.Layout;

/* loaded from: assets/audience_network.dex */
public final class WJ extends C0592Fn implements Comparable<WJ> {
    public final int A00;

    public WJ(CharSequence charSequence, Layout.Alignment alignment, float f5, int i10, int i11, float f10, int i12, float f11, boolean z10, int i13, int i14) {
        super(charSequence, alignment, f5, i10, i11, f10, i12, f11, z10, i13);
        this.A00 = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(WJ wj) {
        int i10 = wj.A00;
        int i11 = this.A00;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        return 0;
    }
}
