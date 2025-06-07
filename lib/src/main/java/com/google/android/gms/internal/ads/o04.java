package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o04 extends AbstractList implements RandomAccess, ry3 {

    /* renamed from: m, reason: collision with root package name */
    private final ry3 f12951m;

    public o04(ry3 ry3Var) {
        this.f12951m = ry3Var;
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final Object C(int i10) {
        return this.f12951m.C(i10);
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final ry3 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final List g() {
        return this.f12951m.g();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((qy3) this.f12951m).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new n04(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new m04(this, i10);
    }

    @Override // com.google.android.gms.internal.ads.ry3
    public final void m(ww3 ww3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12951m.size();
    }
}
