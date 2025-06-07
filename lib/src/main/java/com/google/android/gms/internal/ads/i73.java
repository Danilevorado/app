package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
final class i73 extends k73 implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    static final i73 f9599m = new i73();

    private i73() {
    }

    @Override // com.google.android.gms.internal.ads.k73
    public final k73 a() {
        return s73.f15139m;
    }

    @Override // com.google.android.gms.internal.ads.k73, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
