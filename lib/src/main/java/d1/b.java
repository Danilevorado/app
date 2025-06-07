package d1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22803a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22804b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22805c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22806d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f22803a = z10;
        this.f22804b = z11;
        this.f22805c = z12;
        this.f22806d = z13;
    }

    public final boolean a() {
        return this.f22803a;
    }

    public final boolean b() {
        return this.f22805c;
    }

    public final boolean c() {
        return this.f22806d;
    }

    public final boolean d() {
        return this.f22804b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22803a == bVar.f22803a && this.f22804b == bVar.f22804b && this.f22805c == bVar.f22805c && this.f22806d == bVar.f22806d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f22803a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f22804b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f22805c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.f22806d;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f22803a + ", isValidated=" + this.f22804b + ", isMetered=" + this.f22805c + ", isNotRoaming=" + this.f22806d + ')';
    }
}
