package h1;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class j {
    public static final Network a(ConnectivityManager connectivityManager) {
        rb.h.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
