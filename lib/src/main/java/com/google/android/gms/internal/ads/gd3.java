package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class gd3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8682a;

    /* renamed from: c, reason: collision with root package name */
    private hd3 f8684c;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap f8683b = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private xn3 f8685d = xn3.f17644b;

    /* synthetic */ gd3(Class cls, fd3 fd3Var) {
        this.f8682a = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.gd3 e(java.lang.Object r14, java.lang.Object r15, com.google.android.gms.internal.ads.at3 r16, boolean r17) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gd3.e(java.lang.Object, java.lang.Object, com.google.android.gms.internal.ads.at3, boolean):com.google.android.gms.internal.ads.gd3");
    }

    public final gd3 a(Object obj, Object obj2, at3 at3Var) {
        e(obj, obj2, at3Var, false);
        return this;
    }

    public final gd3 b(Object obj, Object obj2, at3 at3Var) {
        e(obj, obj2, at3Var, true);
        return this;
    }

    public final gd3 c(xn3 xn3Var) {
        if (this.f8683b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f8685d = xn3Var;
        return this;
    }

    public final md3 d() {
        ConcurrentMap concurrentMap = this.f8683b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        md3 md3Var = new md3(concurrentMap, this.f8684c, this.f8685d, this.f8682a, null);
        this.f8683b = null;
        return md3Var;
    }
}
