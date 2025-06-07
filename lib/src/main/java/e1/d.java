package e1;

import android.os.Build;
import b1.k;
import g1.v;

/* loaded from: classes.dex */
public final class d extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f1.h hVar) {
        super(hVar);
        rb.h.e(hVar, "tracker");
    }

    @Override // e1.c
    public boolean b(v vVar) {
        rb.h.e(vVar, "workSpec");
        return vVar.f23748j.d() == k.CONNECTED;
    }

    @Override // e1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(d1.b bVar) {
        rb.h.e(bVar, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar.a() || !bVar.d()) {
                return true;
            }
        } else if (!bVar.a()) {
            return true;
        }
        return false;
    }
}
