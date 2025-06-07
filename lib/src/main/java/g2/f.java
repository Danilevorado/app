package g2;

import android.content.Context;
import android.util.Log;
import g2.c;

/* loaded from: classes.dex */
public class f implements d {
    @Override // g2.d
    public c a(Context context, c.a aVar) {
        boolean z10 = androidx.core.content.a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new e(context, aVar) : new n();
    }
}
