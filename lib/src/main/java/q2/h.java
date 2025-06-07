package q2;

/* loaded from: classes.dex */
final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f26238a;

    h(long j10) {
        this.f26238a = j10;
    }

    @Override // q2.n
    public long c() {
        return this.f26238a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f26238a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f26238a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f26238a + "}";
    }
}
