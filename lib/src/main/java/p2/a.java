package p2;

import java.util.Objects;

/* loaded from: classes.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f25908a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25909b;

    /* renamed from: c, reason: collision with root package name */
    private final d f25910c;

    a(Integer num, Object obj, d dVar) {
        this.f25908a = num;
        Objects.requireNonNull(obj, "Null payload");
        this.f25909b = obj;
        Objects.requireNonNull(dVar, "Null priority");
        this.f25910c = dVar;
    }

    @Override // p2.c
    public Integer a() {
        return this.f25908a;
    }

    @Override // p2.c
    public Object b() {
        return this.f25909b;
    }

    @Override // p2.c
    public d c() {
        return this.f25910c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f25908a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f25909b.equals(cVar.b()) && this.f25910c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f25908a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f25909b.hashCode()) * 1000003) ^ this.f25910c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f25908a + ", payload=" + this.f25909b + ", priority=" + this.f25910c + "}";
    }
}
