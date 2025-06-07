package z2;

import java.util.Objects;

/* loaded from: classes.dex */
final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final long f28773a;

    /* renamed from: b, reason: collision with root package name */
    private final r2.o f28774b;

    /* renamed from: c, reason: collision with root package name */
    private final r2.i f28775c;

    b(long j10, r2.o oVar, r2.i iVar) {
        this.f28773a = j10;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f28774b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f28775c = iVar;
    }

    @Override // z2.k
    public r2.i b() {
        return this.f28775c;
    }

    @Override // z2.k
    public long c() {
        return this.f28773a;
    }

    @Override // z2.k
    public r2.o d() {
        return this.f28774b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f28773a == kVar.c() && this.f28774b.equals(kVar.d()) && this.f28775c.equals(kVar.b());
    }

    public int hashCode() {
        long j10 = this.f28773a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f28774b.hashCode()) * 1000003) ^ this.f28775c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f28773a + ", transportContext=" + this.f28774b + ", event=" + this.f28775c + "}";
    }
}
