package y0;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f28432a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f28433b;

    public static void a(String str) {
        b.a(str);
    }

    public static void b() {
        b.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        try {
            if (f28433b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        try {
            if (f28433b == null) {
                f28432a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f28433b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f28433b.invoke(null, Long.valueOf(f28432a))).booleanValue();
        } catch (Exception e5) {
            c("isTagEnabled", e5);
            return false;
        }
    }
}
