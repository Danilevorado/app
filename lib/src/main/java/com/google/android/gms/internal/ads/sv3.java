package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class sv3 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ tv3 f15575a;

    sv3(tv3 tv3Var) {
        this.f15575a = tv3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac mac = (Mac) fv3.f8457c.a(this.f15575a.f16072b);
            mac.init(this.f15575a.f16073c);
            return mac;
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }
}
