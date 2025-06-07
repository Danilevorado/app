package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static long f2270a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f2271b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f2272c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f2273d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f2274e;

    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2270a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f2271b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f2272c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f2273d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f2274e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e5) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e5);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
