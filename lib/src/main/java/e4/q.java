package e4;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    private static q f23217b;

    /* renamed from: c, reason: collision with root package name */
    private static final r f23218c = new r(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private r f23219a;

    private q() {
    }

    public static synchronized q b() {
        if (f23217b == null) {
            f23217b = new q();
        }
        return f23217b;
    }

    public r a() {
        return this.f23219a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f23219a = f23218c;
            return;
        }
        r rVar2 = this.f23219a;
        if (rVar2 == null || rVar2.y() < rVar.y()) {
            this.f23219a = rVar;
        }
    }
}
