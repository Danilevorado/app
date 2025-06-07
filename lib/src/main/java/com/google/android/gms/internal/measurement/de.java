package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class de extends j {

    /* renamed from: o, reason: collision with root package name */
    private final be f18906o;

    public de(be beVar) {
        super("internal.logger");
        this.f18906o = beVar;
        this.f19020n.put("log", new ce(this, false, true));
        this.f19020n.put("silent", new cd(this, "silent"));
        ((j) this.f19020n.get("silent")).n0("log", new ce(this, true, true));
        this.f19020n.put("unmonitored", new ae(this, "unmonitored"));
        ((j) this.f19020n.get("unmonitored")).n0("log", new ce(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        return q.f19193b;
    }
}
