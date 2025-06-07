package r6;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f26601a;

    /* renamed from: b, reason: collision with root package name */
    private s6.a f26602b;

    public c(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f26601a = bVar;
    }

    public s6.a a() {
        if (this.f26602b == null) {
            this.f26602b = this.f26601a.a();
        }
        return this.f26602b;
    }

    public String toString() {
        try {
            return a().toString();
        } catch (h unused) {
            return "";
        }
    }
}
