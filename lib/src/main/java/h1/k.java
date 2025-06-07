package h1;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class k {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        rb.h.e(connectivityManager, "<this>");
        rb.h.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
