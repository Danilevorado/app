package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04429a extends AbstractC0848Ps {
    public final /* synthetic */ C0931Sx A00;

    public C04429a(C0931Sx c0931Sx) {
        this.A00 = c0931Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0849Pt c0849Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0830Pa(this));
    }
}
