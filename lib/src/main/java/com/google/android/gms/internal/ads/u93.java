package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class u93 extends y83 {

    /* renamed from: v, reason: collision with root package name */
    private static final q93 f16239v;

    /* renamed from: w, reason: collision with root package name */
    private static final Logger f16240w = Logger.getLogger(u93.class.getName());

    /* renamed from: t, reason: collision with root package name */
    private volatile Set<Throwable> f16241t = null;

    /* renamed from: u, reason: collision with root package name */
    private volatile int f16242u;

    static {
        Throwable th;
        q93 t93Var;
        s93 s93Var = null;
        try {
            t93Var = new r93(AtomicReferenceFieldUpdater.newUpdater(u93.class, Set.class, "t"), AtomicIntegerFieldUpdater.newUpdater(u93.class, "u"));
            th = null;
        } catch (Error | RuntimeException e5) {
            th = e5;
            t93Var = new t93(s93Var);
        }
        f16239v = t93Var;
        if (th != null) {
            f16240w.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    u93(int i10) {
        this.f16242u = i10;
    }

    final int E() {
        return f16239v.a(this);
    }

    final Set G() {
        Set<Throwable> set = this.f16241t;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        K(setNewSetFromMap);
        f16239v.b(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.f16241t;
        set2.getClass();
        return set2;
    }

    final void J() {
        this.f16241t = null;
    }

    abstract void K(Set set);
}
