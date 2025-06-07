package androidx.work.impl;

/* loaded from: classes.dex */
public final class l extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final l f4214c = new l();

    private l() {
        super(7, 8);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
