package y2;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final b3.a f28460a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f28461b;

    b(b3.a aVar, Map map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f28460a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f28461b = map;
    }

    @Override // y2.f
    b3.a e() {
        return this.f28460a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f28460a.equals(fVar.e()) && this.f28461b.equals(fVar.h());
    }

    @Override // y2.f
    Map h() {
        return this.f28461b;
    }

    public int hashCode() {
        return ((this.f28460a.hashCode() ^ 1000003) * 1000003) ^ this.f28461b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f28460a + ", values=" + this.f28461b + "}";
    }
}
