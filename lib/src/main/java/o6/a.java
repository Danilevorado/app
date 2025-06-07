package o6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f25759p = new C0170a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f25760a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25761b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25762c;

    /* renamed from: d, reason: collision with root package name */
    private final c f25763d;

    /* renamed from: e, reason: collision with root package name */
    private final d f25764e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25765f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25766g;

    /* renamed from: h, reason: collision with root package name */
    private final int f25767h;

    /* renamed from: i, reason: collision with root package name */
    private final int f25768i;

    /* renamed from: j, reason: collision with root package name */
    private final String f25769j;

    /* renamed from: k, reason: collision with root package name */
    private final long f25770k;

    /* renamed from: l, reason: collision with root package name */
    private final b f25771l;

    /* renamed from: m, reason: collision with root package name */
    private final String f25772m;

    /* renamed from: n, reason: collision with root package name */
    private final long f25773n;

    /* renamed from: o, reason: collision with root package name */
    private final String f25774o;

    /* renamed from: o6.a$a, reason: collision with other inner class name */
    public static final class C0170a {

        /* renamed from: a, reason: collision with root package name */
        private long f25775a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f25776b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f25777c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f25778d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f25779e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f25780f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f25781g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f25782h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f25783i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f25784j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f25785k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f25786l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f25787m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f25788n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f25789o = "";

        C0170a() {
        }

        public a a() {
            return new a(this.f25775a, this.f25776b, this.f25777c, this.f25778d, this.f25779e, this.f25780f, this.f25781g, this.f25782h, this.f25783i, this.f25784j, this.f25785k, this.f25786l, this.f25787m, this.f25788n, this.f25789o);
        }

        public C0170a b(String str) {
            this.f25787m = str;
            return this;
        }

        public C0170a c(String str) {
            this.f25781g = str;
            return this;
        }

        public C0170a d(String str) {
            this.f25789o = str;
            return this;
        }

        public C0170a e(b bVar) {
            this.f25786l = bVar;
            return this;
        }

        public C0170a f(String str) {
            this.f25777c = str;
            return this;
        }

        public C0170a g(String str) {
            this.f25776b = str;
            return this;
        }

        public C0170a h(c cVar) {
            this.f25778d = cVar;
            return this;
        }

        public C0170a i(String str) {
            this.f25780f = str;
            return this;
        }

        public C0170a j(long j10) {
            this.f25775a = j10;
            return this;
        }

        public C0170a k(d dVar) {
            this.f25779e = dVar;
            return this;
        }

        public C0170a l(String str) {
            this.f25784j = str;
            return this;
        }

        public C0170a m(int i10) {
            this.f25783i = i10;
            return this;
        }
    }

    public enum b implements d6.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: m, reason: collision with root package name */
        private final int f25794m;

        b(int i10) {
            this.f25794m = i10;
        }

        @Override // d6.c
        public int b() {
            return this.f25794m;
        }
    }

    public enum c implements d6.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: m, reason: collision with root package name */
        private final int f25800m;

        c(int i10) {
            this.f25800m = i10;
        }

        @Override // d6.c
        public int b() {
            return this.f25800m;
        }
    }

    public enum d implements d6.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: m, reason: collision with root package name */
        private final int f25806m;

        d(int i10) {
            this.f25806m = i10;
        }

        @Override // d6.c
        public int b() {
            return this.f25806m;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f25760a = j10;
        this.f25761b = str;
        this.f25762c = str2;
        this.f25763d = cVar;
        this.f25764e = dVar;
        this.f25765f = str3;
        this.f25766g = str4;
        this.f25767h = i10;
        this.f25768i = i11;
        this.f25769j = str5;
        this.f25770k = j11;
        this.f25771l = bVar;
        this.f25772m = str6;
        this.f25773n = j12;
        this.f25774o = str7;
    }

    public static C0170a p() {
        return new C0170a();
    }

    public String a() {
        return this.f25772m;
    }

    public long b() {
        return this.f25770k;
    }

    public long c() {
        return this.f25773n;
    }

    public String d() {
        return this.f25766g;
    }

    public String e() {
        return this.f25774o;
    }

    public b f() {
        return this.f25771l;
    }

    public String g() {
        return this.f25762c;
    }

    public String h() {
        return this.f25761b;
    }

    public c i() {
        return this.f25763d;
    }

    public String j() {
        return this.f25765f;
    }

    public int k() {
        return this.f25767h;
    }

    public long l() {
        return this.f25760a;
    }

    public d m() {
        return this.f25764e;
    }

    public String n() {
        return this.f25769j;
    }

    public int o() {
        return this.f25768i;
    }
}
