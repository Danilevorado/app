package l6;

import l6.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f25115a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25116b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25117c;

    /* renamed from: d, reason: collision with root package name */
    private final f f25118d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f25119e;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25120a;

        /* renamed from: b, reason: collision with root package name */
        private String f25121b;

        /* renamed from: c, reason: collision with root package name */
        private String f25122c;

        /* renamed from: d, reason: collision with root package name */
        private f f25123d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f25124e;

        b() {
        }

        @Override // l6.d.a
        public d a() {
            return new a(this.f25120a, this.f25121b, this.f25122c, this.f25123d, this.f25124e);
        }

        @Override // l6.d.a
        public d.a b(f fVar) {
            this.f25123d = fVar;
            return this;
        }

        @Override // l6.d.a
        public d.a c(String str) {
            this.f25121b = str;
            return this;
        }

        @Override // l6.d.a
        public d.a d(String str) {
            this.f25122c = str;
            return this;
        }

        @Override // l6.d.a
        public d.a e(d.b bVar) {
            this.f25124e = bVar;
            return this;
        }

        @Override // l6.d.a
        public d.a f(String str) {
            this.f25120a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f25115a = str;
        this.f25116b = str2;
        this.f25117c = str3;
        this.f25118d = fVar;
        this.f25119e = bVar;
    }

    @Override // l6.d
    public f b() {
        return this.f25118d;
    }

    @Override // l6.d
    public String c() {
        return this.f25116b;
    }

    @Override // l6.d
    public String d() {
        return this.f25117c;
    }

    @Override // l6.d
    public d.b e() {
        return this.f25119e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f25115a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f25116b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f25117c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f25118d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f25119e;
                        d.b bVarE = dVar.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // l6.d
    public String f() {
        return this.f25115a;
    }

    public int hashCode() {
        String str = this.f25115a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f25116b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f25117c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f25118d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f25119e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f25115a + ", fid=" + this.f25116b + ", refreshToken=" + this.f25117c + ", authToken=" + this.f25118d + ", responseCode=" + this.f25119e + "}";
    }
}
