package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dn1 extends fn1 {

    /* renamed from: i, reason: collision with root package name */
    private final et2 f7416i;

    public dn1(Executor executor, ef0 ef0Var, et2 et2Var, gt2 gt2Var) {
        super(executor, ef0Var, gt2Var);
        this.f7416i = et2Var;
        et2Var.a(this.f8337b);
    }

    public final Map f() {
        return new HashMap(this.f8337b);
    }
}
