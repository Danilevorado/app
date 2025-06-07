package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class dj0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f7336a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f7337b;

    dj0() {
    }

    final long a() throws NumberFormatException {
        Iterator it = this.f7336a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((rj3) it.next()).c().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f7337b = Math.max(this.f7337b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f7337b;
    }

    final void b(rj3 rj3Var) {
        this.f7336a.add(rj3Var);
    }
}
