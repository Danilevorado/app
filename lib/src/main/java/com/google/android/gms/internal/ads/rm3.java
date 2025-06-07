package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class rm3 implements nd3 {

    /* renamed from: a, reason: collision with root package name */
    private static final rm3 f14845a = new rm3();

    private rm3() {
    }

    static void d() {
        qd3.l(f14845a);
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final Class a() {
        return om3.class;
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final Class b() {
        return om3.class;
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final /* bridge */ /* synthetic */ Object c(md3 md3Var) throws GeneralSecurityException {
        if (md3Var.a() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = md3Var.d().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((hd3) it2.next()).d();
            }
        }
        return new qm3(md3Var, null);
    }
}
