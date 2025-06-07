package l6;

import l6.f;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f25125a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25126b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f25127c;

    /* renamed from: l6.b$b, reason: collision with other inner class name */
    static final class C0160b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25128a;

        /* renamed from: b, reason: collision with root package name */
        private Long f25129b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f25130c;

        C0160b() {
        }

        @Override // l6.f.a
        public f a() {
            String str = "";
            if (this.f25129b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f25128a, this.f25129b.longValue(), this.f25130c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // l6.f.a
        public f.a b(f.b bVar) {
            this.f25130c = bVar;
            return this;
        }

        @Override // l6.f.a
        public f.a c(String str) {
            this.f25128a = str;
            return this;
        }

        @Override // l6.f.a
        public f.a d(long j10) {
            this.f25129b = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, long j10, f.b bVar) {
        this.f25125a = str;
        this.f25126b = j10;
        this.f25127c = bVar;
    }

    @Override // l6.f
    public f.b b() {
        return this.f25127c;
    }

    @Override // l6.f
    public String c() {
        return this.f25125a;
    }

    @Override // l6.f
    public long d() {
        return this.f25126b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f25125a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f25126b == fVar.d()) {
                f.b bVar = this.f25127c;
                f.b bVarB = fVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f25125a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f25126b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f25127c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f25125a + ", tokenExpirationTimestamp=" + this.f25126b + ", responseCode=" + this.f25127c + "}";
    }
}
