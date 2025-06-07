package androidx.lifecycle;

import androidx.lifecycle.j;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements l {

    /* renamed from: a, reason: collision with root package name */
    private final g[] f3059a;

    CompositeGeneratedAdaptersObserver(g[] gVarArr) {
        this.f3059a = gVarArr;
    }

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) {
        r rVar = new r();
        for (g gVar : this.f3059a) {
            gVar.a(nVar, bVar, false, rVar);
        }
        for (g gVar2 : this.f3059a) {
            gVar2.a(nVar, bVar, true, rVar);
        }
    }
}
