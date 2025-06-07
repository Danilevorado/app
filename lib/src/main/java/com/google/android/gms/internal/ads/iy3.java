package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public final class iy3 extends AbstractList {

    /* renamed from: m, reason: collision with root package name */
    private final List f10217m;

    /* renamed from: n, reason: collision with root package name */
    private final hy3 f10218n;

    public iy3(List list, hy3 hy3Var) {
        this.f10217m = list;
        this.f10218n = hy3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        on onVarB = on.b(((Integer) this.f10217m.get(i10)).intValue());
        return onVarB == null ? on.AD_FORMAT_TYPE_UNSPECIFIED : onVarB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10217m.size();
    }
}
