package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class ad2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6047a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final zb2 f6048b = zb2.f18513a;

    public static void a(String str, String str2) {
        synchronized (f6047a) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        synchronized (f6047a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        b(str, g(str2, th));
    }

    public static void d(String str, String str2) {
        synchronized (f6047a) {
            Log.i(str, str2);
        }
    }

    public static void e(String str, String str2) {
        synchronized (f6047a) {
            Log.w(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th) {
        e(str, g(str2, th));
    }

    private static String g(String str, Throwable th) {
        String strReplace;
        synchronized (f6047a) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }
}
