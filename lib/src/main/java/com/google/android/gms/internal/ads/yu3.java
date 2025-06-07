package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class yu3 implements ev3 {

    /* renamed from: a, reason: collision with root package name */
    private final nv3 f18276a;

    @Override // com.google.android.gms.internal.ads.ev3
    public final Object o(String str) {
        Iterator it = fv3.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f18276a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f18276a.a(str, null);
    }
}
