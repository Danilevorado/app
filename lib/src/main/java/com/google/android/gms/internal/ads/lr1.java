package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class lr1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11832a;

    public lr1(q44 q44Var) {
        this.f11832a = q44Var;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo b() {
        ApplicationInfo applicationInfo = ((Context) this.f11832a.b()).getApplicationInfo();
        k44.b(applicationInfo);
        return applicationInfo;
    }
}
