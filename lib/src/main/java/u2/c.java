package u2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f27589c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f27590a;

    /* renamed from: b, reason: collision with root package name */
    private final b f27591b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27592a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f27593b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f27592a, this.f27593b);
        }

        public a b(long j10) {
            this.f27592a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f27593b = bVar;
            return this;
        }
    }

    public enum b implements d6.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: m, reason: collision with root package name */
        private final int f27602m;

        b(int i10) {
            this.f27602m = i10;
        }

        @Override // d6.c
        public int b() {
            return this.f27602m;
        }
    }

    c(long j10, b bVar) {
        this.f27590a = j10;
        this.f27591b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f27590a;
    }

    public b b() {
        return this.f27591b;
    }
}
