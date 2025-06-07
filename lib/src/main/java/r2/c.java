package r2;

import java.util.Objects;
import r2.n;

/* loaded from: classes.dex */
final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    private final o f26488a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26489b;

    /* renamed from: c, reason: collision with root package name */
    private final p2.c f26490c;

    /* renamed from: d, reason: collision with root package name */
    private final p2.e f26491d;

    /* renamed from: e, reason: collision with root package name */
    private final p2.b f26492e;

    static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private o f26493a;

        /* renamed from: b, reason: collision with root package name */
        private String f26494b;

        /* renamed from: c, reason: collision with root package name */
        private p2.c f26495c;

        /* renamed from: d, reason: collision with root package name */
        private p2.e f26496d;

        /* renamed from: e, reason: collision with root package name */
        private p2.b f26497e;

        b() {
        }

        @Override // r2.n.a
        public n a() {
            String str = "";
            if (this.f26493a == null) {
                str = " transportContext";
            }
            if (this.f26494b == null) {
                str = str + " transportName";
            }
            if (this.f26495c == null) {
                str = str + " event";
            }
            if (this.f26496d == null) {
                str = str + " transformer";
            }
            if (this.f26497e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f26493a, this.f26494b, this.f26495c, this.f26496d, this.f26497e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r2.n.a
        n.a b(p2.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f26497e = bVar;
            return this;
        }

        @Override // r2.n.a
        n.a c(p2.c cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f26495c = cVar;
            return this;
        }

        @Override // r2.n.a
        n.a d(p2.e eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f26496d = eVar;
            return this;
        }

        @Override // r2.n.a
        public n.a e(o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f26493a = oVar;
            return this;
        }

        @Override // r2.n.a
        public n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f26494b = str;
            return this;
        }
    }

    private c(o oVar, String str, p2.c cVar, p2.e eVar, p2.b bVar) {
        this.f26488a = oVar;
        this.f26489b = str;
        this.f26490c = cVar;
        this.f26491d = eVar;
        this.f26492e = bVar;
    }

    @Override // r2.n
    public p2.b b() {
        return this.f26492e;
    }

    @Override // r2.n
    p2.c c() {
        return this.f26490c;
    }

    @Override // r2.n
    p2.e e() {
        return this.f26491d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f26488a.equals(nVar.f()) && this.f26489b.equals(nVar.g()) && this.f26490c.equals(nVar.c()) && this.f26491d.equals(nVar.e()) && this.f26492e.equals(nVar.b());
    }

    @Override // r2.n
    public o f() {
        return this.f26488a;
    }

    @Override // r2.n
    public String g() {
        return this.f26489b;
    }

    public int hashCode() {
        return ((((((((this.f26488a.hashCode() ^ 1000003) * 1000003) ^ this.f26489b.hashCode()) * 1000003) ^ this.f26490c.hashCode()) * 1000003) ^ this.f26491d.hashCode()) * 1000003) ^ this.f26492e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f26488a + ", transportName=" + this.f26489b + ", event=" + this.f26490c + ", transformer=" + this.f26491d + ", encoding=" + this.f26492e + "}";
    }
}
