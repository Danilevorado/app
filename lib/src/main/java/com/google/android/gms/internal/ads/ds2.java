package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class ds2 {

    /* renamed from: d, reason: collision with root package name */
    private static final ab3 f7494d = qa3.h(null);

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f7495a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f7496b;

    /* renamed from: c, reason: collision with root package name */
    private final es2 f7497c;

    public ds2(bb3 bb3Var, ScheduledExecutorService scheduledExecutorService, es2 es2Var) {
        this.f7495a = bb3Var;
        this.f7496b = scheduledExecutorService;
        this.f7497c = es2Var;
    }

    public final tr2 a(Object obj, ab3... ab3VarArr) {
        return new tr2(this, obj, Arrays.asList(ab3VarArr), null);
    }

    public final cs2 b(Object obj, ab3 ab3Var) {
        return new cs2(this, obj, ab3Var, Collections.singletonList(ab3Var), ab3Var);
    }

    protected abstract String f(Object obj);
}
