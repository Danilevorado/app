package j2;

/* loaded from: classes.dex */
public interface d {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: m, reason: collision with root package name */
        private final boolean f24409m;

        a(boolean z10) {
            this.f24409m = z10;
        }

        boolean b() {
            return this.f24409m;
        }
    }

    void a(c cVar);

    boolean b();

    boolean c(c cVar);

    d e();

    boolean f(c cVar);

    void g(c cVar);

    boolean k(c cVar);
}
