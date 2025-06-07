package t2;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    private static final c f27334b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f27335a;

    private c(Object obj) {
        this.f27335a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // gb.a
    public Object get() {
        return this.f27335a;
    }
}
