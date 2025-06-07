package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: o, reason: collision with root package name */
    protected final List f19182o;

    /* renamed from: p, reason: collision with root package name */
    protected final List f19183p;

    /* renamed from: q, reason: collision with root package name */
    protected r4 f19184q;

    private p(p pVar) {
        super(pVar.f19019m);
        ArrayList arrayList = new ArrayList(pVar.f19182o.size());
        this.f19182o = arrayList;
        arrayList.addAll(pVar.f19182o);
        ArrayList arrayList2 = new ArrayList(pVar.f19183p.size());
        this.f19183p = arrayList2;
        arrayList2.addAll(pVar.f19183p);
        this.f19184q = pVar.f19184q;
    }

    public p(String str, List list, List list2, r4 r4Var) {
        super(str);
        this.f19182o = new ArrayList();
        this.f19184q = r4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f19182o.add(((q) it.next()).i());
            }
        }
        this.f19183p = new ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        String str;
        q qVarB;
        r4 r4VarA = this.f19184q.a();
        for (int i10 = 0; i10 < this.f19182o.size(); i10++) {
            if (i10 < list.size()) {
                str = (String) this.f19182o.get(i10);
                qVarB = r4Var.b((q) list.get(i10));
            } else {
                str = (String) this.f19182o.get(i10);
                qVarB = q.f19193b;
            }
            r4VarA.e(str, qVarB);
        }
        for (q qVar : this.f19183p) {
            q qVarB2 = r4VarA.b(qVar);
            if (qVarB2 instanceof r) {
                qVarB2 = r4VarA.b(qVar);
            }
            if (qVarB2 instanceof h) {
                return ((h) qVarB2).a();
            }
        }
        return q.f19193b;
    }

    @Override // com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.q
    public final q f() {
        return new p(this);
    }
}
