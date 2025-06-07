package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class x34 {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap f17378a;

    x34(int i10) {
        this.f17378a = z34.b(i10);
    }

    final x34 a(Object obj, q44 q44Var) {
        LinkedHashMap linkedHashMap = this.f17378a;
        k44.a(obj, "key");
        k44.a(q44Var, "provider");
        linkedHashMap.put(obj, q44Var);
        return this;
    }
}
