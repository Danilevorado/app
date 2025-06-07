package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.e;
import v.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private u.f f27702a;

    /* renamed from: d, reason: collision with root package name */
    private u.f f27705d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27703b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27704c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f27706e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f27707f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0195b f27708g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f27709h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f27710i = new ArrayList();

    public e(u.f fVar) {
        this.f27702a = fVar;
        this.f27705d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        p pVar = fVar.f27714d;
        if (pVar.f27766c == null) {
            u.f fVar3 = this.f27702a;
            if (pVar == fVar3.f27456e || pVar == fVar3.f27458f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            pVar.f27766c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f27771h.f27721k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f27772i.f27721k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar2, arrayList, mVar);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f27746k.f27721k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f27771h.f27722l) {
                if (fVar4 == fVar2) {
                    mVar.f27740b = true;
                }
                a(fVar4, i10, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f27772i.f27722l) {
                if (fVar5 == fVar2) {
                    mVar.f27740b = true;
                }
                a(fVar5, i10, 1, fVar2, arrayList, mVar);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f27746k.f27722l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i10, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(u.f r17) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.b(u.f):boolean");
    }

    private int e(u.f fVar, int i10) {
        int size = this.f27710i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((m) this.f27710i.get(i11)).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f27771h.f27721k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f27772i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f27771h, i10, 0, pVar.f27772i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f27772i.f27721k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f27771h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f27772i, i10, 1, pVar.f27771h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f27746k.f27721k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(u.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f27709h;
        aVar.f27690a = bVar;
        aVar.f27691b = bVar2;
        aVar.f27692c = i10;
        aVar.f27693d = i11;
        this.f27708g.b(eVar, aVar);
        eVar.g1(this.f27709h.f27694e);
        eVar.I0(this.f27709h.f27695f);
        eVar.H0(this.f27709h.f27697h);
        eVar.x0(this.f27709h.f27696g);
    }

    public void c() {
        d(this.f27706e);
        this.f27710i.clear();
        m.f27738h = 0;
        i(this.f27702a.f27456e, 0, this.f27710i);
        i(this.f27702a.f27458f, 1, this.f27710i);
        this.f27703b = false;
    }

    public void d(ArrayList arrayList) {
        p jVar;
        arrayList.clear();
        this.f27705d.f27456e.f();
        this.f27705d.f27458f.f();
        arrayList.add(this.f27705d.f27456e);
        arrayList.add(this.f27705d.f27458f);
        Iterator it = this.f27705d.L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            u.e eVar = (u.e) it.next();
            if (eVar instanceof u.g) {
                jVar = new j(eVar);
            } else {
                if (eVar.g0()) {
                    if (eVar.f27452c == null) {
                        eVar.f27452c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f27452c);
                } else {
                    arrayList.add(eVar.f27456e);
                }
                if (eVar.i0()) {
                    if (eVar.f27454d == null) {
                        eVar.f27454d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f27454d);
                } else {
                    arrayList.add(eVar.f27458f);
                }
                if (eVar instanceof u.i) {
                    jVar = new k(eVar);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f27765b != this.f27705d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f27703b || this.f27704c) {
            Iterator it = this.f27702a.L0.iterator();
            while (it.hasNext()) {
                u.e eVar = (u.e) it.next();
                eVar.l();
                eVar.f27448a = false;
                eVar.f27456e.r();
                eVar.f27458f.q();
            }
            this.f27702a.l();
            u.f fVar = this.f27702a;
            fVar.f27448a = false;
            fVar.f27456e.r();
            this.f27702a.f27458f.q();
            this.f27704c = false;
        }
        if (b(this.f27705d)) {
            return false;
        }
        this.f27702a.i1(0);
        this.f27702a.j1(0);
        e.b bVarS = this.f27702a.s(0);
        e.b bVarS2 = this.f27702a.s(1);
        if (this.f27703b) {
            c();
        }
        int iV = this.f27702a.V();
        int iW = this.f27702a.W();
        this.f27702a.f27456e.f27771h.d(iV);
        this.f27702a.f27458f.f27771h.d(iW);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z13) {
                Iterator it2 = this.f27706e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((p) it2.next()).m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && bVarS == e.b.WRAP_CONTENT) {
                this.f27702a.M0(e.b.FIXED);
                u.f fVar2 = this.f27702a;
                fVar2.g1(e(fVar2, 0));
                u.f fVar3 = this.f27702a;
                fVar3.f27456e.f27768e.d(fVar3.U());
            }
            if (z13 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f27702a.c1(e.b.FIXED);
                u.f fVar4 = this.f27702a;
                fVar4.I0(e(fVar4, 1));
                u.f fVar5 = this.f27702a;
                fVar5.f27458f.f27768e.d(fVar5.v());
            }
        }
        u.f fVar6 = this.f27702a;
        e.b[] bVarArr = fVar6.Z;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int iU = fVar6.U() + iV;
            this.f27702a.f27456e.f27772i.d(iU);
            this.f27702a.f27456e.f27768e.d(iU - iV);
            m();
            u.f fVar7 = this.f27702a;
            e.b[] bVarArr2 = fVar7.Z;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int iV2 = fVar7.v() + iW;
                this.f27702a.f27458f.f27772i.d(iV2);
                this.f27702a.f27458f.f27768e.d(iV2 - iW);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = this.f27706e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f27765b != this.f27702a || pVar.f27770g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f27706e.iterator();
        while (it4.hasNext()) {
            p pVar2 = (p) it4.next();
            if (z11 || pVar2.f27765b != this.f27702a) {
                if (!pVar2.f27771h.f27720j || ((!pVar2.f27772i.f27720j && !(pVar2 instanceof j)) || (!pVar2.f27768e.f27720j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f27702a.M0(bVarS);
        this.f27702a.c1(bVarS2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f27703b) {
            Iterator it = this.f27702a.L0.iterator();
            while (it.hasNext()) {
                u.e eVar = (u.e) it.next();
                eVar.l();
                eVar.f27448a = false;
                l lVar = eVar.f27456e;
                lVar.f27768e.f27720j = false;
                lVar.f27770g = false;
                lVar.r();
                n nVar = eVar.f27458f;
                nVar.f27768e.f27720j = false;
                nVar.f27770g = false;
                nVar.q();
            }
            this.f27702a.l();
            u.f fVar = this.f27702a;
            fVar.f27448a = false;
            l lVar2 = fVar.f27456e;
            lVar2.f27768e.f27720j = false;
            lVar2.f27770g = false;
            lVar2.r();
            n nVar2 = this.f27702a.f27458f;
            nVar2.f27768e.f27720j = false;
            nVar2.f27770g = false;
            nVar2.q();
            c();
        }
        if (b(this.f27705d)) {
            return false;
        }
        this.f27702a.i1(0);
        this.f27702a.j1(0);
        this.f27702a.f27456e.f27771h.d(0);
        this.f27702a.f27458f.f27771h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        g gVar;
        int iV;
        boolean z12 = true;
        boolean z13 = z10 & true;
        e.b bVarS = this.f27702a.s(0);
        e.b bVarS2 = this.f27702a.s(1);
        int iV2 = this.f27702a.V();
        int iW = this.f27702a.W();
        if (z13 && (bVarS == (bVar = e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            Iterator it = this.f27706e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f27769f == i10 && !pVar.m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && bVarS == e.b.WRAP_CONTENT) {
                    this.f27702a.M0(e.b.FIXED);
                    u.f fVar = this.f27702a;
                    fVar.g1(e(fVar, 0));
                    u.f fVar2 = this.f27702a;
                    gVar = fVar2.f27456e.f27768e;
                    iV = fVar2.U();
                    gVar.d(iV);
                }
            } else if (z13 && bVarS2 == e.b.WRAP_CONTENT) {
                this.f27702a.c1(e.b.FIXED);
                u.f fVar3 = this.f27702a;
                fVar3.I0(e(fVar3, 1));
                u.f fVar4 = this.f27702a;
                gVar = fVar4.f27458f.f27768e;
                iV = fVar4.v();
                gVar.d(iV);
            }
        }
        u.f fVar5 = this.f27702a;
        if (i10 == 0) {
            e.b[] bVarArr = fVar5.Z;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int iU = fVar5.U() + iV2;
                this.f27702a.f27456e.f27772i.d(iU);
                this.f27702a.f27456e.f27768e.d(iU - iV2);
                z11 = true;
            }
            z11 = false;
        } else {
            e.b[] bVarArr2 = fVar5.Z;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int iV3 = fVar5.v() + iW;
                this.f27702a.f27458f.f27772i.d(iV3);
                this.f27702a.f27458f.f27768e.d(iV3 - iW);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator it2 = this.f27706e.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (pVar2.f27769f == i10 && (pVar2.f27765b != this.f27702a || pVar2.f27770g)) {
                pVar2.e();
            }
        }
        Iterator it3 = this.f27706e.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            if (pVar3.f27769f == i10 && (z11 || pVar3.f27765b != this.f27702a)) {
                if (!pVar3.f27771h.f27720j || !pVar3.f27772i.f27720j || (!(pVar3 instanceof c) && !pVar3.f27768e.f27720j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f27702a.M0(bVarS);
        this.f27702a.c1(bVarS2);
        return z12;
    }

    public void j() {
        this.f27703b = true;
    }

    public void k() {
        this.f27704c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r12 = this;
            u.f r0 = r12.f27702a
            java.util.ArrayList r0 = r0.L0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            u.e r1 = (u.e) r1
            boolean r2 = r1.f27448a
            if (r2 == 0) goto L19
            goto L8
        L19:
            u.e$b[] r2 = r1.Z
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f27492w
            int r4 = r1.f27494x
            u.e$b r6 = u.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            u.e$b r5 = u.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = r3
            goto L33
        L32:
            r2 = r9
        L33:
            if (r10 == r6) goto L3b
            u.e$b r5 = u.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = r9
        L3c:
            v.l r4 = r1.f27456e
            v.g r4 = r4.f27768e
            boolean r5 = r4.f27720j
            v.n r7 = r1.f27458f
            v.g r7 = r7.f27768e
            boolean r11 = r7.f27720j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            u.e$b r6 = u.e.b.FIXED
            int r5 = r4.f27717g
            int r7 = r7.f27717g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f27448a = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            u.e$b r5 = u.e.b.FIXED
            int r8 = r4.f27717g
            int r7 = r7.f27717g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            u.e$b r2 = u.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            v.n r2 = r1.f27458f
            v.g r2 = r2.f27768e
            int r3 = r1.v()
        L78:
            r2.f27732m = r3
            goto Lae
        L7b:
            v.n r2 = r1.f27458f
            v.g r2 = r2.f27768e
            int r3 = r1.v()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f27717g
            u.e$b r10 = u.e.b.FIXED
            int r7 = r7.f27717g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            u.e$b r2 = u.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            v.l r2 = r1.f27456e
            v.g r2 = r2.f27768e
            int r3 = r1.U()
            goto L78
        La5:
            v.l r2 = r1.f27456e
            v.g r2 = r2.f27768e
            int r3 = r1.U()
            goto L83
        Lae:
            boolean r2 = r1.f27448a
            if (r2 == 0) goto L8
            v.n r2 = r1.f27458f
            v.g r2 = r2.f27747l
            if (r2 == 0) goto L8
            int r1 = r1.n()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.m():void");
    }

    public void n(b.InterfaceC0195b interfaceC0195b) {
        this.f27708g = interfaceC0195b;
    }
}
