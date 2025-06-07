package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class vt {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f16849a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f16850b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    static final AtomicBoolean f16851c = new AtomicBoolean();

    static tt a() {
        return (tt) f16849a.get();
    }

    static ut b() {
        return (ut) f16850b.get();
    }

    public static void c(tt ttVar) {
        f16849a.set(ttVar);
    }
}
