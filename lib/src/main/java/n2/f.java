package n2;

/* loaded from: classes.dex */
public abstract class f {

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private volatile Object f25494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f25495b;

        a(b bVar) {
            this.f25495b = bVar;
        }

        @Override // n2.f.b
        public Object get() {
            if (this.f25494a == null) {
                synchronized (this) {
                    if (this.f25494a == null) {
                        this.f25494a = k.d(this.f25495b.get());
                    }
                }
            }
            return this.f25494a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
