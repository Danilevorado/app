package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f implements Iterable, q, m {

    /* renamed from: m, reason: collision with root package name */
    final SortedMap f18932m;

    /* renamed from: n, reason: collision with root package name */
    final Map f18933n;

    public f() {
        this.f18932m = new TreeMap();
        this.f18933n = new TreeMap();
    }

    public f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                x(i10, (q) list.get(i10));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q J(String str) {
        q qVar;
        return "length".equals(str) ? new i(Double.valueOf(n())) : (!m0(str) || (qVar = (q) this.f18933n.get(str)) == null) ? q.f19193b : qVar;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, r4 r4Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? d0.a(str, this, r4Var, list) : k.a(this, new u(str), r4Var, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (n() != fVar.n()) {
            return false;
        }
        if (this.f18932m.isEmpty()) {
            return fVar.f18932m.isEmpty();
        }
        for (int iIntValue = ((Integer) this.f18932m.firstKey()).intValue(); iIntValue <= ((Integer) this.f18932m.lastKey()).intValue(); iIntValue++) {
            if (!o(iIntValue).equals(fVar.o(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        SortedMap sortedMap;
        Integer num;
        q qVarF;
        f fVar = new f();
        for (Map.Entry entry : this.f18932m.entrySet()) {
            if (entry.getValue() instanceof m) {
                sortedMap = fVar.f18932m;
                num = (Integer) entry.getKey();
                qVarF = (q) entry.getValue();
            } else {
                sortedMap = fVar.f18932m;
                num = (Integer) entry.getKey();
                qVarF = ((q) entry.getValue()).f();
            }
            sortedMap.put(num, qVarF);
        }
        return fVar;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        return this.f18932m.size() == 1 ? o(0).g() : this.f18932m.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f18932m.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        return p(",");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    public final int k() {
        return this.f18932m.size();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return new d(this, this.f18932m.keySet().iterator(), this.f18933n.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean m0(String str) {
        return "length".equals(str) || this.f18933n.containsKey(str);
    }

    public final int n() {
        if (this.f18932m.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f18932m.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void n0(String str, q qVar) {
        if (qVar == null) {
            this.f18933n.remove(str);
        } else {
            this.f18933n.put(str, qVar);
        }
    }

    public final q o(int i10) {
        q qVar;
        if (i10 < n()) {
            return (!y(i10) || (qVar = (q) this.f18932m.get(Integer.valueOf(i10))) == null) ? q.f19193b : qVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String p(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f18932m.isEmpty()) {
            for (int i10 = 0; i10 < n(); i10++) {
                q qVarO = o(i10);
                sb2.append(str);
                if (!(qVarO instanceof v) && !(qVarO instanceof o)) {
                    sb2.append(qVarO.i());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final Iterator q() {
        return this.f18932m.keySet().iterator();
    }

    public final List s() {
        ArrayList arrayList = new ArrayList(n());
        for (int i10 = 0; i10 < n(); i10++) {
            arrayList.add(o(i10));
        }
        return arrayList;
    }

    public final void t() {
        this.f18932m.clear();
    }

    public final String toString() {
        return p(",");
    }

    public final void u(int i10, q qVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i10);
        }
        if (i10 >= n()) {
            x(i10, qVar);
            return;
        }
        for (int iIntValue = ((Integer) this.f18932m.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            SortedMap sortedMap = this.f18932m;
            Integer numValueOf = Integer.valueOf(iIntValue);
            q qVar2 = (q) sortedMap.get(numValueOf);
            if (qVar2 != null) {
                x(iIntValue + 1, qVar2);
                this.f18932m.remove(numValueOf);
            }
        }
        x(i10, qVar);
    }

    public final void v(int i10) {
        int iIntValue = ((Integer) this.f18932m.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        this.f18932m.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            SortedMap sortedMap = this.f18932m;
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            this.f18932m.put(numValueOf, q.f19193b);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) this.f18932m.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.f18932m;
            Integer numValueOf2 = Integer.valueOf(i10);
            q qVar = (q) sortedMap2.get(numValueOf2);
            if (qVar != null) {
                this.f18932m.put(Integer.valueOf(i10 - 1), qVar);
                this.f18932m.remove(numValueOf2);
            }
        }
    }

    public final void x(int i10, q qVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        }
        if (qVar == null) {
            this.f18932m.remove(Integer.valueOf(i10));
        } else {
            this.f18932m.put(Integer.valueOf(i10), qVar);
        }
    }

    public final boolean y(int i10) {
        if (i10 >= 0 && i10 <= ((Integer) this.f18932m.lastKey()).intValue()) {
            return this.f18932m.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
    }
}
