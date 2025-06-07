package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class n implements q, m {

    /* renamed from: m, reason: collision with root package name */
    final Map f19079m = new HashMap();

    @Override // com.google.android.gms.internal.measurement.m
    public final q J(String str) {
        return this.f19079m.containsKey(str) ? (q) this.f19079m.get(str) : q.f19193b;
    }

    public final List a() {
        return new ArrayList(this.f19079m.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q e(String str, r4 r4Var, List list) {
        return "toString".equals(str) ? new u(toString()) : k.a(this, new u(str), r4Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f19079m.equals(((n) obj).f19079m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        Map map;
        String str;
        q qVarF;
        n nVar = new n();
        for (Map.Entry entry : this.f19079m.entrySet()) {
            if (entry.getValue() instanceof m) {
                map = nVar.f19079m;
                str = (String) entry.getKey();
                qVarF = (q) entry.getValue();
            } else {
                map = nVar.f19079m;
                str = (String) entry.getKey();
                qVarF = ((q) entry.getValue()).f();
            }
            map.put(str, qVarF);
        }
        return nVar;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f19079m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return k.b(this.f19079m);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean m0(String str) {
        return this.f19079m.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void n0(String str, q qVar) {
        if (qVar == null) {
            this.f19079m.remove(str);
        } else {
            this.f19079m.put(str, qVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f19079m.isEmpty()) {
            for (String str : this.f19079m.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f19079m.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
