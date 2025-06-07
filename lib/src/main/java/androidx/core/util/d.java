package androidx.core.util;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2363a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2364b;

    public d(Object obj, Object obj2) {
        this.f2363a = obj;
        this.f2364b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f2363a, this.f2363a) && c.a(dVar.f2364b, this.f2364b);
    }

    public int hashCode() {
        Object obj = this.f2363a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2364b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f2363a + " " + this.f2364b + "}";
    }
}
