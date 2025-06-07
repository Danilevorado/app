package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
final class s73 extends k73 implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    static final s73 f15139m = new s73();

    private s73() {
    }

    @Override // com.google.android.gms.internal.ads.k73
    public final k73 a() {
        return i73.f9599m;
    }

    @Override // com.google.android.gms.internal.ads.k73, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
