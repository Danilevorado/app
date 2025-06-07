package androidx.work.impl;

/* loaded from: classes.dex */
public final class i extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final i f4211c = new i();

    private i() {
        super(3, 4);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
