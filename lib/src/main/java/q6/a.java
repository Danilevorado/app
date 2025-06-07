package q6;

import java.util.Objects;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f26306a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26307b;

    a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f26306a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f26307b = str2;
    }

    @Override // q6.f
    public String b() {
        return this.f26306a;
    }

    @Override // q6.f
    public String c() {
        return this.f26307b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f26306a.equals(fVar.b()) && this.f26307b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f26306a.hashCode() ^ 1000003) * 1000003) ^ this.f26307b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f26306a + ", version=" + this.f26307b + "}";
    }
}
