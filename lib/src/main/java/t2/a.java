package t2;

/* loaded from: classes.dex */
public final class a implements gb.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f27331c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile gb.a f27332a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f27333b = f27331c;

    private a(gb.a aVar) {
        this.f27332a = aVar;
    }

    public static gb.a a(gb.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f27331c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // gb.a
    public Object get() {
        Object obj = this.f27333b;
        Object obj2 = f27331c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f27333b;
                if (obj == obj2) {
                    obj = this.f27332a.get();
                    this.f27333b = b(this.f27333b, obj);
                    this.f27332a = null;
                }
            }
        }
        return obj;
    }
}
