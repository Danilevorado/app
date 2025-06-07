package yb;

/* loaded from: classes2.dex */
final class k extends RuntimeException {

    /* renamed from: m, reason: collision with root package name */
    private final kb.e f28608m;

    public k(kb.e eVar) {
        this.f28608m = eVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f28608m.toString();
    }
}
