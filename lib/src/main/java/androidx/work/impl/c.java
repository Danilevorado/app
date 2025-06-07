package androidx.work.impl;

import androidx.room.i0;

/* loaded from: classes.dex */
public final class c extends i0.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4131a = new c();

    private c() {
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.i0.b
    public void c(u0.g gVar) {
        rb.h.e(gVar, "db");
        super.c(gVar);
        gVar.j();
        try {
            gVar.p(e());
            gVar.H();
        } finally {
            gVar.i();
        }
    }

    public final long d() {
        return System.currentTimeMillis() - y.f4297a;
    }
}
