package k9;

import android.util.Log;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f24870a = false;

    /* renamed from: b, reason: collision with root package name */
    private static a f24871b = a.DEBUG;

    /* renamed from: c, reason: collision with root package name */
    private static b f24872c;

    public enum a {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        NOISE,
        INTERNAL
    }

    public interface b {
        void a(a aVar, String str);
    }

    private static String a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        return "[" + str + "] " + str2;
    }

    private static void b(a aVar, String str) {
        b bVar = f24872c;
        if (bVar != null) {
            bVar.a(aVar, str);
        }
    }

    private static boolean c() {
        return d(a.DEBUG);
    }

    private static boolean d(a aVar) {
        return f24871b.compareTo(aVar) >= 0;
    }

    private static boolean e() {
        return d(a.ERROR);
    }

    private static boolean f() {
        return d(a.INFO);
    }

    public static void g(String str) {
        h(null, str);
    }

    public static void h(String str, String str2) {
        if (c()) {
            Log.d("Pushwoosh", a(str, str2));
        }
        b(a.DEBUG, a(str, str2));
    }

    public static void i(String str, String str2, Throwable th) {
        if (c()) {
            Log.d("Pushwoosh", a(str, str2), th);
        }
    }

    public static void j(String str, Throwable th) {
        i(null, str, th);
    }

    public static void k(String str) {
        l(null, str);
    }

    public static void l(String str, String str2) {
        if (e()) {
            Log.e("Pushwoosh", a(str, str2));
        }
        b(a.ERROR, a(str, str2));
    }

    public static void m(String str, String str2, Throwable th) {
        if (e()) {
            Log.e("Pushwoosh", a(str, str2), th);
        }
    }

    public static void n(String str, Throwable th) {
        m(null, str, th);
    }

    public static void o(Throwable th) {
        m(null, "Exception occurred", th);
    }

    private static boolean p() {
        return d(a.NOISE);
    }

    private static boolean q() {
        return d(a.WARN);
    }

    public static void r(String str) {
        s(null, str);
    }

    public static void s(String str, String str2) {
        if (f()) {
            Log.i("Pushwoosh", a(str, str2));
        }
        b(a.INFO, a(str, str2));
    }

    public static void t() {
        if (f24870a) {
            return;
        }
        String strA = ka.e.f().q().a();
        if (strA != null) {
            try {
                a aVarValueOf = a.valueOf(strA);
                f24871b = aVarValueOf;
                if (aVarValueOf == a.INTERNAL) {
                    f24871b = a.DEBUG;
                }
            } catch (IllegalArgumentException unused) {
                k("Unrecognized log level: " + strA);
            }
        }
        r("Log level: " + f24871b.name());
        f24870a = true;
    }

    public static void u(String str) {
        v(null, str);
    }

    public static void v(String str, String str2) {
        if (p()) {
            Log.v("Pushwoosh", a(str, str2));
        }
        b(a.NONE, a(str, str2));
    }

    public static void w(String str) {
        x(null, str);
    }

    public static void x(String str, String str2) {
        if (q()) {
            Log.w("Pushwoosh", a(str, str2));
        }
        b(a.WARN, a(str, str2));
    }

    public static void y(String str, String str2, Throwable th) {
        if (q()) {
            Log.w("Pushwoosh", a(str, str2), th);
        }
    }
}
