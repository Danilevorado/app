package k4;

import android.content.Context;
import i4.m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f24822a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f24823b;

    public static synchronized boolean a(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f24822a;
        if (context2 != null && (bool = f24823b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f24823b = null;
        if (!m.i()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f24823b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
            }
            f24822a = applicationContext;
            return f24823b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f24823b = boolValueOf;
        f24822a = applicationContext;
        return f24823b.booleanValue();
    }
}
