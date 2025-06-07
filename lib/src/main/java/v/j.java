package v;

/* loaded from: classes.dex */
class j extends p {
    public j(u.e eVar) {
        super(eVar);
        eVar.f27456e.f();
        eVar.f27458f.f();
        this.f27769f = ((u.g) eVar).o1();
    }

    private void q(f fVar) {
        this.f27771h.f27721k.add(fVar);
        fVar.f27722l.add(this.f27771h);
    }

    @Override // v.p, v.d
    public void a(d dVar) {
        f fVar = this.f27771h;
        if (fVar.f27713c && !fVar.f27720j) {
            this.f27771h.d((int) ((((f) fVar.f27722l.get(0)).f27717g * ((u.g) this.f27765b).r1()) + 0.5f));
        }
    }

    @Override // v.p
    void d() {
        f fVar;
        p pVar;
        f fVar2;
        u.g gVar = (u.g) this.f27765b;
        int iP1 = gVar.p1();
        int iQ1 = gVar.q1();
        gVar.r1();
        if (gVar.o1() == 1) {
            f fVar3 = this.f27771h;
            if (iP1 != -1) {
                fVar3.f27722l.add(this.f27765b.f27449a0.f27456e.f27771h);
                this.f27765b.f27449a0.f27456e.f27771h.f27721k.add(this.f27771h);
                fVar2 = this.f27771h;
            } else if (iQ1 != -1) {
                fVar3.f27722l.add(this.f27765b.f27449a0.f27456e.f27772i);
                this.f27765b.f27449a0.f27456e.f27772i.f27721k.add(this.f27771h);
                fVar2 = this.f27771h;
                iP1 = -iQ1;
            } else {
                fVar3.f27712b = true;
                fVar3.f27722l.add(this.f27765b.f27449a0.f27456e.f27772i);
                this.f27765b.f27449a0.f27456e.f27772i.f27721k.add(this.f27771h);
                q(this.f27765b.f27456e.f27771h);
                pVar = this.f27765b.f27456e;
            }
            fVar2.f27716f = iP1;
            q(this.f27765b.f27456e.f27771h);
            pVar = this.f27765b.f27456e;
        } else {
            f fVar4 = this.f27771h;
            if (iP1 != -1) {
                fVar4.f27722l.add(this.f27765b.f27449a0.f27458f.f27771h);
                this.f27765b.f27449a0.f27458f.f27771h.f27721k.add(this.f27771h);
                fVar = this.f27771h;
            } else if (iQ1 != -1) {
                fVar4.f27722l.add(this.f27765b.f27449a0.f27458f.f27772i);
                this.f27765b.f27449a0.f27458f.f27772i.f27721k.add(this.f27771h);
                fVar = this.f27771h;
                iP1 = -iQ1;
            } else {
                fVar4.f27712b = true;
                fVar4.f27722l.add(this.f27765b.f27449a0.f27458f.f27772i);
                this.f27765b.f27449a0.f27458f.f27772i.f27721k.add(this.f27771h);
                q(this.f27765b.f27458f.f27771h);
                pVar = this.f27765b.f27458f;
            }
            fVar.f27716f = iP1;
            q(this.f27765b.f27458f.f27771h);
            pVar = this.f27765b.f27458f;
        }
        q(pVar.f27772i);
    }

    @Override // v.p
    public void e() {
        if (((u.g) this.f27765b).o1() == 1) {
            this.f27765b.i1(this.f27771h.f27717g);
        } else {
            this.f27765b.j1(this.f27771h.f27717g);
        }
    }

    @Override // v.p
    void f() {
        this.f27771h.c();
    }

    @Override // v.p
    boolean m() {
        return false;
    }
}
