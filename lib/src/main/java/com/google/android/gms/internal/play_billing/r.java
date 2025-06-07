package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class r extends n {

    /* renamed from: o, reason: collision with root package name */
    private final transient m f19631o;

    /* renamed from: p, reason: collision with root package name */
    private final transient Object[] f19632p;

    /* renamed from: q, reason: collision with root package name */
    private final transient int f19633q;

    r(m mVar, Object[] objArr, int i10, int i11) {
        this.f19631o = mVar;
        this.f19632p = objArr;
        this.f19633q = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f19631o.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.g
    final int e(Object[] objArr, int i10) {
        return k().e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.n
    final j o() {
        return new q(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19633q;
    }
}
