package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: m, reason: collision with root package name */
    private final String f19233m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f19234n;

    public r(String str, List list) {
        this.f19233m = str;
        ArrayList arrayList = new ArrayList();
        this.f19234n = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f19233m;
    }

    public final ArrayList b() {
        return this.f19234n;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, r4 r4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String str = this.f19233m;
        if (str == null ? rVar.f19233m == null : str.equals(rVar.f19233m)) {
            return this.f19234n.equals(rVar.f19234n);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final int hashCode() {
        String str = this.f19233m;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f19234n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return null;
    }
}
