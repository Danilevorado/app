package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class bd3 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f6434a = new CopyOnWriteArrayList();

    public static ad3 a(String str) throws GeneralSecurityException {
        Iterator it = f6434a.iterator();
        while (it.hasNext()) {
            ad3 ad3Var = (ad3) it.next();
            if (ad3Var.a()) {
                return ad3Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
