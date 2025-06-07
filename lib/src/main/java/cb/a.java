package cb;

import eb.b;
import eb.c;
import eb.d;
import eb.e;
import eb.f;
import eb.g;
import eb.h;
import eb.i;
import eb.j;
import eb.k;
import eb.l;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final eb.a f5107a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5108b;

    /* renamed from: c, reason: collision with root package name */
    private final b f5109c;

    /* renamed from: d, reason: collision with root package name */
    private final d f5110d;

    /* renamed from: e, reason: collision with root package name */
    private final e f5111e;

    /* renamed from: f, reason: collision with root package name */
    private final f f5112f;

    /* renamed from: g, reason: collision with root package name */
    private final g f5113g;

    /* renamed from: h, reason: collision with root package name */
    private final h f5114h;

    /* renamed from: i, reason: collision with root package name */
    private final j f5115i;

    /* renamed from: j, reason: collision with root package name */
    private final k f5116j;

    /* renamed from: k, reason: collision with root package name */
    private final l f5117k;

    /* renamed from: l, reason: collision with root package name */
    private final i f5118l;

    public a(q7.b bVar) {
        eb.a aVar = new eb.a();
        this.f5107a = aVar;
        c cVar = new c();
        this.f5108b = cVar;
        d dVar = new d();
        this.f5110d = dVar;
        e eVar = new e();
        this.f5111e = eVar;
        f fVar = new f();
        this.f5112f = fVar;
        g gVar = new g();
        this.f5113g = gVar;
        h hVar = new h();
        this.f5114h = hVar;
        j jVar = new j();
        this.f5115i = jVar;
        k kVar = new k();
        this.f5116j = kVar;
        this.f5117k = new l();
        b bVar2 = new b();
        this.f5109c = bVar2;
        this.f5118l = new i(aVar, cVar, bVar2, dVar, eVar, fVar, gVar, hVar, jVar, kVar, bVar);
    }

    public eb.a a() {
        return this.f5107a;
    }

    public Object b(Object obj) {
        return obj instanceof Set ? new HashSet((Set) obj) : obj;
    }

    public Object c(String str, byte[] bArr) {
        if (bArr.length == 0) {
            throw new ja.d(String.format("%s key's value is zero bytes for deserialize", str));
        }
        byte b10 = bArr[0];
        if (this.f5107a.a(b10)) {
            return Boolean.valueOf(this.f5107a.b(bArr));
        }
        if (this.f5113g.d(b10)) {
            return Integer.valueOf(this.f5113g.b(bArr));
        }
        if (this.f5114h.c(b10)) {
            return Long.valueOf(this.f5114h.a(bArr));
        }
        if (this.f5111e.c(b10)) {
            return Double.valueOf(this.f5111e.a(bArr));
        }
        if (this.f5112f.c(b10)) {
            return Float.valueOf(this.f5112f.a(bArr));
        }
        if (this.f5116j.c(b10)) {
            return this.f5116j.a(bArr);
        }
        if (this.f5117k.b(b10)) {
            return this.f5117k.a(bArr);
        }
        if (this.f5118l.b(b10)) {
            return this.f5118l.a(str, bArr);
        }
        if (this.f5115i.c(b10)) {
            return Short.valueOf(this.f5115i.a(bArr));
        }
        if (this.f5108b.c(b10)) {
            return Byte.valueOf(this.f5108b.a(bArr));
        }
        if (this.f5109c.a(b10)) {
            return this.f5109c.b(bArr);
        }
        if (this.f5110d.c(b10)) {
            return Character.valueOf(this.f5110d.a(bArr));
        }
        throw new UnsupportedClassVersionError(String.format("Flag verification failed. Incorrect flag '%s'", Byte.valueOf(b10)));
    }

    public f d() {
        return this.f5112f;
    }

    public g e() {
        return this.f5113g;
    }

    public h f() {
        return this.f5114h;
    }

    public k g() {
        return this.f5116j;
    }

    public l h() {
        return this.f5117k;
    }
}
