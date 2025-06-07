package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final r4 f19242a;

    /* renamed from: b, reason: collision with root package name */
    final y f19243b;

    /* renamed from: c, reason: collision with root package name */
    final Map f19244c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f19245d = new HashMap();

    public r4(r4 r4Var, y yVar) {
        this.f19242a = r4Var;
        this.f19243b = yVar;
    }

    public final r4 a() {
        return new r4(this, this.f19243b);
    }

    public final q b(q qVar) {
        return this.f19243b.a(this, qVar);
    }

    public final q c(f fVar) {
        q qVarA = q.f19193b;
        Iterator itQ = fVar.q();
        while (itQ.hasNext()) {
            qVarA = this.f19243b.a(this, fVar.o(((Integer) itQ.next()).intValue()));
            if (qVarA instanceof h) {
                break;
            }
        }
        return qVarA;
    }

    public final q d(String str) {
        if (this.f19244c.containsKey(str)) {
            return (q) this.f19244c.get(str);
        }
        r4 r4Var = this.f19242a;
        if (r4Var != null) {
            return r4Var.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, q qVar) {
        if (this.f19245d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.f19244c.remove(str);
        } else {
            this.f19244c.put(str, qVar);
        }
    }

    public final void f(String str, q qVar) {
        e(str, qVar);
        this.f19245d.put(str, Boolean.TRUE);
    }

    public final void g(String str, q qVar) {
        r4 r4Var;
        if (!this.f19244c.containsKey(str) && (r4Var = this.f19242a) != null && r4Var.h(str)) {
            this.f19242a.g(str, qVar);
        } else {
            if (this.f19245d.containsKey(str)) {
                return;
            }
            if (qVar == null) {
                this.f19244c.remove(str);
            } else {
                this.f19244c.put(str, qVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.f19244c.containsKey(str)) {
            return true;
        }
        r4 r4Var = this.f19242a;
        if (r4Var != null) {
            return r4Var.h(str);
        }
        return false;
    }
}
