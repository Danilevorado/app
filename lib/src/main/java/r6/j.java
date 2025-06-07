package r6;

/* loaded from: classes.dex */
public abstract class j extends Exception {

    /* renamed from: m, reason: collision with root package name */
    protected static final boolean f26626m;

    /* renamed from: n, reason: collision with root package name */
    protected static final StackTraceElement[] f26627n;

    static {
        f26626m = System.getProperty("surefire.test.class.path") != null;
        f26627n = new StackTraceElement[0];
    }

    j() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
