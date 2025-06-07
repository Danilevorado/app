package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class sf implements az2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ yw2 f15212a;

    sf(uf ufVar, yw2 yw2Var) {
        this.f15212a = yw2Var;
    }

    @Override // com.google.android.gms.internal.ads.az2
    public final boolean a(File file) {
        try {
            return this.f15212a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
