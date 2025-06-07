package androidx.work.impl;

/* loaded from: classes.dex */
public final class j extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final j f4212c = new j();

    private j() {
        super(4, 5);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.p("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
