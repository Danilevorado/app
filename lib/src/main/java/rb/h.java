package rb;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class h {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            k();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            l(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) h(new NullPointerException(str + " must not be null")));
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static int f(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    private static String g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static Throwable h(Throwable th) {
        return i(th, h.class.getName());
    }

    static Throwable i(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    public static String j(String str, Object obj) {
        return str + obj;
    }

    public static void k() {
        throw ((NullPointerException) h(new NullPointerException()));
    }

    public static void l(String str) {
        throw ((NullPointerException) h(new NullPointerException(str)));
    }

    private static void m(String str) {
        throw ((NullPointerException) h(new NullPointerException(g(str))));
    }
}
