package i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f24307a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f24308b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f24309c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f24310d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f24311e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f24312f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f24311e == null) {
            boolean z10 = false;
            if (m.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f24311e = Boolean.valueOf(z10);
        }
        return f24311e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f24312f == null) {
            boolean z10 = false;
            if (m.l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f24312f = Boolean.valueOf(z10);
        }
        return f24312f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f24309c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f24309c = Boolean.valueOf(z10);
        }
        return f24309c.booleanValue();
    }

    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i10 = b4.i.f4427a;
        return "user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    public static boolean g(Context context) {
        if (f(context) && !m.h()) {
            return true;
        }
        if (h(context)) {
            return !m.i() || m.l();
        }
        return false;
    }

    public static boolean h(Context context) {
        if (f24308b == null) {
            boolean z10 = false;
            if (m.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f24308b = Boolean.valueOf(z10);
        }
        return f24308b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f24310d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f24310d = Boolean.valueOf(z10);
        }
        return f24310d.booleanValue();
    }

    public static boolean j(PackageManager packageManager) {
        if (f24307a == null) {
            boolean z10 = false;
            if (m.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f24307a = Boolean.valueOf(z10);
        }
        return f24307a.booleanValue();
    }
}
