package g1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f23704a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f23705b;

    public d(String str, Long l10) {
        rb.h.e(str, "key");
        this.f23704a = str;
        this.f23705b = l10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10) {
        this(str, Long.valueOf(z10 ? 1L : 0L));
        rb.h.e(str, "key");
    }

    public final String a() {
        return this.f23704a;
    }

    public final Long b() {
        return this.f23705b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return rb.h.a(this.f23704a, dVar.f23704a) && rb.h.a(this.f23705b, dVar.f23705b);
    }

    public int hashCode() {
        int iHashCode = this.f23704a.hashCode() * 31;
        Long l10 = this.f23705b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f23704a + ", value=" + this.f23705b + ')';
    }
}
