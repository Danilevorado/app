package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
final class ge0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ je0 f8689a;

    ge0(je0 je0Var) {
        this.f8689a = je0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f8689a.f10459n.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f8689a.f10459n.set(false);
    }
}
