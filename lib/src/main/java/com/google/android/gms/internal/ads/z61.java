package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class z61 {

    /* renamed from: m, reason: collision with root package name */
    protected final Map f18446m = new HashMap();

    protected z61(Set set) {
        p0(set);
    }

    public final synchronized void m0(x81 x81Var) {
        o0(x81Var.f17472a, x81Var.f17473b);
    }

    public final synchronized void o0(Object obj, Executor executor) {
        this.f18446m.put(obj, executor);
    }

    public final synchronized void p0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m0((x81) it.next());
        }
    }

    protected final synchronized void q0(final y61 y61Var) {
        for (Map.Entry entry : this.f18446m.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.x61
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        y61Var.a(key);
                    } catch (Throwable th) {
                        j3.t.q().t(th, "EventEmitter.notify");
                        m3.n1.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
