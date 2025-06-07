package q2;

import java.util.Arrays;
import q2.l;

/* loaded from: classes.dex */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f26210a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f26211b;

    /* renamed from: c, reason: collision with root package name */
    private final long f26212c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f26213d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26214e;

    /* renamed from: f, reason: collision with root package name */
    private final long f26215f;

    /* renamed from: g, reason: collision with root package name */
    private final o f26216g;

    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f26217a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f26218b;

        /* renamed from: c, reason: collision with root package name */
        private Long f26219c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f26220d;

        /* renamed from: e, reason: collision with root package name */
        private String f26221e;

        /* renamed from: f, reason: collision with root package name */
        private Long f26222f;

        /* renamed from: g, reason: collision with root package name */
        private o f26223g;

        b() {
        }

        @Override // q2.l.a
        public l a() {
            String str = "";
            if (this.f26217a == null) {
                str = " eventTimeMs";
            }
            if (this.f26219c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f26222f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f26217a.longValue(), this.f26218b, this.f26219c.longValue(), this.f26220d, this.f26221e, this.f26222f.longValue(), this.f26223g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q2.l.a
        public l.a b(Integer num) {
            this.f26218b = num;
            return this;
        }

        @Override // q2.l.a
        public l.a c(long j10) {
            this.f26217a = Long.valueOf(j10);
            return this;
        }

        @Override // q2.l.a
        public l.a d(long j10) {
            this.f26219c = Long.valueOf(j10);
            return this;
        }

        @Override // q2.l.a
        public l.a e(o oVar) {
            this.f26223g = oVar;
            return this;
        }

        @Override // q2.l.a
        l.a f(byte[] bArr) {
            this.f26220d = bArr;
            return this;
        }

        @Override // q2.l.a
        l.a g(String str) {
            this.f26221e = str;
            return this;
        }

        @Override // q2.l.a
        public l.a h(long j10) {
            this.f26222f = Long.valueOf(j10);
            return this;
        }
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f26210a = j10;
        this.f26211b = num;
        this.f26212c = j11;
        this.f26213d = bArr;
        this.f26214e = str;
        this.f26215f = j12;
        this.f26216g = oVar;
    }

    @Override // q2.l
    public Integer b() {
        return this.f26211b;
    }

    @Override // q2.l
    public long c() {
        return this.f26210a;
    }

    @Override // q2.l
    public long d() {
        return this.f26212c;
    }

    @Override // q2.l
    public o e() {
        return this.f26216g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f26210a == lVar.c() && ((num = this.f26211b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f26212c == lVar.d()) {
            if (Arrays.equals(this.f26213d, lVar instanceof f ? ((f) lVar).f26213d : lVar.f()) && ((str = this.f26214e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f26215f == lVar.h()) {
                o oVar = this.f26216g;
                o oVarE = lVar.e();
                if (oVar == null) {
                    if (oVarE == null) {
                        return true;
                    }
                } else if (oVar.equals(oVarE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q2.l
    public byte[] f() {
        return this.f26213d;
    }

    @Override // q2.l
    public String g() {
        return this.f26214e;
    }

    @Override // q2.l
    public long h() {
        return this.f26215f;
    }

    public int hashCode() {
        long j10 = this.f26210a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f26211b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f26212c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f26213d)) * 1000003;
        String str = this.f26214e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f26215f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f26216g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f26210a + ", eventCode=" + this.f26211b + ", eventUptimeMs=" + this.f26212c + ", sourceExtension=" + Arrays.toString(this.f26213d) + ", sourceExtensionJsonProto3=" + this.f26214e + ", timezoneOffsetSeconds=" + this.f26215f + ", networkConnectionInfo=" + this.f26216g + "}";
    }
}
