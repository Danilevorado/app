package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class q extends j {

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ r f19622p;

    q(r rVar) {
        this.f19622p = rVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        b.a(i10, this.f19622p.f19633q, "index");
        int i11 = i10 + i10;
        Object obj = this.f19622p.f19632p[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f19622p.f19632p[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.g
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19622p.f19633q;
    }
}
