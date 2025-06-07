package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class x43 implements y63 {

    /* renamed from: m, reason: collision with root package name */
    private transient Set f17384m;

    /* renamed from: n, reason: collision with root package name */
    private transient Collection f17385n;

    /* renamed from: o, reason: collision with root package name */
    private transient Map f17386o;

    x43() {
    }

    abstract Collection b();

    abstract Iterator d();

    abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y63) {
            return t().equals(((y63) obj).t());
        }
        return false;
    }

    abstract Set f();

    public final Set g() {
        Set set = this.f17384m;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f17384m = setF;
        return setF;
    }

    public final int hashCode() {
        return t().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.y63
    public final Collection r() {
        Collection collection = this.f17385n;
        if (collection != null) {
            return collection;
        }
        Collection collectionB = b();
        this.f17385n = collectionB;
        return collectionB;
    }

    @Override // com.google.android.gms.internal.ads.y63
    public final Map t() {
        Map map = this.f17386o;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f17386o = mapE;
        return mapE;
    }

    public final String toString() {
        return t().toString();
    }
}
