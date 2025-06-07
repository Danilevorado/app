package m3;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25213a;

    /* renamed from: b, reason: collision with root package name */
    public final double f25214b;

    /* renamed from: c, reason: collision with root package name */
    public final double f25215c;

    /* renamed from: d, reason: collision with root package name */
    public final double f25216d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25217e;

    public e0(String str, double d10, double d11, double d12, int i10) {
        this.f25213a = str;
        this.f25215c = d10;
        this.f25214b = d11;
        this.f25216d = d12;
        this.f25217e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return e4.o.a(this.f25213a, e0Var.f25213a) && this.f25214b == e0Var.f25214b && this.f25215c == e0Var.f25215c && this.f25217e == e0Var.f25217e && Double.compare(this.f25216d, e0Var.f25216d) == 0;
    }

    public final int hashCode() {
        return e4.o.b(this.f25213a, Double.valueOf(this.f25214b), Double.valueOf(this.f25215c), Double.valueOf(this.f25216d), Integer.valueOf(this.f25217e));
    }

    public final String toString() {
        return e4.o.c(this).a("name", this.f25213a).a("minBound", Double.valueOf(this.f25215c)).a("maxBound", Double.valueOf(this.f25214b)).a("percent", Double.valueOf(this.f25216d)).a("count", Integer.valueOf(this.f25217e)).toString();
    }
}
