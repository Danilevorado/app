package q2;

import q2.a;

/* loaded from: classes.dex */
final class c extends q2.a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f26181a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26182b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26183c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26184d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26185e;

    /* renamed from: f, reason: collision with root package name */
    private final String f26186f;

    /* renamed from: g, reason: collision with root package name */
    private final String f26187g;

    /* renamed from: h, reason: collision with root package name */
    private final String f26188h;

    /* renamed from: i, reason: collision with root package name */
    private final String f26189i;

    /* renamed from: j, reason: collision with root package name */
    private final String f26190j;

    /* renamed from: k, reason: collision with root package name */
    private final String f26191k;

    /* renamed from: l, reason: collision with root package name */
    private final String f26192l;

    static final class b extends a.AbstractC0178a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f26193a;

        /* renamed from: b, reason: collision with root package name */
        private String f26194b;

        /* renamed from: c, reason: collision with root package name */
        private String f26195c;

        /* renamed from: d, reason: collision with root package name */
        private String f26196d;

        /* renamed from: e, reason: collision with root package name */
        private String f26197e;

        /* renamed from: f, reason: collision with root package name */
        private String f26198f;

        /* renamed from: g, reason: collision with root package name */
        private String f26199g;

        /* renamed from: h, reason: collision with root package name */
        private String f26200h;

        /* renamed from: i, reason: collision with root package name */
        private String f26201i;

        /* renamed from: j, reason: collision with root package name */
        private String f26202j;

        /* renamed from: k, reason: collision with root package name */
        private String f26203k;

        /* renamed from: l, reason: collision with root package name */
        private String f26204l;

        b() {
        }

        @Override // q2.a.AbstractC0178a
        public q2.a a() {
            return new c(this.f26193a, this.f26194b, this.f26195c, this.f26196d, this.f26197e, this.f26198f, this.f26199g, this.f26200h, this.f26201i, this.f26202j, this.f26203k, this.f26204l);
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a b(String str) {
            this.f26204l = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a c(String str) {
            this.f26202j = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a d(String str) {
            this.f26196d = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a e(String str) {
            this.f26200h = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a f(String str) {
            this.f26195c = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a g(String str) {
            this.f26201i = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a h(String str) {
            this.f26199g = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a i(String str) {
            this.f26203k = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a j(String str) {
            this.f26194b = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a k(String str) {
            this.f26198f = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a l(String str) {
            this.f26197e = str;
            return this;
        }

        @Override // q2.a.AbstractC0178a
        public a.AbstractC0178a m(Integer num) {
            this.f26193a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f26181a = num;
        this.f26182b = str;
        this.f26183c = str2;
        this.f26184d = str3;
        this.f26185e = str4;
        this.f26186f = str5;
        this.f26187g = str6;
        this.f26188h = str7;
        this.f26189i = str8;
        this.f26190j = str9;
        this.f26191k = str10;
        this.f26192l = str11;
    }

    @Override // q2.a
    public String b() {
        return this.f26192l;
    }

    @Override // q2.a
    public String c() {
        return this.f26190j;
    }

    @Override // q2.a
    public String d() {
        return this.f26184d;
    }

    @Override // q2.a
    public String e() {
        return this.f26188h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q2.a)) {
            return false;
        }
        q2.a aVar = (q2.a) obj;
        Integer num = this.f26181a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f26182b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f26183c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f26184d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f26185e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f26186f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f26187g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f26188h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f26189i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f26190j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f26191k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f26192l;
                                                    String strB = aVar.b();
                                                    if (str11 == null) {
                                                        if (strB == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(strB)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // q2.a
    public String f() {
        return this.f26183c;
    }

    @Override // q2.a
    public String g() {
        return this.f26189i;
    }

    @Override // q2.a
    public String h() {
        return this.f26187g;
    }

    public int hashCode() {
        Integer num = this.f26181a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f26182b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f26183c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f26184d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f26185e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f26186f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f26187g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f26188h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f26189i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f26190j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f26191k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f26192l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // q2.a
    public String i() {
        return this.f26191k;
    }

    @Override // q2.a
    public String j() {
        return this.f26182b;
    }

    @Override // q2.a
    public String k() {
        return this.f26186f;
    }

    @Override // q2.a
    public String l() {
        return this.f26185e;
    }

    @Override // q2.a
    public Integer m() {
        return this.f26181a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f26181a + ", model=" + this.f26182b + ", hardware=" + this.f26183c + ", device=" + this.f26184d + ", product=" + this.f26185e + ", osBuild=" + this.f26186f + ", manufacturer=" + this.f26187g + ", fingerprint=" + this.f26188h + ", locale=" + this.f26189i + ", country=" + this.f26190j + ", mccMnc=" + this.f26191k + ", applicationBuild=" + this.f26192l + "}";
    }
}
