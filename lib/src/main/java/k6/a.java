package k6;

import java.util.Objects;
import k6.c;
import k6.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f24827b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f24828c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24829d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24830e;

    /* renamed from: f, reason: collision with root package name */
    private final long f24831f;

    /* renamed from: g, reason: collision with root package name */
    private final long f24832g;

    /* renamed from: h, reason: collision with root package name */
    private final String f24833h;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f24834a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f24835b;

        /* renamed from: c, reason: collision with root package name */
        private String f24836c;

        /* renamed from: d, reason: collision with root package name */
        private String f24837d;

        /* renamed from: e, reason: collision with root package name */
        private Long f24838e;

        /* renamed from: f, reason: collision with root package name */
        private Long f24839f;

        /* renamed from: g, reason: collision with root package name */
        private String f24840g;

        b() {
        }

        private b(d dVar) {
            this.f24834a = dVar.d();
            this.f24835b = dVar.g();
            this.f24836c = dVar.b();
            this.f24837d = dVar.f();
            this.f24838e = Long.valueOf(dVar.c());
            this.f24839f = Long.valueOf(dVar.h());
            this.f24840g = dVar.e();
        }

        @Override // k6.d.a
        public d a() {
            String str = "";
            if (this.f24835b == null) {
                str = " registrationStatus";
            }
            if (this.f24838e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f24839f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f24834a, this.f24835b, this.f24836c, this.f24837d, this.f24838e.longValue(), this.f24839f.longValue(), this.f24840g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // k6.d.a
        public d.a b(String str) {
            this.f24836c = str;
            return this;
        }

        @Override // k6.d.a
        public d.a c(long j10) {
            this.f24838e = Long.valueOf(j10);
            return this;
        }

        @Override // k6.d.a
        public d.a d(String str) {
            this.f24834a = str;
            return this;
        }

        @Override // k6.d.a
        public d.a e(String str) {
            this.f24840g = str;
            return this;
        }

        @Override // k6.d.a
        public d.a f(String str) {
            this.f24837d = str;
            return this;
        }

        @Override // k6.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f24835b = aVar;
            return this;
        }

        @Override // k6.d.a
        public d.a h(long j10) {
            this.f24839f = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f24827b = str;
        this.f24828c = aVar;
        this.f24829d = str2;
        this.f24830e = str3;
        this.f24831f = j10;
        this.f24832g = j11;
        this.f24833h = str4;
    }

    @Override // k6.d
    public String b() {
        return this.f24829d;
    }

    @Override // k6.d
    public long c() {
        return this.f24831f;
    }

    @Override // k6.d
    public String d() {
        return this.f24827b;
    }

    @Override // k6.d
    public String e() {
        return this.f24833h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f24827b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f24828c.equals(dVar.g()) && ((str = this.f24829d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f24830e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f24831f == dVar.c() && this.f24832g == dVar.h()) {
                String str4 = this.f24833h;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k6.d
    public String f() {
        return this.f24830e;
    }

    @Override // k6.d
    public c.a g() {
        return this.f24828c;
    }

    @Override // k6.d
    public long h() {
        return this.f24832g;
    }

    public int hashCode() {
        String str = this.f24827b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f24828c.hashCode()) * 1000003;
        String str2 = this.f24829d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24830e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f24831f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f24832g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f24833h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // k6.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f24827b + ", registrationStatus=" + this.f24828c + ", authToken=" + this.f24829d + ", refreshToken=" + this.f24830e + ", expiresInSecs=" + this.f24831f + ", tokenCreationEpochInSecs=" + this.f24832g + ", fisError=" + this.f24833h + "}";
    }
}
