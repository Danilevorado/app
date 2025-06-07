package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class la {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f19061a;

    /* renamed from: b, reason: collision with root package name */
    private static final pa f19062b;

    /* renamed from: c, reason: collision with root package name */
    private static final pa f19063c;

    /* renamed from: d, reason: collision with root package name */
    private static final pa f19064d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f19061a = cls;
        f19062b = C(false);
        f19063c = C(true);
        f19064d = new ra();
    }

    static int A(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (f8.a(i10 << 3) + 1);
    }

    static void B(t9 t9Var, Object obj, Object obj2, long j10) {
        za.x(obj, j10, t9.b(za.k(obj, j10), za.k(obj2, j10)));
    }

    private static pa C(boolean z10) {
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
            return (pa) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int D(List list) {
        return list.size();
    }

    static int E(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC = size * f8.C(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iC += f8.x((x7) list.get(i11));
        }
        return iC;
    }

    static int F(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * f8.C(i10));
    }

    static int G(List list) {
        int iZ;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v8) {
            v8 v8Var = (v8) list;
            iZ = 0;
            while (i10 < size) {
                iZ += f8.z(v8Var.f(i10));
                i10++;
            }
        } else {
            iZ = 0;
            while (i10 < size) {
                iZ += f8.z(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZ;
    }

    static int H(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (f8.a(i10 << 3) + 4);
    }

    static int I(List list) {
        return list.size() * 4;
    }

    static int J(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (f8.a(i10 << 3) + 8);
    }

    static int K(List list) {
        return list.size() * 8;
    }

    static int L(int i10, List list, ja jaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iY += f8.y(i10, (y9) list.get(i11), jaVar);
        }
        return iY;
    }

    static int M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * f8.C(i10));
    }

    static int N(List list) {
        int iZ;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v8) {
            v8 v8Var = (v8) list;
            iZ = 0;
            while (i10 < size) {
                iZ += f8.z(v8Var.f(i10));
                i10++;
            }
        } else {
            iZ = 0;
            while (i10 < size) {
                iZ += f8.z(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZ;
    }

    static int O(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * f8.C(i10));
    }

    static int P(List list) {
        int iB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o9) {
            o9 o9Var = (o9) list;
            iB = 0;
            while (i10 < size) {
                iB += f8.b(o9Var.a(i10));
                i10++;
            }
        } else {
            iB = 0;
            while (i10 < size) {
                iB += f8.b(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iB;
    }

    static int Q(int i10, Object obj, ja jaVar) {
        return f8.a(i10 << 3) + f8.A((y9) obj, jaVar);
    }

    static int R(int i10, List list, ja jaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC = f8.C(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iC += f8.A((y9) list.get(i11), jaVar);
        }
        return iC;
    }

    static int S(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * f8.C(i10));
    }

    static int T(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v8) {
            v8 v8Var = (v8) list;
            iA = 0;
            while (i10 < size) {
                int iF = v8Var.f(i10);
                iA += f8.a((iF >> 31) ^ (iF + iF));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iA += f8.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iA;
    }

    static int U(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * f8.C(i10));
    }

    static int V(List list) {
        int iB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o9) {
            o9 o9Var = (o9) list;
            iB = 0;
            while (i10 < size) {
                long jA = o9Var.a(i10);
                iB += f8.b((jA >> 63) ^ (jA + jA));
                i10++;
            }
        } else {
            iB = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iB += f8.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iB;
    }

    static int W(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iC = f8.C(i10) * size;
        if (list instanceof g9) {
            g9 g9Var = (g9) list;
            while (i11 < size) {
                Object objC = g9Var.C(i11);
                iC += objC instanceof x7 ? f8.x((x7) objC) : f8.B((String) objC);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iC += obj instanceof x7 ? f8.x((x7) obj) : f8.B((String) obj);
                i11++;
            }
        }
        return iC;
    }

    static int X(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * f8.C(i10));
    }

    static int Y(List list) {
        int iA;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof v8) {
            v8 v8Var = (v8) list;
            iA = 0;
            while (i10 < size) {
                iA += f8.a(v8Var.f(i10));
                i10++;
            }
        } else {
            iA = 0;
            while (i10 < size) {
                iA += f8.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iA;
    }

    static int Z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * f8.C(i10));
    }

    public static pa a() {
        return f19063c;
    }

    static int a0(List list) {
        int iB;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o9) {
            o9 o9Var = (o9) list;
            iB = 0;
            while (i10 < size) {
                iB += f8.b(o9Var.a(i10));
                i10++;
            }
        } else {
            iB = 0;
            while (i10 < size) {
                iB += f8.b(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iB;
    }

    public static pa b() {
        return f19064d;
    }

    public static pa b0() {
        return f19062b;
    }

    static Object c(int i10, List list, x8 x8Var, Object obj, pa paVar) {
        if (x8Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (x8Var.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj = d(i10, iIntValue, obj, paVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!x8Var.a(iIntValue2)) {
                    obj = d(i10, iIntValue2, obj, paVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object d(int i10, int i11, Object obj, pa paVar) {
        if (obj == null) {
            obj = paVar.e();
        }
        paVar.f(obj, i10, i11);
        return obj;
    }

    static void e(k8 k8Var, Object obj, Object obj2) {
        k8Var.a(obj2);
        throw null;
    }

    static void f(pa paVar, Object obj, Object obj2) {
        paVar.h(obj, paVar.d(paVar.c(obj), paVar.c(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!u8.class.isAssignableFrom(cls) && (cls2 = f19061a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void h(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.k(i10, list, z10);
    }

    public static void i(int i10, List list, gb gbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.d(i10, list);
    }

    public static void j(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.l(i10, list, z10);
    }

    public static void k(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.u(i10, list, z10);
    }

    public static void l(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.m(i10, list, z10);
    }

    public static void m(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.e(i10, list, z10);
    }

    public static void n(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.r(i10, list, z10);
    }

    public static void o(int i10, List list, gb gbVar, ja jaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((g8) gbVar).A(i10, list.get(i11), jaVar);
        }
    }

    public static void p(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.s(i10, list, z10);
    }

    public static void q(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.g(i10, list, z10);
    }

    public static void r(int i10, List list, gb gbVar, ja jaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((g8) gbVar).I(i10, list.get(i11), jaVar);
        }
    }

    public static void s(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.F(i10, list, z10);
    }

    public static void t(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.x(i10, list, z10);
    }

    public static void u(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.z(i10, list, z10);
    }

    public static void v(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.J(i10, list, z10);
    }

    public static void w(int i10, List list, gb gbVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.v(i10, list);
    }

    public static void x(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.H(i10, list, z10);
    }

    public static void y(int i10, List list, gb gbVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gbVar.B(i10, list, z10);
    }

    static boolean z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
