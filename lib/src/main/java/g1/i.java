package g1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f23709a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23711c;

    public i(String str, int i10, int i11) {
        rb.h.e(str, "workSpecId");
        this.f23709a = str;
        this.f23710b = i10;
        this.f23711c = i11;
    }

    public final int a() {
        return this.f23710b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return rb.h.a(this.f23709a, iVar.f23709a) && this.f23710b == iVar.f23710b && this.f23711c == iVar.f23711c;
    }

    public int hashCode() {
        return (((this.f23709a.hashCode() * 31) + this.f23710b) * 31) + this.f23711c;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f23709a + ", generation=" + this.f23710b + ", systemId=" + this.f23711c + ')';
    }
}
