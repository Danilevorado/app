package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class rz3 {

    /* renamed from: c, reason: collision with root package name */
    private static final rz3 f15021c = new rz3();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f15023b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final e04 f15022a = new cz3();

    private rz3() {
    }

    public static rz3 a() {
        return f15021c;
    }

    public final d04 b(Class cls) {
        ly3.c(cls, "messageType");
        d04 d04VarA = (d04) this.f15023b.get(cls);
        if (d04VarA == null) {
            d04VarA = this.f15022a.a(cls);
            ly3.c(cls, "messageType");
            ly3.c(d04VarA, "schema");
            d04 d04Var = (d04) this.f15023b.putIfAbsent(cls, d04VarA);
            if (d04Var != null) {
                return d04Var;
            }
        }
        return d04VarA;
    }
}
