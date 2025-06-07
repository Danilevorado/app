package q2;

import java.util.List;
import q2.m;

/* loaded from: classes.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f26224a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26225b;

    /* renamed from: c, reason: collision with root package name */
    private final k f26226c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f26227d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26228e;

    /* renamed from: f, reason: collision with root package name */
    private final List f26229f;

    /* renamed from: g, reason: collision with root package name */
    private final p f26230g;

    static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f26231a;

        /* renamed from: b, reason: collision with root package name */
        private Long f26232b;

        /* renamed from: c, reason: collision with root package name */
        private k f26233c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f26234d;

        /* renamed from: e, reason: collision with root package name */
        private String f26235e;

        /* renamed from: f, reason: collision with root package name */
        private List f26236f;

        /* renamed from: g, reason: collision with root package name */
        private p f26237g;

        b() {
        }

        @Override // q2.m.a
        public m a() {
            String str = "";
            if (this.f26231a == null) {
                str = " requestTimeMs";
            }
            if (this.f26232b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f26231a.longValue(), this.f26232b.longValue(), this.f26233c, this.f26234d, this.f26235e, this.f26236f, this.f26237g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q2.m.a
        public m.a b(k kVar) {
            this.f26233c = kVar;
            return this;
        }

        @Override // q2.m.a
        public m.a c(List list) {
            this.f26236f = list;
            return this;
        }

        @Override // q2.m.a
        m.a d(Integer num) {
            this.f26234d = num;
            return this;
        }

        @Override // q2.m.a
        m.a e(String str) {
            this.f26235e = str;
            return this;
        }

        @Override // q2.m.a
        public m.a f(p pVar) {
            this.f26237g = pVar;
            return this;
        }

        @Override // q2.m.a
        public m.a g(long j10) {
            this.f26231a = Long.valueOf(j10);
            return this;
        }

        @Override // q2.m.a
        public m.a h(long j10) {
            this.f26232b = Long.valueOf(j10);
            return this;
        }
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f26224a = j10;
        this.f26225b = j11;
        this.f26226c = kVar;
        this.f26227d = num;
        this.f26228e = str;
        this.f26229f = list;
        this.f26230g = pVar;
    }

    @Override // q2.m
    public k b() {
        return this.f26226c;
    }

    @Override // q2.m
    public List c() {
        return this.f26229f;
    }

    @Override // q2.m
    public Integer d() {
        return this.f26227d;
    }

    @Override // q2.m
    public String e() {
        return this.f26228e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f26224a == mVar.g() && this.f26225b == mVar.h() && ((kVar = this.f26226c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f26227d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f26228e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f26229f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f26230g;
            p pVarF = mVar.f();
            if (pVar == null) {
                if (pVarF == null) {
                    return true;
                }
            } else if (pVar.equals(pVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // q2.m
    public p f() {
        return this.f26230g;
    }

    @Override // q2.m
    public long g() {
        return this.f26224a;
    }

    @Override // q2.m
    public long h() {
        return this.f26225b;
    }

    public int hashCode() {
        long j10 = this.f26224a;
        long j11 = this.f26225b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f26226c;
        int iHashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f26227d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f26228e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f26229f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f26230g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f26224a + ", requestUptimeMs=" + this.f26225b + ", clientInfo=" + this.f26226c + ", logSource=" + this.f26227d + ", logSourceName=" + this.f26228e + ", logEvents=" + this.f26229f + ", qosTier=" + this.f26230g + "}";
    }
}
