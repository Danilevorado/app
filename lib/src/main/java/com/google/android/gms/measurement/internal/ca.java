package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.gc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ca {

    /* renamed from: a, reason: collision with root package name */
    private String f19830a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19831b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.z4 f19832c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f19833d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f19834e;

    /* renamed from: f, reason: collision with root package name */
    private Map f19835f;

    /* renamed from: g, reason: collision with root package name */
    private Map f19836g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b f19837h;

    /* synthetic */ ca(b bVar, String str, com.google.android.gms.internal.measurement.z4 z4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, x4.d0 d0Var) {
        this.f19837h = bVar;
        this.f19830a = str;
        this.f19833d = bitSet;
        this.f19834e = bitSet2;
        this.f19835f = map;
        this.f19836g = new q.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f19836g.put(num, arrayList);
        }
        this.f19831b = false;
        this.f19832c = z4Var;
    }

    /* synthetic */ ca(b bVar, String str, x4.d0 d0Var) {
        this.f19837h = bVar;
        this.f19830a = str;
        this.f19831b = true;
        this.f19833d = new BitSet();
        this.f19834e = new BitSet();
        this.f19835f = new q.a();
        this.f19836g = new q.a();
    }

    final com.google.android.gms.internal.measurement.f4 a(int i10) {
        ArrayList arrayList;
        List listEmptyList;
        com.google.android.gms.internal.measurement.e4 e4VarW = com.google.android.gms.internal.measurement.f4.w();
        e4VarW.s(i10);
        e4VarW.u(this.f19831b);
        com.google.android.gms.internal.measurement.z4 z4Var = this.f19832c;
        if (z4Var != null) {
            e4VarW.v(z4Var);
        }
        com.google.android.gms.internal.measurement.y4 y4VarA = com.google.android.gms.internal.measurement.z4.A();
        y4VarA.t(p9.H(this.f19833d));
        y4VarA.v(p9.H(this.f19834e));
        Map map = this.f19835f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = this.f19835f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                Long l10 = (Long) this.f19835f.get(Integer.valueOf(iIntValue));
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.g4 g4VarX = com.google.android.gms.internal.measurement.h4.x();
                    g4VarX.t(iIntValue);
                    g4VarX.s(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.h4) g4VarX.k());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            y4VarA.s(arrayList);
        }
        Map map2 = this.f19836g;
        if (map2 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f19836g.keySet()) {
                com.google.android.gms.internal.measurement.a5 a5VarY = com.google.android.gms.internal.measurement.b5.y();
                a5VarY.t(num.intValue());
                List list = (List) this.f19836g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    a5VarY.s(list);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.b5) a5VarY.k());
            }
            listEmptyList = arrayList3;
        }
        y4VarA.u(listEmptyList);
        e4VarW.t(y4VarA);
        return (com.google.android.gms.internal.measurement.f4) e4VarW.k();
    }

    final void c(fa faVar) {
        int iA = faVar.a();
        Boolean bool = faVar.f19911c;
        if (bool != null) {
            this.f19834e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = faVar.f19912d;
        if (bool2 != null) {
            this.f19833d.set(iA, bool2.booleanValue());
        }
        if (faVar.f19913e != null) {
            Map map = this.f19835f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = faVar.f19913e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f19835f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (faVar.f19914f != null) {
            Map map2 = this.f19836g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f19836g.put(numValueOf2, arrayList);
            }
            if (faVar.c()) {
                arrayList.clear();
            }
            gc.c();
            h hVarY = this.f19837h.f20269a.y();
            String str = this.f19830a;
            h3 h3Var = i3.Y;
            if (hVarY.A(str, h3Var) && faVar.b()) {
                arrayList.clear();
            }
            gc.c();
            boolean zA = this.f19837h.f20269a.y().A(this.f19830a, h3Var);
            Long lValueOf = Long.valueOf(faVar.f19914f.longValue() / 1000);
            if (!zA) {
                arrayList.add(lValueOf);
            } else {
                if (arrayList.contains(lValueOf)) {
                    return;
                }
                arrayList.add(lValueOf);
            }
        }
    }
}
