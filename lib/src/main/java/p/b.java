package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class b implements d {
    b() {
    }

    private e o(c cVar) {
        return (e) cVar.f();
    }

    @Override // p.d
    public void a(c cVar, ColorStateList colorStateList) {
        o(cVar).f(colorStateList);
    }

    @Override // p.d
    public ColorStateList b(c cVar) {
        return o(cVar).b();
    }

    @Override // p.d
    public void c(c cVar, Context context, ColorStateList colorStateList, float f5, float f10, float f11) {
        cVar.c(new e(colorStateList, f5));
        View viewA = cVar.a();
        viewA.setClipToOutline(true);
        viewA.setElevation(f10);
        l(cVar, f11);
    }

    @Override // p.d
    public float d(c cVar) {
        return e(cVar) * 2.0f;
    }

    @Override // p.d
    public float e(c cVar) {
        return o(cVar).d();
    }

    @Override // p.d
    public void f(c cVar) {
        l(cVar, j(cVar));
    }

    @Override // p.d
    public void g() {
    }

    @Override // p.d
    public float h(c cVar) {
        return e(cVar) * 2.0f;
    }

    @Override // p.d
    public float i(c cVar) {
        return cVar.a().getElevation();
    }

    @Override // p.d
    public float j(c cVar) {
        return o(cVar).c();
    }

    @Override // p.d
    public void k(c cVar, float f5) {
        cVar.a().setElevation(f5);
    }

    @Override // p.d
    public void l(c cVar, float f5) {
        o(cVar).g(f5, cVar.e(), cVar.d());
        p(cVar);
    }

    @Override // p.d
    public void m(c cVar, float f5) {
        o(cVar).h(f5);
    }

    @Override // p.d
    public void n(c cVar) {
        l(cVar, j(cVar));
    }

    public void p(c cVar) {
        if (!cVar.e()) {
            cVar.b(0, 0, 0, 0);
            return;
        }
        float fJ = j(cVar);
        float fE = e(cVar);
        int iCeil = (int) Math.ceil(f.a(fJ, fE, cVar.d()));
        int iCeil2 = (int) Math.ceil(f.b(fJ, fE, cVar.d()));
        cVar.b(iCeil, iCeil2, iCeil, iCeil2);
    }
}
