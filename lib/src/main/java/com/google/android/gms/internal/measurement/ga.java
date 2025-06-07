package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class ga {

    /* renamed from: c, reason: collision with root package name */
    private static final ga f18960c = new ga();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f18962b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final ka f18961a = new r9();

    private ga() {
    }

    public static ga a() {
        return f18960c;
    }

    public final ja b(Class cls) {
        b9.f(cls, "messageType");
        ja jaVarA = (ja) this.f18962b.get(cls);
        if (jaVarA == null) {
            jaVarA = this.f18961a.a(cls);
            b9.f(cls, "messageType");
            b9.f(jaVarA, "schema");
            ja jaVar = (ja) this.f18962b.putIfAbsent(cls, jaVarA);
            if (jaVar != null) {
                return jaVar;
            }
        }
        return jaVarA;
    }
}
