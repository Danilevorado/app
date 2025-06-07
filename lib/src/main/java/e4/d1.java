package e4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d1 extends o0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f23111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, null);
        this.f23111g = cVar;
    }

    @Override // e4.o0
    protected final void f(b4.b bVar) {
        if (this.f23111g.x() && c.l0(this.f23111g)) {
            c.h0(this.f23111g, 16);
        } else {
            this.f23111g.f23093p.a(bVar);
            this.f23111g.P(bVar);
        }
    }

    @Override // e4.o0
    protected final boolean g() {
        this.f23111g.f23093p.a(b4.b.f4399q);
        return true;
    }
}
