package androidx.work.impl;

/* loaded from: classes.dex */
public final class k extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k f4213c = new k();

    private k() {
        super(6, 7);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
