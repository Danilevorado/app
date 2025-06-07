package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class jk3 {

    /* renamed from: a, reason: collision with root package name */
    public static final yn3 f10546a = new ik3(null);

    public static eo3 a(md3 md3Var) {
        qc3 qc3Var;
        ao3 ao3Var = new ao3();
        ao3Var.b(md3Var.b());
        Iterator it = md3Var.d().iterator();
        while (it.hasNext()) {
            for (hd3 hd3Var : (List) it.next()) {
                int iH = hd3Var.h() - 2;
                if (iH == 1) {
                    qc3Var = qc3.f14237b;
                } else if (iH == 2) {
                    qc3Var = qc3.f14238c;
                } else {
                    if (iH != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    qc3Var = qc3.f14239d;
                }
                int iA = hd3Var.a();
                String strF = hd3Var.f();
                if (strF.startsWith("type.googleapis.com/google.crypto.")) {
                    strF = strF.substring(34);
                }
                ao3Var.a(qc3Var, iA, strF, hd3Var.c().name());
            }
        }
        if (md3Var.a() != null) {
            ao3Var.c(md3Var.a().a());
        }
        try {
            return ao3Var.d();
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }
}
