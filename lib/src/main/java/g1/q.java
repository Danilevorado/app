package g1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f23726a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.b f23727b;

    public q(String str, androidx.work.b bVar) {
        rb.h.e(str, "workSpecId");
        rb.h.e(bVar, "progress");
        this.f23726a = str;
        this.f23727b = bVar;
    }

    public final androidx.work.b a() {
        return this.f23727b;
    }

    public final String b() {
        return this.f23726a;
    }
}
