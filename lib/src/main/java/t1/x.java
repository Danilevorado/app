package t1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class x implements r1.f {

    /* renamed from: j, reason: collision with root package name */
    private static final n2.h f27311j = new n2.h(50);

    /* renamed from: b, reason: collision with root package name */
    private final u1.b f27312b;

    /* renamed from: c, reason: collision with root package name */
    private final r1.f f27313c;

    /* renamed from: d, reason: collision with root package name */
    private final r1.f f27314d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27315e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27316f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f27317g;

    /* renamed from: h, reason: collision with root package name */
    private final r1.h f27318h;

    /* renamed from: i, reason: collision with root package name */
    private final r1.l f27319i;

    x(u1.b bVar, r1.f fVar, r1.f fVar2, int i10, int i11, r1.l lVar, Class cls, r1.h hVar) {
        this.f27312b = bVar;
        this.f27313c = fVar;
        this.f27314d = fVar2;
        this.f27315e = i10;
        this.f27316f = i11;
        this.f27319i = lVar;
        this.f27317g = cls;
        this.f27318h = hVar;
    }

    private byte[] c() {
        n2.h hVar = f27311j;
        byte[] bArr = (byte[]) hVar.g(this.f27317g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f27317g.getName().getBytes(r1.f.f26444a);
        hVar.k(this.f27317g, bytes);
        return bytes;
    }

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f27312b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f27315e).putInt(this.f27316f).array();
        this.f27314d.b(messageDigest);
        this.f27313c.b(messageDigest);
        messageDigest.update(bArr);
        r1.l lVar = this.f27319i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f27318h.b(messageDigest);
        messageDigest.update(c());
        this.f27312b.d(bArr);
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f27316f == xVar.f27316f && this.f27315e == xVar.f27315e && n2.l.c(this.f27319i, xVar.f27319i) && this.f27317g.equals(xVar.f27317g) && this.f27313c.equals(xVar.f27313c) && this.f27314d.equals(xVar.f27314d) && this.f27318h.equals(xVar.f27318h);
    }

    @Override // r1.f
    public int hashCode() {
        int iHashCode = (((((this.f27313c.hashCode() * 31) + this.f27314d.hashCode()) * 31) + this.f27315e) * 31) + this.f27316f;
        r1.l lVar = this.f27319i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return (((iHashCode * 31) + this.f27317g.hashCode()) * 31) + this.f27318h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f27313c + ", signature=" + this.f27314d + ", width=" + this.f27315e + ", height=" + this.f27316f + ", decodedResourceClass=" + this.f27317g + ", transformation='" + this.f27319i + "', options=" + this.f27318h + '}';
    }
}
