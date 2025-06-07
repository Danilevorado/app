package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class n73 extends h63 {

    /* renamed from: o, reason: collision with root package name */
    private final transient f63 f12476o;

    /* renamed from: p, reason: collision with root package name */
    private final transient Object[] f12477p;

    /* renamed from: q, reason: collision with root package name */
    private final transient int f12478q;

    n73(f63 f63Var, Object[] objArr, int i10, int i11) {
        this.f12476o = f63Var;
        this.f12477p = objArr;
        this.f12478q = i11;
    }

    @Override // com.google.android.gms.internal.ads.x53, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f12476o.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x53
    final int e(Object[] objArr, int i10) {
        return k().e(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h63, com.google.android.gms.internal.ads.x53
    public final c83 l() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h63
    final c63 q() {
        return new m73(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12478q;
    }
}
