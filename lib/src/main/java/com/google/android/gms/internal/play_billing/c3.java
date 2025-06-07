package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class c3 {

    /* renamed from: c, reason: collision with root package name */
    private static final c3 f19467c = new c3();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f19469b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g3 f19468a = new n2();

    private c3() {
    }

    public static c3 a() {
        return f19467c;
    }

    public final f3 b(Class cls) {
        v1.c(cls, "messageType");
        f3 f3VarA = (f3) this.f19469b.get(cls);
        if (f3VarA == null) {
            f3VarA = this.f19468a.a(cls);
            v1.c(cls, "messageType");
            f3 f3Var = (f3) this.f19469b.putIfAbsent(cls, f3VarA);
            if (f3Var != null) {
                return f3Var;
            }
        }
        return f3VarA;
    }
}
