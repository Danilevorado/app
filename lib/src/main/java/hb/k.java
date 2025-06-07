package hb;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class k implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    private final Object f24169m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f24170n;

    public k(Object obj, Object obj2) {
        this.f24169m = obj;
        this.f24170n = obj2;
    }

    public final Object a() {
        return this.f24169m;
    }

    public final Object b() {
        return this.f24170n;
    }

    public final Object c() {
        return this.f24169m;
    }

    public final Object d() {
        return this.f24170n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return rb.h.a(this.f24169m, kVar.f24169m) && rb.h.a(this.f24170n, kVar.f24170n);
    }

    public int hashCode() {
        Object obj = this.f24169m;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f24170n;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f24169m + ", " + this.f24170n + ')';
    }
}
