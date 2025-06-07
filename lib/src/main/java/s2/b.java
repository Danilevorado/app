package s2;

import java.util.Objects;
import s2.g;

/* loaded from: classes.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f26739a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26740b;

    b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f26739a = aVar;
        this.f26740b = j10;
    }

    @Override // s2.g
    public long b() {
        return this.f26740b;
    }

    @Override // s2.g
    public g.a c() {
        return this.f26739a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f26739a.equals(gVar.c()) && this.f26740b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f26739a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f26740b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f26739a + ", nextRequestWaitMillis=" + this.f26740b + "}";
    }
}
