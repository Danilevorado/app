package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ys3 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18264a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f18265b;

    public final synchronized Map a() {
        if (this.f18265b == null) {
            this.f18265b = Collections.unmodifiableMap(new HashMap(this.f18264a));
        }
        return this.f18265b;
    }
}
