package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class f04 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f8074a;

    /* renamed from: b, reason: collision with root package name */
    private static final i04 f8075b;

    /* renamed from: c, reason: collision with root package name */
    private static final i04 f8076c;

    /* renamed from: d, reason: collision with root package name */
    private static final i04 f8077d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8078e = 0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8074a = cls;
        f8075b = y(false);
        f8076c = y(true);
        f8077d = new k04();
    }

    static int A(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = size * mx3.b(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iN = ((ww3) list.get(i11)).n();
            iB += mx3.b(iN) + iN;
        }
        return iB;
    }

    static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C(list) + (size * mx3.b(i10 << 3));
    }

    static int C(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cy3) {
            cy3 cy3Var = (cy3) list;
            iA = 0;
            while (i10 < size) {
                iA += mx3.A(cy3Var.f(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += mx3.A(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iA;
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (mx3.b(i10 << 3) + 4);
    }

    static int E(List list) {
        return list.size() * 4;
    }

    static int F(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (mx3.b(i10 << 3) + 8);
    }

    static int G(List list) {
        return list.size() * 8;
    }

    static int H(int i10, List list, d04 d04Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZ += mx3.z(i10, (jz3) list.get(i11), d04Var);
        }
        return iZ;
    }

    static int I(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * mx3.b(i10 << 3));
    }

    static int J(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cy3) {
            cy3 cy3Var = (cy3) list;
            iA = 0;
            while (i10 < size) {
                iA += mx3.A(cy3Var.f(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += mx3.A(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iA;
    }

    static int K(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + (list.size() * mx3.b(i10 << 3));
    }

    static int L(List list) {
        int iC;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zy3) {
            zy3 zy3Var = (zy3) list;
            iC = 0;
            while (i10 < size) {
                iC += mx3.c(zy3Var.f(i10));
                i10++;
            }
        } else {
            iC = 0;
            while (i10 < size) {
                iC += mx3.c(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iC;
    }

    static int M(int i10, Object obj, d04 d04Var) {
        return mx3.b(i10 << 3) + mx3.B((jz3) obj, d04Var);
    }

    static int N(int i10, List list, d04 d04Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB = mx3.b(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iB += mx3.B((jz3) list.get(i11), d04Var);
        }
        return iB;
    }

    static int O(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * mx3.b(i10 << 3));
    }

    static int P(List list) {
        int iB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cy3) {
            cy3 cy3Var = (cy3) list;
            iB = 0;
            while (i10 < size) {
                int iF = cy3Var.f(i10);
                iB += mx3.b((iF >> 31) ^ (iF + iF));
                i10++;
            }
        } else {
            iB = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iB += mx3.b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iB;
    }

    static int Q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * mx3.b(i10 << 3));
    }

    static int R(List list) {
        int iC;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zy3) {
            zy3 zy3Var = (zy3) list;
            iC = 0;
            while (i10 < size) {
                long jF = zy3Var.f(i10);
                iC += mx3.c((jF >> 63) ^ (jF + jF));
                i10++;
            }
        } else {
            iC = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iC += mx3.c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iC;
    }

    static int S(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int i12 = mx3.f12291d;
        boolean z10 = list instanceof ry3;
        int iB = mx3.b(i10 << 3) * size;
        if (z10) {
            ry3 ry3Var = (ry3) list;
            while (i11 < size) {
                Object objC = ry3Var.C(i11);
                if (objC instanceof ww3) {
                    int iN = ((ww3) objC).n();
                    iB += mx3.b(iN) + iN;
                } else {
                    iB += mx3.C((String) objC);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof ww3) {
                    int iN2 = ((ww3) obj).n();
                    iB += mx3.b(iN2) + iN2;
                } else {
                    iB += mx3.C((String) obj);
                }
                i11++;
            }
        }
        return iB;
    }

    static int T(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * mx3.b(i10 << 3));
    }

    static int U(List list) {
        int iB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cy3) {
            cy3 cy3Var = (cy3) list;
            iB = 0;
            while (i10 < size) {
                iB += mx3.b(cy3Var.f(i10));
                i10++;
            }
        } else {
            iB = 0;
            while (i10 < size) {
                iB += mx3.b(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iB;
    }

    static int V(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return W(list) + (size * mx3.b(i10 << 3));
    }

    static int W(List list) {
        int iC;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zy3) {
            zy3 zy3Var = (zy3) list;
            iC = 0;
            while (i10 < size) {
                iC += mx3.c(zy3Var.f(i10));
                i10++;
            }
        } else {
            iC = 0;
            while (i10 < size) {
                iC += mx3.c(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iC;
    }

    public static i04 X() {
        return f8075b;
    }

    public static i04 Y() {
        return f8076c;
    }

    public static i04 a() {
        return f8077d;
    }

    static Object b(Object obj, int i10, List list, fy3 fy3Var, Object obj2, i04 i04Var) {
        if (fy3Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (fy3Var.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj2 = c(obj, i10, iIntValue, obj2, i04Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!fy3Var.a(iIntValue2)) {
                    obj2 = c(obj, i10, iIntValue2, obj2, i04Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object c(Object obj, int i10, int i11, Object obj2, i04 i04Var) {
        if (obj2 == null) {
            obj2 = i04Var.c(obj);
        }
        i04Var.l(obj2, i10, i11);
        return obj2;
    }

    static void d(i04 i04Var, Object obj, Object obj2) {
        i04Var.o(obj, i04Var.e(i04Var.d(obj), i04Var.d(obj2)));
    }

    public static void e(Class cls) {
        Class cls2;
        if (!by3.class.isAssignableFrom(cls) && (cls2 = f8074a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void g(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.n(i10, list, z10);
    }

    public static void h(int i10, List list, nx3 nx3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.p(i10, list);
    }

    public static void i(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.r(i10, list, z10);
    }

    public static void j(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.u(i10, list, z10);
    }

    public static void k(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.w(i10, list, z10);
    }

    public static void l(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.y(i10, list, z10);
    }

    public static void m(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.A(i10, list, z10);
    }

    public static void n(int i10, List list, nx3 nx3Var, d04 d04Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            nx3Var.B(i10, list.get(i11), d04Var);
        }
    }

    public static void o(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.D(i10, list, z10);
    }

    public static void p(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.F(i10, list, z10);
    }

    public static void q(int i10, List list, nx3 nx3Var, d04 d04Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            nx3Var.G(i10, list.get(i11), d04Var);
        }
    }

    public static void r(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.I(i10, list, z10);
    }

    public static void s(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.K(i10, list, z10);
    }

    public static void t(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.b(i10, list, z10);
    }

    public static void u(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.d(i10, list, z10);
    }

    public static void v(int i10, List list, nx3 nx3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.g(i10, list);
    }

    public static void w(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.i(i10, list, z10);
    }

    public static void x(int i10, List list, nx3 nx3Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nx3Var.k(i10, list, z10);
    }

    private static i04 y(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (i04) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (mx3.b(i10 << 3) + 1);
    }
}
