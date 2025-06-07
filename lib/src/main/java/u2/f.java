package u2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f27613c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f27614a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27615b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27616a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f27617b = 0;

        a() {
        }

        public f a() {
            return new f(this.f27616a, this.f27617b);
        }

        public a b(long j10) {
            this.f27617b = j10;
            return this;
        }

        public a c(long j10) {
            this.f27616a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f27614a = j10;
        this.f27615b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f27615b;
    }

    public long b() {
        return this.f27614a;
    }
}
