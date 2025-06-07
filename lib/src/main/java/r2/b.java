package r2;

import java.util.Map;
import java.util.Objects;
import r2.i;

/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f26476a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f26477b;

    /* renamed from: c, reason: collision with root package name */
    private final h f26478c;

    /* renamed from: d, reason: collision with root package name */
    private final long f26479d;

    /* renamed from: e, reason: collision with root package name */
    private final long f26480e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f26481f;

    /* renamed from: r2.b$b, reason: collision with other inner class name */
    static final class C0182b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f26482a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f26483b;

        /* renamed from: c, reason: collision with root package name */
        private h f26484c;

        /* renamed from: d, reason: collision with root package name */
        private Long f26485d;

        /* renamed from: e, reason: collision with root package name */
        private Long f26486e;

        /* renamed from: f, reason: collision with root package name */
        private Map f26487f;

        C0182b() {
        }

        @Override // r2.i.a
        public i d() {
            String str = "";
            if (this.f26482a == null) {
                str = " transportName";
            }
            if (this.f26484c == null) {
                str = str + " encodedPayload";
            }
            if (this.f26485d == null) {
                str = str + " eventMillis";
            }
            if (this.f26486e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f26487f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f26482a, this.f26483b, this.f26484c, this.f26485d.longValue(), this.f26486e.longValue(), this.f26487f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r2.i.a
        protected Map e() {
            Map map = this.f26487f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // r2.i.a
        protected i.a f(Map map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f26487f = map;
            return this;
        }

        @Override // r2.i.a
        public i.a g(Integer num) {
            this.f26483b = num;
            return this;
        }

        @Override // r2.i.a
        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f26484c = hVar;
            return this;
        }

        @Override // r2.i.a
        public i.a i(long j10) {
            this.f26485d = Long.valueOf(j10);
            return this;
        }

        @Override // r2.i.a
        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f26482a = str;
            return this;
        }

        @Override // r2.i.a
        public i.a k(long j10) {
            this.f26486e = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f26476a = str;
        this.f26477b = num;
        this.f26478c = hVar;
        this.f26479d = j10;
        this.f26480e = j11;
        this.f26481f = map;
    }

    @Override // r2.i
    protected Map c() {
        return this.f26481f;
    }

    @Override // r2.i
    public Integer d() {
        return this.f26477b;
    }

    @Override // r2.i
    public h e() {
        return this.f26478c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f26476a.equals(iVar.j()) && ((num = this.f26477b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f26478c.equals(iVar.e()) && this.f26479d == iVar.f() && this.f26480e == iVar.k() && this.f26481f.equals(iVar.c());
    }

    @Override // r2.i
    public long f() {
        return this.f26479d;
    }

    public int hashCode() {
        int iHashCode = (this.f26476a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f26477b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f26478c.hashCode()) * 1000003;
        long j10 = this.f26479d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f26480e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f26481f.hashCode();
    }

    @Override // r2.i
    public String j() {
        return this.f26476a;
    }

    @Override // r2.i
    public long k() {
        return this.f26480e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f26476a + ", code=" + this.f26477b + ", encodedPayload=" + this.f26478c + ", eventMillis=" + this.f26479d + ", uptimeMillis=" + this.f26480e + ", autoMetadata=" + this.f26481f + "}";
    }
}
