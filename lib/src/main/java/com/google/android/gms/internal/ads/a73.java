package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class a73 extends e73 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f5979a;

    a73(Comparator comparator) {
        this.f5979a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.e73
    final Map a() {
        return new TreeMap(this.f5979a);
    }
}
