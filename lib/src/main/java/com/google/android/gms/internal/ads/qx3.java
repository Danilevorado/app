package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class qx3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile qx3 f14531b;

    /* renamed from: c, reason: collision with root package name */
    static final qx3 f14532c = new qx3(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f14533a = Collections.emptyMap();

    qx3(boolean z10) {
    }

    public static qx3 a() {
        return f14532c;
    }

    public static qx3 b() {
        qx3 qx3Var = f14531b;
        if (qx3Var != null) {
            return qx3Var;
        }
        synchronized (qx3.class) {
            qx3 qx3Var2 = f14531b;
            if (qx3Var2 != null) {
                return qx3Var2;
            }
            qx3 qx3VarA = wx3.a(qx3.class);
            f14531b = qx3VarA;
            return qx3VarA;
        }
    }

    public final ay3 c(jz3 jz3Var, int i10) {
        a5.a.a(this.f14533a.get(new px3(jz3Var, i10)));
        return null;
    }
}
