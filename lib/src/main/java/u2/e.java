package u2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f27608c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f27609a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27610b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27611a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f27612b = 0;

        a() {
        }

        public e a() {
            return new e(this.f27611a, this.f27612b);
        }

        public a b(long j10) {
            this.f27611a = j10;
            return this;
        }

        public a c(long j10) {
            this.f27612b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f27609a = j10;
        this.f27610b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f27609a;
    }

    public long b() {
        return this.f27610b;
    }
}
