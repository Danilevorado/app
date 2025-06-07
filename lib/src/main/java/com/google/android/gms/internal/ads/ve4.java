package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class ve4 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ xe4 f16674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ve4(xe4 xe4Var, Looper looper) {
        super(looper);
        this.f16674a = xe4Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        xe4.a(this.f16674a, message);
    }
}
