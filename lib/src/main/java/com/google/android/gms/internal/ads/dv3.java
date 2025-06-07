package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class dv3 implements ev3 {

    /* renamed from: a, reason: collision with root package name */
    private final nv3 f7525a;

    @Override // com.google.android.gms.internal.ads.ev3
    public final Object o(String str) throws GeneralSecurityException {
        Iterator it = fv3.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f7525a.a(str, (Provider) it.next());
            } catch (Exception e5) {
                if (exc == null) {
                    exc = e5;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
