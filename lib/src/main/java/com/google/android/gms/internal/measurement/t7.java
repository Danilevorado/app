package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class t7 {

    /* renamed from: a, reason: collision with root package name */
    final Map f19318a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f19318a.put(str, callable);
    }
}
