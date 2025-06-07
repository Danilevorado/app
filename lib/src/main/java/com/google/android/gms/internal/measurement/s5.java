package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s5 {
    public static double a(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static int b(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static int c(r4 r4Var) {
        int iB = b(r4Var.d("runtime.counter").g().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        r4Var.g("runtime.counter", new i(Double.valueOf(iB)));
        return iB;
    }

    public static long d(double d10) {
        return b(d10) & 4294967295L;
    }

    public static n0 e(String str) {
        n0 n0VarB = null;
        if (str != null && !str.isEmpty()) {
            n0VarB = n0.b(Integer.parseInt(str));
        }
        if (n0VarB != null) {
            return n0VarB;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(q qVar) {
        if (q.f19194c.equals(qVar)) {
            return null;
        }
        if (q.f19193b.equals(qVar)) {
            return "";
        }
        if (qVar instanceof n) {
            return g((n) qVar);
        }
        if (!(qVar instanceof f)) {
            return !qVar.g().isNaN() ? qVar.g() : qVar.i();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((f) qVar).iterator();
        while (it.hasNext()) {
            Object objF = f((q) it.next());
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        return arrayList;
    }

    public static Map g(n nVar) {
        HashMap map = new HashMap();
        for (String str : nVar.a()) {
            Object objF = f(nVar.J(str));
            if (objF != null) {
                map.put(str, objF);
            }
        }
        return map;
    }

    public static void h(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(q qVar) {
        if (qVar == null) {
            return false;
        }
        Double dG = qVar.g();
        return !dG.isNaN() && dG.doubleValue() >= 0.0d && dG.equals(Double.valueOf(Math.floor(dG.doubleValue())));
    }

    public static boolean l(q qVar, q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof v) || (qVar instanceof o)) {
            return true;
        }
        if (!(qVar instanceof i)) {
            return qVar instanceof u ? qVar.i().equals(qVar2.i()) : qVar instanceof g ? qVar.h().equals(qVar2.h()) : qVar == qVar2;
        }
        if (Double.isNaN(qVar.g().doubleValue()) || Double.isNaN(qVar2.g().doubleValue())) {
            return false;
        }
        return qVar.g().equals(qVar2.g());
    }
}
