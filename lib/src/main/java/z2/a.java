package z2;

import z2.e;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    private final long f28762b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28763c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28764d;

    /* renamed from: e, reason: collision with root package name */
    private final long f28765e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28766f;

    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f28767a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f28768b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f28769c;

        /* renamed from: d, reason: collision with root package name */
        private Long f28770d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f28771e;

        b() {
        }

        @Override // z2.e.a
        e a() {
            String str = "";
            if (this.f28767a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f28768b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f28769c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f28770d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f28771e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f28767a.longValue(), this.f28768b.intValue(), this.f28769c.intValue(), this.f28770d.longValue(), this.f28771e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z2.e.a
        e.a b(int i10) {
            this.f28769c = Integer.valueOf(i10);
            return this;
        }

        @Override // z2.e.a
        e.a c(long j10) {
            this.f28770d = Long.valueOf(j10);
            return this;
        }

        @Override // z2.e.a
        e.a d(int i10) {
            this.f28768b = Integer.valueOf(i10);
            return this;
        }

        @Override // z2.e.a
        e.a e(int i10) {
            this.f28771e = Integer.valueOf(i10);
            return this;
        }

        @Override // z2.e.a
        e.a f(long j10) {
            this.f28767a = Long.valueOf(j10);
            return this;
        }
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f28762b = j10;
        this.f28763c = i10;
        this.f28764d = i11;
        this.f28765e = j11;
        this.f28766f = i12;
    }

    @Override // z2.e
    int b() {
        return this.f28764d;
    }

    @Override // z2.e
    long c() {
        return this.f28765e;
    }

    @Override // z2.e
    int d() {
        return this.f28763c;
    }

    @Override // z2.e
    int e() {
        return this.f28766f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f28762b == eVar.f() && this.f28763c == eVar.d() && this.f28764d == eVar.b() && this.f28765e == eVar.c() && this.f28766f == eVar.e();
    }

    @Override // z2.e
    long f() {
        return this.f28762b;
    }

    public int hashCode() {
        long j10 = this.f28762b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f28763c) * 1000003) ^ this.f28764d) * 1000003;
        long j11 = this.f28765e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f28766f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f28762b + ", loadBatchSize=" + this.f28763c + ", criticalSectionEnterTimeoutMs=" + this.f28764d + ", eventCleanUpAge=" + this.f28765e + ", maxBlobByteSizePerRow=" + this.f28766f + "}";
    }
}
