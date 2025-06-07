package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t6 {
    public static q a(p5 p5Var) {
        if (p5Var == null) {
            return q.f19193b;
        }
        int iE = p5Var.E() - 1;
        if (iE == 1) {
            return p5Var.D() ? new u(p5Var.y()) : q.f19200i;
        }
        if (iE == 2) {
            return p5Var.C() ? new i(Double.valueOf(p5Var.v())) : new i(null);
        }
        if (iE == 3) {
            return p5Var.B() ? new g(Boolean.valueOf(p5Var.A())) : new g(null);
        }
        if (iE != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listZ = p5Var.z();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(a((p5) it.next()));
        }
        return new r(p5Var.x(), arrayList);
    }

    public static q b(Object obj) {
        if (obj == null) {
            return q.f19194c;
        }
        if (obj instanceof String) {
            return new u((String) obj);
        }
        if (obj instanceof Double) {
            return new i((Double) obj);
        }
        if (obj instanceof Long) {
            return new i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            f fVar = new f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                fVar.x(fVar.n(), b(it.next()));
            }
            return fVar;
        }
        n nVar = new n();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            q qVarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                nVar.n0((String) string, qVarB);
            }
        }
        return nVar;
    }
}
