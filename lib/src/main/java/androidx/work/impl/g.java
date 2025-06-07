package androidx.work.impl;

/* loaded from: classes.dex */
public final class g extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    public static final g f4179c = new g();

    private g() {
        super(12, 13);
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        gVar.p("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.p("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
