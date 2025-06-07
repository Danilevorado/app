package n2;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Class f25504a;

    /* renamed from: b, reason: collision with root package name */
    private Class f25505b;

    /* renamed from: c, reason: collision with root package name */
    private Class f25506c;

    public j() {
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f25504a = cls;
        this.f25505b = cls2;
        this.f25506c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f25504a.equals(jVar.f25504a) && this.f25505b.equals(jVar.f25505b) && l.c(this.f25506c, jVar.f25506c);
    }

    public int hashCode() {
        int iHashCode = ((this.f25504a.hashCode() * 31) + this.f25505b.hashCode()) * 31;
        Class cls = this.f25506c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f25504a + ", second=" + this.f25505b + '}';
    }
}
