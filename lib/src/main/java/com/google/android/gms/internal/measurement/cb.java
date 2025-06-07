package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class cb extends j {

    /* renamed from: o, reason: collision with root package name */
    private final bc f18885o;

    public cb(String str, bc bcVar) {
        super("internal.remoteConfig");
        this.f18885o = bcVar;
        this.f19020n.put("getValue", new ma(this, "getValue", bcVar));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        return q.f19193b;
    }
}
