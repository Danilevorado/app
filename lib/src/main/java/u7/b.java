package u7;

import eb.c;
import eb.d;
import eb.e;
import eb.f;
import eb.g;
import eb.h;
import eb.j;
import eb.k;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final eb.a f27641a;

    /* renamed from: b, reason: collision with root package name */
    private final c f27642b;

    /* renamed from: c, reason: collision with root package name */
    private final eb.b f27643c;

    /* renamed from: d, reason: collision with root package name */
    private final d f27644d;

    /* renamed from: e, reason: collision with root package name */
    private final e f27645e;

    /* renamed from: f, reason: collision with root package name */
    private final f f27646f;

    /* renamed from: g, reason: collision with root package name */
    private final g f27647g;

    /* renamed from: h, reason: collision with root package name */
    private final h f27648h;

    /* renamed from: i, reason: collision with root package name */
    private final j f27649i;

    /* renamed from: j, reason: collision with root package name */
    private final k f27650j;

    /* renamed from: k, reason: collision with root package name */
    private final q7.b f27651k;

    /* renamed from: l, reason: collision with root package name */
    private int f27652l = 0;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f27653m;

    /* renamed from: n, reason: collision with root package name */
    private String f27654n;

    public b(eb.a aVar, c cVar, eb.b bVar, d dVar, e eVar, f fVar, g gVar, h hVar, j jVar, k kVar, q7.b bVar2) {
        this.f27641a = aVar;
        this.f27642b = cVar;
        this.f27643c = bVar;
        this.f27644d = dVar;
        this.f27645e = eVar;
        this.f27646f = fVar;
        this.f27647g = gVar;
        this.f27648h = hVar;
        this.f27649i = jVar;
        this.f27650j = kVar;
        this.f27651k = bVar2;
    }

    private q7.a a(Class cls) {
        try {
            return (q7.a) cls.newInstance();
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }

    private void c() {
        if (this.f27653m.length == 0) {
            throw new UnsupportedOperationException(String.format("Cannot deserialize empty byte array for %s key! May be your read/write contract isn't mirror-implemented or old disk version is not backward compatible with new class version?", this.f27654n));
        }
    }

    private void d(int i10) {
        int i11 = this.f27652l + i10;
        int length = this.f27653m.length;
        if (i11 > length) {
            throw new ArrayIndexOutOfBoundsException(String.format("Can't read out of bounds array (expected size: %s bytes > disk size: %s bytes) for %s! keyMay be your read/write contract isn't mirror-implemented or old disk version is not backward compatible with new class version?", this.f27654n, Integer.valueOf(i11), Integer.valueOf(length)));
        }
    }

    private q7.a e() {
        q7.a aVarA = a(this.f27651k.a(this.f27654n));
        aVarA.i(this);
        return aVarA;
    }

    private void g() {
        this.f27652l++;
    }

    @Override // u7.a
    public q7.a b(String str, byte[] bArr) {
        this.f27652l = 0;
        this.f27654n = str;
        this.f27653m = bArr;
        c();
        g();
        f();
        return e();
    }

    public int f() {
        int iA = this.f27647g.a();
        d(iA);
        byte b10 = this.f27653m[this.f27652l];
        if (!this.f27647g.d(b10)) {
            throw new ClassCastException(String.format("int cannot be deserialized in '%s' flag type", Byte.valueOf(b10)));
        }
        int iC = this.f27647g.c(this.f27653m, this.f27652l);
        this.f27652l += iA;
        return iC;
    }
}
