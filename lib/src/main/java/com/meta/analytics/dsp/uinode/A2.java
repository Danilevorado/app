package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class A2 extends AbstractC0848Ps {
    public final /* synthetic */ T4 A00;

    public A2(T4 t42) {
        this.A00 = t42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0849Pt c0849Pt) {
        new Handler(Looper.getMainLooper()).post(new PS(this));
    }
}
