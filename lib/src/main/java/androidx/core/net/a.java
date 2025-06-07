package androidx.core.net;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.core.net.a$a, reason: collision with other inner class name */
    static class C0026a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0026a.a(connectivityManager);
    }
}
