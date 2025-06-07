package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j implements q, m {

    /* renamed from: m, reason: collision with root package name */
    protected final String f19019m;

    /* renamed from: n, reason: collision with root package name */
    protected final Map f19020n = new HashMap();

    public j(String str) {
        this.f19019m = str;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q J(String str) {
        return this.f19020n.containsKey(str) ? (q) this.f19020n.get(str) : q.f19193b;
    }

    public abstract q a(r4 r4Var, List list);

    public final String b() {
        return this.f19019m;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, r4 r4Var, List list) {
        return "toString".equals(str) ? new u(this.f19019m) : k.a(this, new u(str), r4Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f19019m;
        if (str != null) {
            return str.equals(jVar.f19019m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q f() {
        return this;
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
        String str = this.f19019m;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        return this.f19019m;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return k.b(this.f19020n);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean m0(String str) {
        return this.f19020n.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void n0(String str, q qVar) {
        if (qVar == null) {
            this.f19020n.remove(str);
        } else {
            this.f19020n.put(str, qVar);
        }
    }
}
