package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class b0 extends p4.l {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d0 f5649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(d0 d0Var, Looper looper) {
        super(looper);
        this.f5649b = d0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            d0.q(this.f5649b);
            return;
        }
        if (i10 == 2) {
            d0.p(this.f5649b);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
    }
}
