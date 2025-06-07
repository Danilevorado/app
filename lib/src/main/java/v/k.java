package v;

import java.util.Iterator;
import v.f;

/* loaded from: classes.dex */
class k extends p {
    public k(u.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f27771h.f27721k.add(fVar);
        fVar.f27722l.add(this.f27771h);
    }

    @Override // v.p, v.d
    public void a(d dVar) {
        u.a aVar = (u.a) this.f27765b;
        int iR1 = aVar.r1();
        Iterator it = this.f27771h.f27722l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f27717g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iR1 == 0 || iR1 == 2) {
            this.f27771h.d(i11 + aVar.s1());
        } else {
            this.f27771h.d(i10 + aVar.s1());
        }
    }

    @Override // v.p
    void d() {
        p pVar;
        u.e eVar = this.f27765b;
        if (eVar instanceof u.a) {
            this.f27771h.f27712b = true;
            u.a aVar = (u.a) eVar;
            int iR1 = aVar.r1();
            boolean zQ1 = aVar.q1();
            int i10 = 0;
            if (iR1 == 0) {
                this.f27771h.f27715e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    u.e eVar2 = aVar.L0[i10];
                    if (zQ1 || eVar2.T() != 8) {
                        f fVar = eVar2.f27456e.f27771h;
                        fVar.f27721k.add(this.f27771h);
                        this.f27771h.f27722l.add(fVar);
                    }
                    i10++;
                }
            } else {
                if (iR1 != 1) {
                    if (iR1 == 2) {
                        this.f27771h.f27715e = f.a.TOP;
                        while (i10 < aVar.M0) {
                            u.e eVar3 = aVar.L0[i10];
                            if (zQ1 || eVar3.T() != 8) {
                                f fVar2 = eVar3.f27458f.f27771h;
                                fVar2.f27721k.add(this.f27771h);
                                this.f27771h.f27722l.add(fVar2);
                            }
                            i10++;
                        }
                    } else {
                        if (iR1 != 3) {
                            return;
                        }
                        this.f27771h.f27715e = f.a.BOTTOM;
                        while (i10 < aVar.M0) {
                            u.e eVar4 = aVar.L0[i10];
                            if (zQ1 || eVar4.T() != 8) {
                                f fVar3 = eVar4.f27458f.f27772i;
                                fVar3.f27721k.add(this.f27771h);
                                this.f27771h.f27722l.add(fVar3);
                            }
                            i10++;
                        }
                    }
                    q(this.f27765b.f27458f.f27771h);
                    pVar = this.f27765b.f27458f;
                    q(pVar.f27772i);
                }
                this.f27771h.f27715e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    u.e eVar5 = aVar.L0[i10];
                    if (zQ1 || eVar5.T() != 8) {
                        f fVar4 = eVar5.f27456e.f27772i;
                        fVar4.f27721k.add(this.f27771h);
                        this.f27771h.f27722l.add(fVar4);
                    }
                    i10++;
                }
            }
            q(this.f27765b.f27456e.f27771h);
            pVar = this.f27765b.f27456e;
            q(pVar.f27772i);
        }
    }

    @Override // v.p
    public void e() {
        u.e eVar = this.f27765b;
        if (eVar instanceof u.a) {
            int iR1 = ((u.a) eVar).r1();
            if (iR1 == 0 || iR1 == 1) {
                this.f27765b.i1(this.f27771h.f27717g);
            } else {
                this.f27765b.j1(this.f27771h.f27717g);
            }
        }
    }

    @Override // v.p
    void f() {
        this.f27766c = null;
        this.f27771h.c();
    }

    @Override // v.p
    boolean m() {
        return false;
    }
}
