package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
final class c0 implements Comparator {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ j f18867m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ r4 f18868n;

    c0(j jVar, r4 r4Var) {
        this.f18867m = jVar;
        this.f18868n = r4Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        j jVar = this.f18867m;
        r4 r4Var = this.f18868n;
        if (qVar instanceof v) {
            return !(qVar2 instanceof v) ? 1 : 0;
        }
        if (qVar2 instanceof v) {
            return -1;
        }
        return jVar == null ? qVar.i().compareTo(qVar2.i()) : (int) s5.a(jVar.a(r4Var, Arrays.asList(qVar, qVar2)).g().doubleValue());
    }
}
