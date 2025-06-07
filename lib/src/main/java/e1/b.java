package e1;

import g1.v;

/* loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f1.c cVar) {
        super(cVar);
        rb.h.e(cVar, "tracker");
    }

    @Override // e1.c
    public boolean b(v vVar) {
        rb.h.e(vVar, "workSpec");
        return vVar.f23748j.f();
    }

    @Override // e1.c
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return i(((Boolean) obj).booleanValue());
    }

    public boolean i(boolean z10) {
        return !z10;
    }
}
