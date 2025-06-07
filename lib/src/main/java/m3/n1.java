package m3;

import android.util.Log;
import com.google.android.gms.internal.ads.ht;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
public abstract class n1 extends ze0 {
    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z10 = true;
            for (String str2 : ze0.f18534a.d(str)) {
                if (z10) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z10 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return ze0.j(2) && ((Boolean) ht.f9410a.e()).booleanValue();
    }
}
