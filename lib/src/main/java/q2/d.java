package q2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final List f26205a;

    d(List list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f26205a = list;
    }

    @Override // q2.j
    public List c() {
        return this.f26205a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f26205a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f26205a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f26205a + "}";
    }
}
