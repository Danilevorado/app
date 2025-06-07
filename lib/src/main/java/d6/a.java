package d6;

import d6.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f22947a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f22948b = d.a.DEFAULT;

    /* renamed from: d6.a$a, reason: collision with other inner class name */
    private static final class C0118a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f22949a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f22950b;

        C0118a(int i10, d.a aVar) {
            this.f22949a = i10;
            this.f22950b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22949a == dVar.tag() && this.f22950b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f22949a ^ 14552422) + (this.f22950b.hashCode() ^ 2041407134);
        }

        @Override // d6.d
        public d.a intEncoding() {
            return this.f22950b;
        }

        @Override // d6.d
        public int tag() {
            return this.f22949a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f22949a + "intEncoding=" + this.f22950b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0118a(this.f22947a, this.f22948b);
    }

    public a c(int i10) {
        this.f22947a = i10;
        return this;
    }
}
