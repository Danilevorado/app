package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class vi {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16717a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            if (!this.f16717a.containsKey(str)) {
                this.f16717a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f16717a.get(str);
    }
}
