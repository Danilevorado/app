package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
abstract class y34 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17882a;

    y34(Map map) {
        this.f17882a = Collections.unmodifiableMap(map);
    }

    final Map a() {
        return this.f17882a;
    }
}
