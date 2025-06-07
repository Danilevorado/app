package kotlinx.coroutines.scheduling;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: t, reason: collision with root package name */
    public static final c f24988t = new c();

    private c() {
        super(l.f25000b, l.f25001c, l.f25002d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // yb.c
    public String toString() {
        return "Dispatchers.Default";
    }
}
