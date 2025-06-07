package s8;

import android.os.Build;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f27077a = {0, 150, 50, 150};

    static int a(w9.d dVar) {
        int i10 = Build.VERSION.SDK_INT;
        int iL = dVar.l();
        if (i10 < 24) {
            return iL;
        }
        if (iL == -2 || iL == -1) {
            return 2;
        }
        if (iL != 0) {
            return (iL == 1 || iL == 2) ? 4 : -1000;
        }
        return 3;
    }

    static String b(String str) {
        if (!str.contains(" ") && str.startsWith("pushwoosh_")) {
            return str;
        }
        return "pushwoosh_" + str.trim().replaceAll("\\s+", "_").toLowerCase();
    }

    static long[] c() {
        return f27077a;
    }

    public static String d(w9.d dVar) {
        String strA = g8.e.A(dVar.v());
        return strA == null ? ka.e.d().b().a() : strA;
    }
}
