package s2;

import java.util.Arrays;
import java.util.Objects;
import s2.f;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f26735a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26736b;

    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f26737a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f26738b;

        b() {
        }

        @Override // s2.f.a
        public f a() {
            String str = "";
            if (this.f26737a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f26737a, this.f26738b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s2.f.a
        public f.a b(Iterable iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f26737a = iterable;
            return this;
        }

        @Override // s2.f.a
        public f.a c(byte[] bArr) {
            this.f26738b = bArr;
            return this;
        }
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f26735a = iterable;
        this.f26736b = bArr;
    }

    @Override // s2.f
    public Iterable b() {
        return this.f26735a;
    }

    @Override // s2.f
    public byte[] c() {
        return this.f26736b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f26735a.equals(fVar.b())) {
            if (Arrays.equals(this.f26736b, fVar instanceof a ? ((a) fVar).f26736b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26735a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26736b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f26735a + ", extras=" + Arrays.toString(this.f26736b) + "}";
    }
}
