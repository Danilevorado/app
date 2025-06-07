package androidx.work.impl;

/* loaded from: classes.dex */
public final class m extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final m f4215c = new m();

    private m() {
        super(8, 9);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
