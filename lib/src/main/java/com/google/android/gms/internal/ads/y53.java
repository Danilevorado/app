package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class y53 extends v43 implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    final Object f17896m;

    /* renamed from: n, reason: collision with root package name */
    final Object f17897n;

    y53(Object obj, Object obj2) {
        this.f17896m = obj;
        this.f17897n = obj2;
    }

    @Override // com.google.android.gms.internal.ads.v43, java.util.Map.Entry
    public final Object getKey() {
        return this.f17896m;
    }

    @Override // com.google.android.gms.internal.ads.v43, java.util.Map.Entry
    public final Object getValue() {
        return this.f17897n;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
