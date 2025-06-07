package r;

import java.util.ArrayList;
import r.d;
import r.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f26349e;

    /* renamed from: a, reason: collision with root package name */
    i f26345a = null;

    /* renamed from: b, reason: collision with root package name */
    float f26346b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f26347c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f26348d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f26350f = false;

    public interface a {
        float a(int i10);

        boolean b(i iVar);

        float c(i iVar);

        void clear();

        void d(i iVar, float f5);

        float e(b bVar, boolean z10);

        int f();

        float g(i iVar, boolean z10);

        i h(int i10);

        void i(i iVar, float f5, boolean z10);

        void j(float f5);

        void k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f26349e = new r.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f26405y <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iF = this.f26349e.f();
        i iVar2 = null;
        float f5 = 0.0f;
        for (int i10 = 0; i10 < iF; i10++) {
            float fA = this.f26349e.a(i10);
            if (fA < 0.0f) {
                i iVarH = this.f26349e.h(i10);
                if ((zArr == null || !zArr[iVarH.f26395o]) && iVarH != iVar && (((aVar = iVarH.f26402v) == i.a.SLACK || aVar == i.a.ERROR) && fA < f5)) {
                    f5 = fA;
                    iVar2 = iVarH;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f26399s) {
            return;
        }
        this.f26346b += iVar.f26398r * this.f26349e.c(iVar);
        this.f26349e.g(iVar, z10);
        if (z10) {
            iVar.i(this);
        }
        if (d.f26357t && this.f26349e.f() == 0) {
            this.f26350f = true;
            dVar.f26363a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f26346b += bVar.f26346b * this.f26349e.e(bVar, z10);
        if (z10) {
            bVar.f26345a.i(this);
        }
        if (d.f26357t && this.f26345a != null && this.f26349e.f() == 0) {
            this.f26350f = true;
            dVar.f26363a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f26406z) {
            return;
        }
        float fC = this.f26349e.c(iVar);
        this.f26346b += iVar.B * fC;
        this.f26349e.g(iVar, z10);
        if (z10) {
            iVar.i(this);
        }
        this.f26349e.i(dVar.f26376n.f26354d[iVar.A], fC, z10);
        if (d.f26357t && this.f26349e.f() == 0) {
            this.f26350f = true;
            dVar.f26363a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f26369g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iF = this.f26349e.f();
            for (int i10 = 0; i10 < iF; i10++) {
                i iVarH = this.f26349e.h(i10);
                if (iVarH.f26396p != -1 || iVarH.f26399s || iVarH.f26406z) {
                    this.f26348d.add(iVarH);
                }
            }
            int size = this.f26348d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = (i) this.f26348d.get(i11);
                    if (iVar.f26399s) {
                        A(dVar, iVar, true);
                    } else if (iVar.f26406z) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f26369g[iVar.f26396p], true);
                    }
                }
                this.f26348d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f26357t && this.f26345a != null && this.f26349e.f() == 0) {
            this.f26350f = true;
            dVar.f26363a = true;
        }
    }

    @Override // r.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f26345a = null;
            this.f26349e.clear();
            for (int i10 = 0; i10 < bVar.f26349e.f(); i10++) {
                this.f26349e.i(bVar.f26349e.h(i10), bVar.f26349e.a(i10), true);
            }
        }
    }

    @Override // r.d.a
    public void b(i iVar) {
        int i10 = iVar.f26397q;
        float f5 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f5 = 1000.0f;
            } else if (i10 == 3) {
                f5 = 1000000.0f;
            } else if (i10 == 4) {
                f5 = 1.0E9f;
            } else if (i10 == 5) {
                f5 = 1.0E12f;
            }
        }
        this.f26349e.d(iVar, f5);
    }

    @Override // r.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // r.d.a
    public void clear() {
        this.f26349e.clear();
        this.f26345a = null;
        this.f26346b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f26349e.d(dVar.o(i10, "ep"), 1.0f);
        this.f26349e.d(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f26349e.d(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f26349e.f() == 0) {
            this.f26350f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int iF = this.f26349e.f();
        i iVar = null;
        boolean zU = false;
        boolean zU2 = false;
        float f5 = 0.0f;
        float f10 = 0.0f;
        i iVar2 = null;
        for (int i10 = 0; i10 < iF; i10++) {
            float fA = this.f26349e.a(i10);
            i iVarH = this.f26349e.h(i10);
            if (iVarH.f26402v == i.a.UNRESTRICTED) {
                if (iVar == null || f5 > fA) {
                    zU = u(iVarH, dVar);
                    f5 = fA;
                    iVar = iVarH;
                } else if (!zU && u(iVarH, dVar)) {
                    f5 = fA;
                    iVar = iVarH;
                    zU = true;
                }
            } else if (iVar == null && fA < 0.0f) {
                if (iVar2 == null || f10 > fA) {
                    zU2 = u(iVarH, dVar);
                    f10 = fA;
                    iVar2 = iVarH;
                } else if (!zU2 && u(iVarH, dVar)) {
                    f10 = fA;
                    iVar2 = iVarH;
                    zU2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // r.d.a
    public i getKey() {
        return this.f26345a;
    }

    b h(i iVar, i iVar2, int i10, float f5, i iVar3, i iVar4, int i11) {
        float f10;
        int i12;
        if (iVar2 == iVar3) {
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar4, 1.0f);
            this.f26349e.d(iVar2, -2.0f);
            return this;
        }
        if (f5 == 0.5f) {
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar2, -1.0f);
            this.f26349e.d(iVar3, -1.0f);
            this.f26349e.d(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i12 = (-i10) + i11;
                f10 = i12;
            }
            return this;
        }
        if (f5 <= 0.0f) {
            this.f26349e.d(iVar, -1.0f);
            this.f26349e.d(iVar2, 1.0f);
            f10 = i10;
        } else {
            if (f5 < 1.0f) {
                float f11 = 1.0f - f5;
                this.f26349e.d(iVar, f11 * 1.0f);
                this.f26349e.d(iVar2, f11 * (-1.0f));
                this.f26349e.d(iVar3, (-1.0f) * f5);
                this.f26349e.d(iVar4, 1.0f * f5);
                if (i10 > 0 || i11 > 0) {
                    f10 = ((-i10) * f11) + (i11 * f5);
                }
                return this;
            }
            this.f26349e.d(iVar4, -1.0f);
            this.f26349e.d(iVar3, 1.0f);
            i12 = -i11;
            f10 = i12;
        }
        this.f26346b = f10;
        return this;
    }

    b i(i iVar, int i10) {
        this.f26345a = iVar;
        float f5 = i10;
        iVar.f26398r = f5;
        this.f26346b = f5;
        this.f26350f = true;
        return this;
    }

    @Override // r.d.a
    public boolean isEmpty() {
        return this.f26345a == null && this.f26346b == 0.0f && this.f26349e.f() == 0;
    }

    b j(i iVar, i iVar2, float f5) {
        this.f26349e.d(iVar, -1.0f);
        this.f26349e.d(iVar2, f5);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f5) {
        this.f26349e.d(iVar, -1.0f);
        this.f26349e.d(iVar2, 1.0f);
        this.f26349e.d(iVar3, f5);
        this.f26349e.d(iVar4, -f5);
        return this;
    }

    public b l(float f5, float f10, float f11, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f26346b = 0.0f;
        if (f10 == 0.0f || f5 == f11) {
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar2, -1.0f);
            this.f26349e.d(iVar4, 1.0f);
            this.f26349e.d(iVar3, -1.0f);
        } else if (f5 == 0.0f) {
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar2, -1.0f);
        } else if (f11 == 0.0f) {
            this.f26349e.d(iVar3, 1.0f);
            this.f26349e.d(iVar4, -1.0f);
        } else {
            float f12 = (f5 / f10) / (f11 / f10);
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar2, -1.0f);
            this.f26349e.d(iVar4, f12);
            this.f26349e.d(iVar3, -f12);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        a aVar;
        float f5;
        if (i10 < 0) {
            this.f26346b = i10 * (-1);
            aVar = this.f26349e;
            f5 = 1.0f;
        } else {
            this.f26346b = i10;
            aVar = this.f26349e;
            f5 = -1.0f;
        }
        aVar.d(iVar, f5);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26346b = i10;
        }
        if (z10) {
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar2, -1.0f);
        } else {
            this.f26349e.d(iVar, -1.0f);
            this.f26349e.d(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26346b = i10;
        }
        if (z10) {
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar2, -1.0f);
            this.f26349e.d(iVar3, -1.0f);
        } else {
            this.f26349e.d(iVar, -1.0f);
            this.f26349e.d(iVar2, 1.0f);
            this.f26349e.d(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26346b = i10;
        }
        if (z10) {
            this.f26349e.d(iVar, 1.0f);
            this.f26349e.d(iVar2, -1.0f);
            this.f26349e.d(iVar3, 1.0f);
        } else {
            this.f26349e.d(iVar, -1.0f);
            this.f26349e.d(iVar2, 1.0f);
            this.f26349e.d(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f5) {
        this.f26349e.d(iVar3, 0.5f);
        this.f26349e.d(iVar4, 0.5f);
        this.f26349e.d(iVar, -0.5f);
        this.f26349e.d(iVar2, -0.5f);
        this.f26346b = -f5;
        return this;
    }

    void r() {
        float f5 = this.f26346b;
        if (f5 < 0.0f) {
            this.f26346b = f5 * (-1.0f);
            this.f26349e.k();
        }
    }

    boolean s() {
        i iVar = this.f26345a;
        return iVar != null && (iVar.f26402v == i.a.UNRESTRICTED || this.f26346b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f26349e.b(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f26345a;
        if (iVar2 != null) {
            this.f26349e.d(iVar2, -1.0f);
            this.f26345a.f26396p = -1;
            this.f26345a = null;
        }
        float fG = this.f26349e.g(iVar, true) * (-1.0f);
        this.f26345a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f26346b /= fG;
        this.f26349e.j(fG);
    }

    public void y() {
        this.f26345a = null;
        this.f26349e.clear();
        this.f26346b = 0.0f;
        this.f26350f = false;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String z() {
        /*
            r10 = this;
            r.i r0 = r10.f26345a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r.i r1 = r10.f26345a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f26346b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f26346b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L53
        L52:
            r1 = r3
        L53:
            r.b$a r5 = r10.f26349e
            int r5 = r5.f()
        L59:
            if (r3 >= r5) goto Ld1
            r.b$a r6 = r10.f26349e
            r.i r6 = r6.h(r3)
            if (r6 != 0) goto L64
            goto Lce
        L64:
            r.b$a r7 = r10.f26349e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lce
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Laa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La2
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L9a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Laa
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Laa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc3
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        Lce:
            int r3 = r3 + 1
            goto L59
        Ld1:
            if (r1 != 0) goto Le4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.z():java.lang.String");
    }
}
