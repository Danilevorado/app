package v5;

import e4.o;
import e4.p;
import i4.q;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f27887a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27888b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27889c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27890d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27891e;

    /* renamed from: f, reason: collision with root package name */
    private final String f27892f;

    /* renamed from: g, reason: collision with root package name */
    private final String f27893g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f27894a;

        /* renamed from: b, reason: collision with root package name */
        private String f27895b;

        /* renamed from: c, reason: collision with root package name */
        private String f27896c;

        /* renamed from: d, reason: collision with root package name */
        private String f27897d;

        /* renamed from: e, reason: collision with root package name */
        private String f27898e;

        /* renamed from: f, reason: collision with root package name */
        private String f27899f;

        /* renamed from: g, reason: collision with root package name */
        private String f27900g;

        public j a() {
            return new j(this.f27895b, this.f27894a, this.f27896c, this.f27897d, this.f27898e, this.f27899f, this.f27900g);
        }

        public b b(String str) {
            this.f27894a = p.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f27895b = p.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f27898e = str;
            return this;
        }

        public b e(String str) {
            this.f27900g = str;
            return this;
        }
    }

    private j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.p(!q.a(str), "ApplicationId must be set.");
        this.f27888b = str;
        this.f27887a = str2;
        this.f27889c = str3;
        this.f27890d = str4;
        this.f27891e = str5;
        this.f27892f = str6;
        this.f27893g = str7;
    }

    public String a() {
        return this.f27887a;
    }

    public String b() {
        return this.f27888b;
    }

    public String c() {
        return this.f27891e;
    }

    public String d() {
        return this.f27893g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return o.a(this.f27888b, jVar.f27888b) && o.a(this.f27887a, jVar.f27887a) && o.a(this.f27889c, jVar.f27889c) && o.a(this.f27890d, jVar.f27890d) && o.a(this.f27891e, jVar.f27891e) && o.a(this.f27892f, jVar.f27892f) && o.a(this.f27893g, jVar.f27893g);
    }

    public int hashCode() {
        return o.b(this.f27888b, this.f27887a, this.f27889c, this.f27890d, this.f27891e, this.f27892f, this.f27893g);
    }

    public String toString() {
        return o.c(this).a("applicationId", this.f27888b).a("apiKey", this.f27887a).a("databaseUrl", this.f27889c).a("gcmSenderId", this.f27891e).a("storageBucket", this.f27892f).a("projectId", this.f27893g).toString();
    }
}
