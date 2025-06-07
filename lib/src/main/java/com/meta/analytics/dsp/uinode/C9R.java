package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9R extends AbstractC0848Ps {
    public final /* synthetic */ C9Q A00;

    public C9R(C9Q c9q) {
        this.A00 = c9q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0849Pt c0849Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0837Ph(this));
    }
}
