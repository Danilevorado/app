package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class i4 implements ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    private final String f20055m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ j4 f20056n;

    i4(j4 j4Var, String str) {
        this.f20056n = j4Var;
        this.f20055m = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f20056n.f20086a.b().u().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.t0 t0VarW0 = com.google.android.gms.internal.measurement.s0.w0(iBinder);
            if (t0VarW0 == null) {
                this.f20056n.f20086a.b().u().a("Install Referrer Service implementation was not found");
            } else {
                this.f20056n.f20086a.b().t().a("Install Referrer Service connected");
                this.f20056n.f20086a.B().y(new h4(this, t0VarW0, this));
            }
        } catch (RuntimeException e5) {
            this.f20056n.f20086a.b().u().b("Exception occurred while calling Install Referrer API", e5);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f20056n.f20086a.b().t().a("Install Referrer Service disconnected");
    }
}
