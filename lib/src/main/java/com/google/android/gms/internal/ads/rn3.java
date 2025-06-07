package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class rn3 implements nd3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f14852a = Logger.getLogger(rn3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f14853b = {0};

    /* renamed from: c, reason: collision with root package name */
    private static final rn3 f14854c = new rn3();

    rn3() {
    }

    public static void e() {
        qd3.l(f14854c);
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final Class a() {
        return cd3.class;
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final Class b() {
        return cd3.class;
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final /* bridge */ /* synthetic */ Object c(md3 md3Var) throws GeneralSecurityException {
        Iterator it = md3Var.d().iterator();
        while (it.hasNext()) {
            for (hd3 hd3Var : (List) it.next()) {
                if (hd3Var.b() instanceof nn3) {
                    nn3 nn3Var = (nn3) hd3Var.b();
                    cw3 cw3VarB = cw3.b(hd3Var.g());
                    if (!cw3VarB.equals(nn3Var.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(nn3Var.a()) + " has wrong output prefix (" + nn3Var.b().toString() + ") instead of (" + cw3VarB.toString() + ")");
                    }
                }
            }
        }
        return new qn3(md3Var, null);
    }
}
