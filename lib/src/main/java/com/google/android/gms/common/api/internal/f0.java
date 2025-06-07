package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class f0 extends p4.l {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g0 f5712b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(g0 g0Var, Looper looper) {
        super(looper);
        this.f5712b = g0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((e0) message.obj).b(this.f5712b);
        } else {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i10);
        }
    }
}
