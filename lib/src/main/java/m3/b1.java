package m3;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private long f25194a;

    /* renamed from: b, reason: collision with root package name */
    private long f25195b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25196c = new Object();

    public b1(long j10) {
        this.f25194a = j10;
    }

    public final void a(long j10) {
        synchronized (this.f25196c) {
            this.f25194a = j10;
        }
    }

    public final boolean b() {
        synchronized (this.f25196c) {
            long jB = j3.t.b().b();
            if (this.f25195b + this.f25194a > jB) {
                return false;
            }
            this.f25195b = jB;
            return true;
        }
    }
}
