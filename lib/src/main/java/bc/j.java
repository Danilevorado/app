package bc;

import yb.u;

/* loaded from: classes2.dex */
final class j extends u implements yb.j {

    /* renamed from: n, reason: collision with root package name */
    private final Throwable f4622n;

    /* renamed from: o, reason: collision with root package name */
    private final String f4623o;

    public j(Throwable th, String str) {
        this.f4622n = th;
        this.f4623o = str;
    }

    private final Void W() {
        String strJ;
        if (this.f4622n == null) {
            i.d();
            throw new hb.c();
        }
        String str = this.f4623o;
        String str2 = "";
        if (str != null && (strJ = rb.h.j(". ", str)) != null) {
            str2 = strJ;
        }
        throw new IllegalStateException(rb.h.j("Module with the Main dispatcher had failed to initialize", str2), this.f4622n);
    }

    @Override // yb.c
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void c(kb.e eVar, Runnable runnable) {
        W();
        throw new hb.c();
    }

    @Override // yb.c
    public boolean e(kb.e eVar) {
        W();
        throw new hb.c();
    }

    @Override // yb.c
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        Throwable th = this.f4622n;
        sb2.append(th != null ? rb.h.j(", cause=", th) : "");
        sb2.append(']');
        return sb2.toString();
    }

    @Override // yb.u
    public u y() {
        return this;
    }
}
