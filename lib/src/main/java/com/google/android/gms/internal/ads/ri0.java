package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ri0 implements Iterable {

    /* renamed from: m, reason: collision with root package name */
    private final List f14790m = new ArrayList();

    final qi0 e(lh0 lh0Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            qi0 qi0Var = (qi0) it.next();
            if (qi0Var.f14329c == lh0Var) {
                return qi0Var;
            }
        }
        return null;
    }

    public final void f(qi0 qi0Var) {
        this.f14790m.add(qi0Var);
    }

    public final void h(qi0 qi0Var) {
        this.f14790m.remove(qi0Var);
    }

    public final boolean i(lh0 lh0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            qi0 qi0Var = (qi0) it.next();
            if (qi0Var.f14329c == lh0Var) {
                arrayList.add(qi0Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((qi0) it2.next()).f14330d.j();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14790m.iterator();
    }
}
