package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xm1 {

    /* renamed from: a, reason: collision with root package name */
    private final dn1 f17633a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17634b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f17635c;

    public xm1(dn1 dn1Var, Executor executor) {
        this.f17633a = dn1Var;
        this.f17635c = dn1Var.f();
        this.f17634b = executor;
    }

    public final wm1 a() {
        wm1 wm1Var = new wm1(this);
        wm1.a(wm1Var);
        return wm1Var;
    }
}
