package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a4 extends AbstractList implements RandomAccess, e2 {

    /* renamed from: m, reason: collision with root package name */
    private final e2 f19458m;

    public a4(e2 e2Var) {
        this.f19458m = e2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    public final Object C(int i10) {
        return this.f19458m.C(i10);
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    public final e2 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.e2
    public final List g() {
        return this.f19458m.g();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((d2) this.f19458m).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new z3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new y3(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19458m.size();
    }
}
