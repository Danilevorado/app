package t1;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class n implements r1.f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f27265b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27266c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27267d;

    /* renamed from: e, reason: collision with root package name */
    private final Class f27268e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f27269f;

    /* renamed from: g, reason: collision with root package name */
    private final r1.f f27270g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f27271h;

    /* renamed from: i, reason: collision with root package name */
    private final r1.h f27272i;

    /* renamed from: j, reason: collision with root package name */
    private int f27273j;

    n(Object obj, r1.f fVar, int i10, int i11, Map map, Class cls, Class cls2, r1.h hVar) {
        this.f27265b = n2.k.d(obj);
        this.f27270g = (r1.f) n2.k.e(fVar, "Signature must not be null");
        this.f27266c = i10;
        this.f27267d = i11;
        this.f27271h = (Map) n2.k.d(map);
        this.f27268e = (Class) n2.k.e(cls, "Resource class must not be null");
        this.f27269f = (Class) n2.k.e(cls2, "Transcode class must not be null");
        this.f27272i = (r1.h) n2.k.d(hVar);
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f27265b.equals(nVar.f27265b) && this.f27270g.equals(nVar.f27270g) && this.f27267d == nVar.f27267d && this.f27266c == nVar.f27266c && this.f27271h.equals(nVar.f27271h) && this.f27268e.equals(nVar.f27268e) && this.f27269f.equals(nVar.f27269f) && this.f27272i.equals(nVar.f27272i);
    }

    @Override // r1.f
    public int hashCode() {
        if (this.f27273j == 0) {
            int iHashCode = this.f27265b.hashCode();
            this.f27273j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f27270g.hashCode()) * 31) + this.f27266c) * 31) + this.f27267d;
            this.f27273j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f27271h.hashCode();
            this.f27273j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f27268e.hashCode();
            this.f27273j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f27269f.hashCode();
            this.f27273j = iHashCode5;
            this.f27273j = (iHashCode5 * 31) + this.f27272i.hashCode();
        }
        return this.f27273j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f27265b + ", width=" + this.f27266c + ", height=" + this.f27267d + ", resourceClass=" + this.f27268e + ", transcodeClass=" + this.f27269f + ", signature=" + this.f27270g + ", hashCode=" + this.f27273j + ", transformations=" + this.f27271h + ", options=" + this.f27272i + '}';
    }
}
