package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ee extends j {

    /* renamed from: o, reason: collision with root package name */
    private final Callable f18931o;

    public ee(String str, Callable callable) {
        super("internal.appMetadata");
        this.f18931o = callable;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        try {
            return t6.b(this.f18931o.call());
        } catch (Exception unused) {
            return q.f19193b;
        }
    }
}
