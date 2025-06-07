package x2;

/* loaded from: classes.dex */
public final class g implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    private final gb.a f28241a;

    public g(gb.a aVar) {
        this.f28241a = aVar;
    }

    public static y2.f a(b3.a aVar) {
        return (y2.f) t2.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(gb.a aVar) {
        return new g(aVar);
    }

    @Override // gb.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public y2.f get() {
        return a((b3.a) this.f28241a.get());
    }
}
