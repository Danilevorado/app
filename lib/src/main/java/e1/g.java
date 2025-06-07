package e1;

import android.os.Build;
import b1.k;
import g1.v;

/* loaded from: classes.dex */
public final class g extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f1.h hVar) {
        super(hVar);
        rb.h.e(hVar, "tracker");
    }

    @Override // e1.c
    public boolean b(v vVar) {
        rb.h.e(vVar, "workSpec");
        k kVarD = vVar.f23748j.d();
        return kVarD == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && kVarD == k.TEMPORARILY_UNMETERED);
    }

    @Override // e1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(d1.b bVar) {
        rb.h.e(bVar, "value");
        return !bVar.a() || bVar.b();
    }
}
