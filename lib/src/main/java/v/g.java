package v;

import v.f;

/* loaded from: classes.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f27732m;

    public g(p pVar) {
        super(pVar);
        this.f27715e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // v.f
    public void d(int i10) {
        if (this.f27720j) {
            return;
        }
        this.f27720j = true;
        this.f27717g = i10;
        for (d dVar : this.f27721k) {
            dVar.a(dVar);
        }
    }
}
