package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
final class y44 extends BroadcastReceiver implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final z44 f17885m;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f17886n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ a54 f17887o;

    public y44(a54 a54Var, Handler handler, z44 z44Var) {
        this.f17887o = a54Var;
        this.f17886n = handler;
        this.f17885m = z44Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f17886n.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
