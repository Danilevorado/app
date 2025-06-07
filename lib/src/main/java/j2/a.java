package j2;

import a2.l;
import a2.o;
import a2.q;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import n2.k;
import t1.j;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {
    private Drawable A;
    private int B;
    private boolean F;
    private Resources.Theme G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean L;

    /* renamed from: m, reason: collision with root package name */
    private int f24383m;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f24387q;

    /* renamed from: r, reason: collision with root package name */
    private int f24388r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f24389s;

    /* renamed from: t, reason: collision with root package name */
    private int f24390t;

    /* renamed from: y, reason: collision with root package name */
    private boolean f24395y;

    /* renamed from: n, reason: collision with root package name */
    private float f24384n = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    private j f24385o = j.f27217e;

    /* renamed from: p, reason: collision with root package name */
    private com.bumptech.glide.g f24386p = com.bumptech.glide.g.NORMAL;

    /* renamed from: u, reason: collision with root package name */
    private boolean f24391u = true;

    /* renamed from: v, reason: collision with root package name */
    private int f24392v = -1;

    /* renamed from: w, reason: collision with root package name */
    private int f24393w = -1;

    /* renamed from: x, reason: collision with root package name */
    private r1.f f24394x = m2.a.c();

    /* renamed from: z, reason: collision with root package name */
    private boolean f24396z = true;
    private r1.h C = new r1.h();
    private Map D = new n2.b();
    private Class E = Object.class;
    private boolean K = true;

    private boolean K(int i10) {
        return L(this.f24383m, i10);
    }

    private static boolean L(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a U(l lVar, r1.l lVar2) {
        return a0(lVar, lVar2, false);
    }

    private a a0(l lVar, r1.l lVar2, boolean z10) {
        a aVarH0 = z10 ? h0(lVar, lVar2) : V(lVar, lVar2);
        aVarH0.K = true;
        return aVarH0;
    }

    private a b0() {
        return this;
    }

    public final r1.f A() {
        return this.f24394x;
    }

    public final float B() {
        return this.f24384n;
    }

    public final Resources.Theme C() {
        return this.G;
    }

    public final Map D() {
        return this.D;
    }

    public final boolean E() {
        return this.L;
    }

    public final boolean F() {
        return this.I;
    }

    protected final boolean G() {
        return this.H;
    }

    public final boolean H() {
        return this.f24391u;
    }

    public final boolean I() {
        return K(8);
    }

    boolean J() {
        return this.K;
    }

    public final boolean M() {
        return this.f24396z;
    }

    public final boolean N() {
        return this.f24395y;
    }

    public final boolean O() {
        return K(2048);
    }

    public final boolean P() {
        return n2.l.s(this.f24393w, this.f24392v);
    }

    public a Q() {
        this.F = true;
        return b0();
    }

    public a R() {
        return V(l.f36e, new a2.i());
    }

    public a S() {
        return U(l.f35d, new a2.j());
    }

    public a T() {
        return U(l.f34c, new q());
    }

    final a V(l lVar, r1.l lVar2) {
        if (this.H) {
            return clone().V(lVar, lVar2);
        }
        g(lVar);
        return k0(lVar2, false);
    }

    public a W(int i10) {
        return X(i10, i10);
    }

    public a X(int i10, int i11) {
        if (this.H) {
            return clone().X(i10, i11);
        }
        this.f24393w = i10;
        this.f24392v = i11;
        this.f24383m |= 512;
        return c0();
    }

    public a Y(int i10) {
        if (this.H) {
            return clone().Y(i10);
        }
        this.f24390t = i10;
        int i11 = this.f24383m | 128;
        this.f24389s = null;
        this.f24383m = i11 & (-65);
        return c0();
    }

    public a Z(com.bumptech.glide.g gVar) {
        if (this.H) {
            return clone().Z(gVar);
        }
        this.f24386p = (com.bumptech.glide.g) k.d(gVar);
        this.f24383m |= 8;
        return c0();
    }

    public a a(a aVar) {
        if (this.H) {
            return clone().a(aVar);
        }
        if (L(aVar.f24383m, 2)) {
            this.f24384n = aVar.f24384n;
        }
        if (L(aVar.f24383m, 262144)) {
            this.I = aVar.I;
        }
        if (L(aVar.f24383m, 1048576)) {
            this.L = aVar.L;
        }
        if (L(aVar.f24383m, 4)) {
            this.f24385o = aVar.f24385o;
        }
        if (L(aVar.f24383m, 8)) {
            this.f24386p = aVar.f24386p;
        }
        if (L(aVar.f24383m, 16)) {
            this.f24387q = aVar.f24387q;
            this.f24388r = 0;
            this.f24383m &= -33;
        }
        if (L(aVar.f24383m, 32)) {
            this.f24388r = aVar.f24388r;
            this.f24387q = null;
            this.f24383m &= -17;
        }
        if (L(aVar.f24383m, 64)) {
            this.f24389s = aVar.f24389s;
            this.f24390t = 0;
            this.f24383m &= -129;
        }
        if (L(aVar.f24383m, 128)) {
            this.f24390t = aVar.f24390t;
            this.f24389s = null;
            this.f24383m &= -65;
        }
        if (L(aVar.f24383m, 256)) {
            this.f24391u = aVar.f24391u;
        }
        if (L(aVar.f24383m, 512)) {
            this.f24393w = aVar.f24393w;
            this.f24392v = aVar.f24392v;
        }
        if (L(aVar.f24383m, 1024)) {
            this.f24394x = aVar.f24394x;
        }
        if (L(aVar.f24383m, 4096)) {
            this.E = aVar.E;
        }
        if (L(aVar.f24383m, 8192)) {
            this.A = aVar.A;
            this.B = 0;
            this.f24383m &= -16385;
        }
        if (L(aVar.f24383m, 16384)) {
            this.B = aVar.B;
            this.A = null;
            this.f24383m &= -8193;
        }
        if (L(aVar.f24383m, 32768)) {
            this.G = aVar.G;
        }
        if (L(aVar.f24383m, 65536)) {
            this.f24396z = aVar.f24396z;
        }
        if (L(aVar.f24383m, 131072)) {
            this.f24395y = aVar.f24395y;
        }
        if (L(aVar.f24383m, 2048)) {
            this.D.putAll(aVar.D);
            this.K = aVar.K;
        }
        if (L(aVar.f24383m, 524288)) {
            this.J = aVar.J;
        }
        if (!this.f24396z) {
            this.D.clear();
            int i10 = this.f24383m & (-2049);
            this.f24395y = false;
            this.f24383m = i10 & (-131073);
            this.K = true;
        }
        this.f24383m |= aVar.f24383m;
        this.C.d(aVar.C);
        return c0();
    }

    public a b() {
        if (this.F && !this.H) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.H = true;
        return Q();
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            r1.h hVar = new r1.h();
            aVar.C = hVar;
            hVar.d(this.C);
            n2.b bVar = new n2.b();
            aVar.D = bVar;
            bVar.putAll(this.D);
            aVar.F = false;
            aVar.H = false;
            return aVar;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    protected final a c0() {
        if (this.F) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return b0();
    }

    public a d(Class cls) {
        if (this.H) {
            return clone().d(cls);
        }
        this.E = (Class) k.d(cls);
        this.f24383m |= 4096;
        return c0();
    }

    public a d0(r1.g gVar, Object obj) {
        if (this.H) {
            return clone().d0(gVar, obj);
        }
        k.d(gVar);
        k.d(obj);
        this.C.e(gVar, obj);
        return c0();
    }

    public a e0(r1.f fVar) {
        if (this.H) {
            return clone().e0(fVar);
        }
        this.f24394x = (r1.f) k.d(fVar);
        this.f24383m |= 1024;
        return c0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f24384n, this.f24384n) == 0 && this.f24388r == aVar.f24388r && n2.l.c(this.f24387q, aVar.f24387q) && this.f24390t == aVar.f24390t && n2.l.c(this.f24389s, aVar.f24389s) && this.B == aVar.B && n2.l.c(this.A, aVar.A) && this.f24391u == aVar.f24391u && this.f24392v == aVar.f24392v && this.f24393w == aVar.f24393w && this.f24395y == aVar.f24395y && this.f24396z == aVar.f24396z && this.I == aVar.I && this.J == aVar.J && this.f24385o.equals(aVar.f24385o) && this.f24386p == aVar.f24386p && this.C.equals(aVar.C) && this.D.equals(aVar.D) && this.E.equals(aVar.E) && n2.l.c(this.f24394x, aVar.f24394x) && n2.l.c(this.G, aVar.G);
    }

    public a f(j jVar) {
        if (this.H) {
            return clone().f(jVar);
        }
        this.f24385o = (j) k.d(jVar);
        this.f24383m |= 4;
        return c0();
    }

    public a f0(float f5) {
        if (this.H) {
            return clone().f0(f5);
        }
        if (f5 < 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f24384n = f5;
        this.f24383m |= 2;
        return c0();
    }

    public a g(l lVar) {
        return d0(l.f39h, k.d(lVar));
    }

    public a g0(boolean z10) {
        if (this.H) {
            return clone().g0(true);
        }
        this.f24391u = !z10;
        this.f24383m |= 256;
        return c0();
    }

    final a h0(l lVar, r1.l lVar2) {
        if (this.H) {
            return clone().h0(lVar, lVar2);
        }
        g(lVar);
        return j0(lVar2);
    }

    public int hashCode() {
        return n2.l.n(this.G, n2.l.n(this.f24394x, n2.l.n(this.E, n2.l.n(this.D, n2.l.n(this.C, n2.l.n(this.f24386p, n2.l.n(this.f24385o, n2.l.o(this.J, n2.l.o(this.I, n2.l.o(this.f24396z, n2.l.o(this.f24395y, n2.l.m(this.f24393w, n2.l.m(this.f24392v, n2.l.o(this.f24391u, n2.l.n(this.A, n2.l.m(this.B, n2.l.n(this.f24389s, n2.l.m(this.f24390t, n2.l.n(this.f24387q, n2.l.m(this.f24388r, n2.l.k(this.f24384n)))))))))))))))))))));
    }

    public final j i() {
        return this.f24385o;
    }

    a i0(Class cls, r1.l lVar, boolean z10) {
        if (this.H) {
            return clone().i0(cls, lVar, z10);
        }
        k.d(cls);
        k.d(lVar);
        this.D.put(cls, lVar);
        int i10 = this.f24383m | 2048;
        this.f24396z = true;
        int i11 = i10 | 65536;
        this.f24383m = i11;
        this.K = false;
        if (z10) {
            this.f24383m = i11 | 131072;
            this.f24395y = true;
        }
        return c0();
    }

    public final int j() {
        return this.f24388r;
    }

    public a j0(r1.l lVar) {
        return k0(lVar, true);
    }

    public final Drawable k() {
        return this.f24387q;
    }

    a k0(r1.l lVar, boolean z10) {
        if (this.H) {
            return clone().k0(lVar, z10);
        }
        o oVar = new o(lVar, z10);
        i0(Bitmap.class, lVar, z10);
        i0(Drawable.class, oVar, z10);
        i0(BitmapDrawable.class, oVar.c(), z10);
        i0(e2.c.class, new e2.f(lVar), z10);
        return c0();
    }

    public a l0(boolean z10) {
        if (this.H) {
            return clone().l0(z10);
        }
        this.L = z10;
        this.f24383m |= 1048576;
        return c0();
    }

    public final Drawable m() {
        return this.A;
    }

    public final int r() {
        return this.B;
    }

    public final boolean s() {
        return this.J;
    }

    public final r1.h t() {
        return this.C;
    }

    public final int u() {
        return this.f24392v;
    }

    public final int v() {
        return this.f24393w;
    }

    public final Drawable w() {
        return this.f24389s;
    }

    public final int x() {
        return this.f24390t;
    }

    public final com.bumptech.glide.g y() {
        return this.f24386p;
    }

    public final Class z() {
        return this.E;
    }
}
