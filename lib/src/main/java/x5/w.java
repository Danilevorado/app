package x5;

/* loaded from: classes.dex */
public class w implements h6.b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f28339c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f28340a = f28339c;

    /* renamed from: b, reason: collision with root package name */
    private volatile h6.b f28341b;

    public w(h6.b bVar) {
        this.f28341b = bVar;
    }

    @Override // h6.b
    public Object get() {
        Object obj = this.f28340a;
        Object obj2 = f28339c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f28340a;
                if (obj == obj2) {
                    obj = this.f28341b.get();
                    this.f28340a = obj;
                    this.f28341b = null;
                }
            }
        }
        return obj;
    }
}
