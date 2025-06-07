package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f18829a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18830b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f18831c;

    public b(String str, long j10, Map map) {
        this.f18829a = str;
        this.f18830b = j10;
        HashMap map2 = new HashMap();
        this.f18831c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final long a() {
        return this.f18830b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f18829a, this.f18830b, new HashMap(this.f18831c));
    }

    public final Object c(String str) {
        if (this.f18831c.containsKey(str)) {
            return this.f18831c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.f18829a;
    }

    public final Map e() {
        return this.f18831c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f18830b == bVar.f18830b && this.f18829a.equals(bVar.f18829a)) {
            return this.f18831c.equals(bVar.f18831c);
        }
        return false;
    }

    public final void f(String str) {
        this.f18829a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.f18831c.remove(str);
        } else {
            this.f18831c.put(str, obj);
        }
    }

    public final int hashCode() {
        int iHashCode = this.f18829a.hashCode();
        long j10 = this.f18830b;
        return (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f18831c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f18829a + "', timestamp=" + this.f18830b + ", params=" + this.f18831c.toString() + "}";
    }
}
