package x5;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Class f28331a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28332b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28333c;

    private q(Class cls, int i10, int i11) {
        this.f28331a = (Class) c0.c(cls, "Null dependency anInterface.");
        this.f28332b = i10;
        this.f28333c = i11;
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q j(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q k(Class cls) {
        return new q(cls, 2, 0);
    }

    public Class b() {
        return this.f28331a;
    }

    public boolean c() {
        return this.f28333c == 2;
    }

    public boolean d() {
        return this.f28333c == 0;
    }

    public boolean e() {
        return this.f28332b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f28331a == qVar.f28331a && this.f28332b == qVar.f28332b && this.f28333c == qVar.f28333c;
    }

    public boolean f() {
        return this.f28332b == 2;
    }

    public int hashCode() {
        return ((((this.f28331a.hashCode() ^ 1000003) * 1000003) ^ this.f28332b) * 1000003) ^ this.f28333c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f28331a);
        sb2.append(", type=");
        int i10 = this.f28332b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f28333c));
        sb2.append("}");
        return sb2.toString();
    }
}
