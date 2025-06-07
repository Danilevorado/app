package f1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23613a;

    static {
        String strI = b1.j.i("NetworkStateTracker");
        rb.h.d(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        f23613a = strI;
    }

    public static final h a(Context context, i1.c cVar) {
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
        return Build.VERSION.SDK_INT >= 24 ? new j(context, cVar) : new l(context, cVar);
    }

    public static final d1.b c(ConnectivityManager connectivityManager) {
        rb.h.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return new d1.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), d(connectivityManager), androidx.core.net.a.a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        rb.h.e(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = h1.i.a(connectivityManager, h1.j.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return h1.i.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e5) {
            b1.j.e().d(f23613a, "Unable to validate active network", e5);
            return false;
        }
    }
}
