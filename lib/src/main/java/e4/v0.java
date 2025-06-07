package e4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f23231a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f23232b;

    /* renamed from: c, reason: collision with root package name */
    private static String f23233c;

    /* renamed from: d, reason: collision with root package name */
    private static int f23234d;

    public static int a(Context context) {
        b(context);
        return f23234d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f23231a) {
            if (f23232b) {
                return;
            }
            f23232b = true;
            try {
                bundle = k4.c.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("MetadataValueReader", "This should never happen.", e5);
            }
            if (bundle == null) {
                return;
            }
            f23233c = bundle.getString("com.google.app.id");
            f23234d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
