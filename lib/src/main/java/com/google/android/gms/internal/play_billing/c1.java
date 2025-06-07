package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c1 f19464b;

    /* renamed from: c, reason: collision with root package name */
    static final c1 f19465c = new c1(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f19466a = Collections.emptyMap();

    c1(boolean z10) {
    }

    public static c1 a() {
        c1 c1Var = f19464b;
        if (c1Var != null) {
            return c1Var;
        }
        synchronized (c1.class) {
            c1 c1Var2 = f19464b;
            if (c1Var2 != null) {
                return c1Var2;
            }
            c1 c1VarA = j1.a(c1.class);
            f19464b = c1VarA;
            return c1VarA;
        }
    }

    public final m1 b(u2 u2Var, int i10) {
        a5.a.a(this.f19466a.get(new b1(u2Var, i10)));
        return null;
    }
}
