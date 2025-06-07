package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class k73 implements Comparator {
    protected k73() {
    }

    public static k73 b(Comparator comparator) {
        return comparator instanceof k73 ? (k73) comparator : new m53(comparator);
    }

    public static k73 c() {
        return i73.f9599m;
    }

    public k73 a() {
        return new u73(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
