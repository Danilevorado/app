package androidx.lifecycle;

import androidx.lifecycle.j;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements l {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f3087a;

    public SavedStateHandleAttacher(a0 a0Var) {
        rb.h.e(a0Var, "provider");
        this.f3087a = a0Var;
    }

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) {
        rb.h.e(nVar, "source");
        rb.h.e(bVar, "event");
        if (bVar == j.b.ON_CREATE) {
            nVar.s().c(this);
            this.f3087a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
        }
    }
}
