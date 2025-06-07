package com.google.android.gms.internal.play_billing;

import java.util.List;

/* loaded from: classes.dex */
abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f19516a;

    /* renamed from: b, reason: collision with root package name */
    private static final v3 f19517b;

    /* renamed from: c, reason: collision with root package name */
    private static final v3 f19518c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19519d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        v3 v3Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f19516a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                v3Var = (v3) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f19517b = v3Var;
        f19518c = new x3();
    }

    public static void A(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.l(i10, list, z10);
    }

    public static void B(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.u(i10, list, z10);
    }

    public static void C(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.m(i10, list, z10);
    }

    public static void D(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.e(i10, list, z10);
    }

    public static void E(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.r(i10, list, z10);
    }

    public static void F(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.s(i10, list, z10);
    }

    public static void G(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.g(i10, list, z10);
    }

    public static void a(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.x(i10, list, z10);
    }

    public static void b(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.E(i10, list, z10);
    }

    public static void c(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.n(i10, list, z10);
    }

    public static void d(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.C(i10, list, z10);
    }

    public static void e(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.D(i10, list, z10);
    }

    public static void f(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.p(i10, list, z10);
    }

    static boolean g(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int h(List list) {
        int iX;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iX = 0;
            while (i10 < size) {
                iX += y0.x(o1Var.f(i10));
                i10++;
            }
        } else {
            iX = 0;
            while (i10 < size) {
                iX += y0.x(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iX;
    }

    static int i(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (y0.w(i10 << 3) + 4);
    }

    static int j(List list) {
        return list.size() * 4;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (y0.w(i10 << 3) + 8);
    }

    static int l(List list) {
        return list.size() * 8;
    }

    static int m(List list) {
        int iX;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iX = 0;
            while (i10 < size) {
                iX += y0.x(o1Var.f(i10));
                i10++;
            }
        } else {
            iX = 0;
            while (i10 < size) {
                iX += y0.x(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iX;
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += y0.x(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    static int o(int i10, Object obj, f3 f3Var) {
        return y0.w(i10 << 3) + y0.u((u2) obj, f3Var);
    }

    static int p(List list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iW = 0;
            while (i10 < size) {
                int iF = o1Var.f(i10);
                iW += y0.w((iF >> 31) ^ (iF + iF));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iW += y0.w((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iW;
    }

    static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iX += y0.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iX;
    }

    static int r(List list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o1) {
            o1 o1Var = (o1) list;
            iW = 0;
            while (i10 < size) {
                iW += y0.w(o1Var.f(i10));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                iW += y0.w(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iW;
    }

    static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += y0.x(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    public static v3 t() {
        return f19517b;
    }

    public static v3 u() {
        return f19518c;
    }

    static Object v(Object obj, int i10, int i11, Object obj2, v3 v3Var) {
        if (obj2 == null) {
            obj2 = v3Var.c(obj);
        }
        v3Var.f(obj2, i10, i11);
        return obj2;
    }

    static void w(d1 d1Var, Object obj, Object obj2) {
        h1 h1VarB = d1Var.b(obj2);
        if (h1VarB.f19513a.isEmpty()) {
            return;
        }
        d1Var.c(obj).g(h1VarB);
    }

    static void x(v3 v3Var, Object obj, Object obj2) {
        v3Var.h(obj, v3Var.e(v3Var.d(obj), v3Var.d(obj2)));
    }

    public static void y(Class cls) {
        Class cls2;
        if (!n1.class.isAssignableFrom(cls) && (cls2 = f19516a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void z(int i10, List list, n4 n4Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n4Var.k(i10, list, z10);
    }
}
