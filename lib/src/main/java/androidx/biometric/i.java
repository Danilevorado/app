package androidx.biometric;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* loaded from: classes.dex */
abstract class i {
    static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, n.f1505a);
    }

    private static boolean b(Context context, String str, int i10) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, int i10) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(Context context, String str, int i10) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, n.f1508d);
    }

    static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, n.f1509e);
    }

    static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, n.f1507c) || c(context, str2, n.f1506b);
    }
}
