package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class e43 extends s63 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ g43 f7625m;

    e43(g43 g43Var) {
        this.f7625m = g43Var;
    }

    @Override // com.google.android.gms.internal.ads.s63, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a53.a(this.f7625m.f8604o.entrySet(), obj);
    }

    @Override // com.google.android.gms.internal.ads.s63
    final Map e() {
        return this.f7625m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new f43(this.f7625m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        u43.u(this.f7625m.f8605p, entry.getKey());
        return true;
    }
}
