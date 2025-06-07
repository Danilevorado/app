package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
final class g23 implements ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ h23 f8589m;

    /* synthetic */ g23(h23 h23Var, f23 f23Var) {
        this.f8589m = h23Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8589m.f8969b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f8589m.c().post(new d23(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8589m.f8969b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f8589m.c().post(new e23(this));
    }
}
