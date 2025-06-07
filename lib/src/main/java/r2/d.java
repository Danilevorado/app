package r2;

import java.util.Arrays;
import java.util.Objects;
import r2.o;

/* loaded from: classes.dex */
final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String f26498a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f26499b;

    /* renamed from: c, reason: collision with root package name */
    private final p2.d f26500c;

    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private String f26501a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f26502b;

        /* renamed from: c, reason: collision with root package name */
        private p2.d f26503c;

        b() {
        }

        @Override // r2.o.a
        public o a() {
            String str = "";
            if (this.f26501a == null) {
                str = " backendName";
            }
            if (this.f26503c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f26501a, this.f26502b, this.f26503c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r2.o.a
        public o.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f26501a = str;
            return this;
        }

        @Override // r2.o.a
        public o.a c(byte[] bArr) {
            this.f26502b = bArr;
            return this;
        }

        @Override // r2.o.a
        public o.a d(p2.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f26503c = dVar;
            return this;
        }
    }

    private d(String str, byte[] bArr, p2.d dVar) {
        this.f26498a = str;
        this.f26499b = bArr;
        this.f26500c = dVar;
    }

    @Override // r2.o
    public String b() {
        return this.f26498a;
    }

    @Override // r2.o
    public byte[] c() {
        return this.f26499b;
    }

    @Override // r2.o
    public p2.d d() {
        return this.f26500c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f26498a.equals(oVar.b())) {
            if (Arrays.equals(this.f26499b, oVar instanceof d ? ((d) oVar).f26499b : oVar.c()) && this.f26500c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f26498a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26499b)) * 1000003) ^ this.f26500c.hashCode();
    }
}
