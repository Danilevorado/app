package t1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
final class d implements r1.f {

    /* renamed from: b, reason: collision with root package name */
    private final r1.f f27149b;

    /* renamed from: c, reason: collision with root package name */
    private final r1.f f27150c;

    d(r1.f fVar, r1.f fVar2) {
        this.f27149b = fVar;
        this.f27150c = fVar2;
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        this.f27149b.b(messageDigest);
        this.f27150c.b(messageDigest);
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f27149b.equals(dVar.f27149b) && this.f27150c.equals(dVar.f27150c);
    }

    @Override // r1.f
    public int hashCode() {
        return (this.f27149b.hashCode() * 31) + this.f27150c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f27149b + ", signature=" + this.f27150c + '}';
    }
}
