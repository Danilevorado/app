package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6028a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f6029b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f6030c = ab.class.getName();

    public static void a(String str, Object... objArr) {
        Log.d(f6028a, e(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(f6028a, e(str, objArr));
    }

    public static void c(Throwable th, String str, Object... objArr) {
        Log.e(f6028a, e(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        if (f6029b) {
            Log.v(f6028a, e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f6030c)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
    }
}
