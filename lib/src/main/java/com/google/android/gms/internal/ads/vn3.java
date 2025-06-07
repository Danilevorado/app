package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class vn3 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f16819a = new HashMap();

    public final xn3 a() {
        if (this.f16819a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        xn3 xn3Var = new xn3(Collections.unmodifiableMap(this.f16819a), null);
        this.f16819a = null;
        return xn3Var;
    }
}
