package androidx.lifecycle;

import androidx.lifecycle.j;

/* loaded from: classes.dex */
final class SavedStateHandleController implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f3088a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3089b = false;

    /* renamed from: c, reason: collision with root package name */
    private final y f3090c;

    SavedStateHandleController(String str, y yVar) {
        this.f3088a = str;
        this.f3090c = yVar;
    }

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) {
        if (bVar == j.b.ON_DESTROY) {
            this.f3089b = false;
            nVar.s().c(this);
        }
    }

    void h(t0.c cVar, j jVar) {
        if (this.f3089b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3089b = true;
        jVar.a(this);
        cVar.h(this.f3088a, this.f3090c.d());
    }

    y i() {
        return this.f3090c;
    }

    boolean j() {
        return this.f3089b;
    }
}
