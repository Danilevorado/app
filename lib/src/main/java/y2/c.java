package y2;

import java.util.Objects;
import java.util.Set;
import y2.f;

/* loaded from: classes.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f28462a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28463b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f28464c;

    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f28465a;

        /* renamed from: b, reason: collision with root package name */
        private Long f28466b;

        /* renamed from: c, reason: collision with root package name */
        private Set f28467c;

        b() {
        }

        @Override // y2.f.b.a
        public f.b a() {
            String str = "";
            if (this.f28465a == null) {
                str = " delta";
            }
            if (this.f28466b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f28467c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f28465a.longValue(), this.f28466b.longValue(), this.f28467c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y2.f.b.a
        public f.b.a b(long j10) {
            this.f28465a = Long.valueOf(j10);
            return this;
        }

        @Override // y2.f.b.a
        public f.b.a c(Set set) {
            Objects.requireNonNull(set, "Null flags");
            this.f28467c = set;
            return this;
        }

        @Override // y2.f.b.a
        public f.b.a d(long j10) {
            this.f28466b = Long.valueOf(j10);
            return this;
        }
    }

    private c(long j10, long j11, Set set) {
        this.f28462a = j10;
        this.f28463b = j11;
        this.f28464c = set;
    }

    @Override // y2.f.b
    long b() {
        return this.f28462a;
    }

    @Override // y2.f.b
    Set c() {
        return this.f28464c;
    }

    @Override // y2.f.b
    long d() {
        return this.f28463b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f28462a == bVar.b() && this.f28463b == bVar.d() && this.f28464c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f28462a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f28463b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f28464c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f28462a + ", maxAllowedDelay=" + this.f28463b + ", flags=" + this.f28464c + "}";
    }
}
