package androidx.work.impl;

/* loaded from: classes.dex */
public final class f extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final f f4149c = new f();

    private f() {
        super(11, 12);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
