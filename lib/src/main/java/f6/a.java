package f6;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    private final String f23636a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23637b;

    a(String str, List list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f23636a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f23637b = list;
    }

    @Override // f6.m
    public List b() {
        return this.f23637b;
    }

    @Override // f6.m
    public String c() {
        return this.f23636a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f23636a.equals(mVar.c()) && this.f23637b.equals(mVar.b());
    }

    public int hashCode() {
        return ((this.f23636a.hashCode() ^ 1000003) * 1000003) ^ this.f23637b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f23636a + ", usedDates=" + this.f23637b + "}";
    }
}
