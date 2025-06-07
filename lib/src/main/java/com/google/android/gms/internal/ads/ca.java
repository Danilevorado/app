package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class ca implements Executor {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Handler f6852m;

    ca(ea eaVar, Handler handler) {
        this.f6852m = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6852m.post(runnable);
    }
}
