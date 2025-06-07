package g1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f23719a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23720b;

    public m(String str, int i10) {
        rb.h.e(str, "workSpecId");
        this.f23719a = str;
        this.f23720b = i10;
    }

    public final int a() {
        return this.f23720b;
    }

    public final String b() {
        return this.f23719a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return rb.h.a(this.f23719a, mVar.f23719a) && this.f23720b == mVar.f23720b;
    }

    public int hashCode() {
        return (this.f23719a.hashCode() * 31) + this.f23720b;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f23719a + ", generation=" + this.f23720b + ')';
    }
}
