package u;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import u.e;
import v.b;

/* loaded from: classes.dex */
public class f extends k {
    private int O0;
    int S0;
    int T0;
    int U0;
    int V0;
    v.b M0 = new v.b(this);
    public v.e N0 = new v.e(this);
    protected b.InterfaceC0195b P0 = null;
    private boolean Q0 = false;
    protected r.d R0 = new r.d();
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];

    /* renamed from: a1, reason: collision with root package name */
    public boolean f27507a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f27508b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f27509c1 = false;

    /* renamed from: d1, reason: collision with root package name */
    public int f27510d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public int f27511e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    private int f27512f1 = 257;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f27513g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f27514h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f27515i1 = false;

    /* renamed from: j1, reason: collision with root package name */
    int f27516j1 = 0;

    /* renamed from: k1, reason: collision with root package name */
    private WeakReference f27517k1 = null;

    /* renamed from: l1, reason: collision with root package name */
    private WeakReference f27518l1 = null;

    /* renamed from: m1, reason: collision with root package name */
    private WeakReference f27519m1 = null;

    /* renamed from: n1, reason: collision with root package name */
    private WeakReference f27520n1 = null;

    /* renamed from: o1, reason: collision with root package name */
    HashSet f27521o1 = new HashSet();

    /* renamed from: p1, reason: collision with root package name */
    public b.a f27522p1 = new b.a();

    public static boolean N1(int i10, e eVar, b.InterfaceC0195b interfaceC0195b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0195b == null) {
            return false;
        }
        if (eVar.T() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f27694e = 0;
            aVar.f27695f = 0;
            return false;
        }
        aVar.f27690a = eVar.y();
        aVar.f27691b = eVar.R();
        aVar.f27692c = eVar.U();
        aVar.f27693d = eVar.v();
        aVar.f27698i = false;
        aVar.f27699j = i11;
        e.b bVar = aVar.f27690a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f27691b == bVar2;
        boolean z12 = z10 && eVar.f27455d0 > 0.0f;
        boolean z13 = z11 && eVar.f27455d0 > 0.0f;
        if (z10 && eVar.Y(0) && eVar.f27492w == 0 && !z12) {
            aVar.f27690a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f27494x == 0) {
                aVar.f27690a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.Y(1) && eVar.f27494x == 0 && !z13) {
            aVar.f27691b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f27492w == 0) {
                aVar.f27691b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.l0()) {
            aVar.f27690a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.m0()) {
            aVar.f27691b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f27496y[0] == 4) {
                aVar.f27690a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f27691b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f27693d;
                } else {
                    aVar.f27690a = e.b.WRAP_CONTENT;
                    interfaceC0195b.b(eVar, aVar);
                    i13 = aVar.f27695f;
                }
                aVar.f27690a = bVar4;
                aVar.f27692c = (int) (eVar.t() * i13);
            }
        }
        if (z13) {
            if (eVar.f27496y[1] == 4) {
                aVar.f27691b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f27690a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f27692c;
                } else {
                    aVar.f27691b = e.b.WRAP_CONTENT;
                    interfaceC0195b.b(eVar, aVar);
                    i12 = aVar.f27694e;
                }
                aVar.f27691b = bVar6;
                aVar.f27693d = eVar.u() == -1 ? (int) (i12 / eVar.t()) : (int) (eVar.t() * i12);
            }
        }
        interfaceC0195b.b(eVar, aVar);
        eVar.g1(aVar.f27694e);
        eVar.I0(aVar.f27695f);
        eVar.H0(aVar.f27697h);
        eVar.x0(aVar.f27696g);
        aVar.f27699j = b.a.f27687k;
        return aVar.f27698i;
    }

    private void P1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void t1(e eVar) {
        int i10 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i10 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, K1());
        this.W0++;
    }

    private void w1(d dVar, r.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void x1(d dVar, r.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void y1(e eVar) {
        int i10 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i10 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, K1());
        this.X0++;
    }

    void A1(d dVar) {
        WeakReference weakReference = this.f27517k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f27517k1.get()).d()) {
            this.f27517k1 = new WeakReference(dVar);
        }
    }

    public boolean B1(boolean z10) {
        return this.N0.f(z10);
    }

    public boolean C1(boolean z10) {
        return this.N0.g(z10);
    }

    public boolean D1(boolean z10, int i10) {
        return this.N0.h(z10, i10);
    }

    public b.InterfaceC0195b E1() {
        return this.P0;
    }

    public int F1() {
        return this.f27512f1;
    }

    public r.d G1() {
        return this.R0;
    }

    public void H1() {
        this.N0.j();
    }

    public void I1() {
        this.N0.k();
    }

    public boolean J1() {
        return this.f27515i1;
    }

    public boolean K1() {
        return this.Q0;
    }

    public boolean L1() {
        return this.f27514h1;
    }

    @Override // u.e
    public void M(StringBuilder sb2) {
        sb2.append(this.f27476o + ":{\n");
        sb2.append("  actualWidth:" + this.f27451b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f27453c0);
        sb2.append("\n");
        Iterator it = n1().iterator();
        while (it.hasNext()) {
            ((e) it.next()).M(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public long M1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.S0 = i17;
        this.T0 = i18;
        return this.M0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean O1(int i10) {
        return (this.f27512f1 & i10) == i10;
    }

    public void Q1(b.InterfaceC0195b interfaceC0195b) {
        this.P0 = interfaceC0195b;
        this.N0.n(interfaceC0195b);
    }

    public void R1(int i10) {
        this.f27512f1 = i10;
        r.d.f26355r = O1(512);
    }

    public void S1(int i10) {
        this.O0 = i10;
    }

    public void T1(boolean z10) {
        this.Q0 = z10;
    }

    public boolean U1(r.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zO1 = O1(64);
        m1(dVar, zO1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.L0.get(i10);
            eVar.m1(dVar, zO1);
            if (eVar.a0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void V1() {
        this.M0.e(this);
    }

    @Override // u.e
    public void l1(boolean z10, boolean z11) {
        super.l1(z10, z11);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.L0.get(i10)).l1(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0303 A[PHI: r2 r16
  0x0303: PHI (r2v15 boolean) = (r2v14 boolean), (r2v19 boolean), (r2v19 boolean), (r2v19 boolean) binds: [B:138:0x02c4, B:146:0x02e9, B:147:0x02eb, B:149:0x02f1] A[DONT_GENERATE, DONT_INLINE]
  0x0303: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02c4, B:146:0x02e9, B:147:0x02eb, B:149:0x02f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // u.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o1() {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.f.o1():void");
    }

    @Override // u.k, u.e
    public void r0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f27513g1 = false;
        super.r0();
    }

    void r1(e eVar, int i10) {
        if (i10 == 0) {
            t1(eVar);
        } else if (i10 == 1) {
            y1(eVar);
        }
    }

    public boolean s1(r.d dVar) {
        boolean zO1 = O1(64);
        g(dVar, zO1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.L0.get(i10);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.L0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).u1();
                }
            }
        }
        this.f27521o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.L0.get(i12);
            if (eVar3.f()) {
                eVar3.g(dVar, zO1);
            }
        }
        while (this.f27521o1.size() > 0) {
            int size2 = this.f27521o1.size();
            Iterator it = this.f27521o1.iterator();
            if (it.hasNext()) {
                a5.a.a((e) it.next());
                throw null;
            }
            if (size2 == this.f27521o1.size()) {
                Iterator it2 = this.f27521o1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, zO1);
                }
                this.f27521o1.clear();
            }
        }
        if (r.d.f26355r) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = (e) this.L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                j.a(this, dVar, eVar5);
                eVar5.g(dVar, zO1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = (e) this.L0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.c1(e.b.FIXED);
                    }
                    eVar6.g(dVar, zO1);
                    if (bVar == bVar3) {
                        eVar6.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.c1(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, zO1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.X0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void u1(d dVar) {
        WeakReference weakReference = this.f27520n1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f27520n1.get()).d()) {
            this.f27520n1 = new WeakReference(dVar);
        }
    }

    public void v1(d dVar) {
        WeakReference weakReference = this.f27518l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f27518l1.get()).d()) {
            this.f27518l1 = new WeakReference(dVar);
        }
    }

    void z1(d dVar) {
        WeakReference weakReference = this.f27519m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f27519m1.get()).d()) {
            this.f27519m1 = new WeakReference(dVar);
        }
    }
}
