package i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class r {
    public static boolean a(Context context, int i10) throws PackageManager.NameNotFoundException {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return b4.j.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i10, String str) {
        return k4.c.a(context).h(i10, str);
    }
}
