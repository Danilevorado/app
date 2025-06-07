package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public final class y3 extends c9 {
    public y3(n9 n9Var) {
        super(n9Var);
    }

    @Override // com.google.android.gms.measurement.internal.c9
    protected final boolean j() {
        return false;
    }

    public final boolean k() {
        g();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f20269a.a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
