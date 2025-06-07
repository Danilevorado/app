package o2;

/* loaded from: classes.dex */
public abstract class c {

    private static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f25702a;

        b() {
            super();
        }

        @Override // o2.c
        public void b(boolean z10) {
            this.f25702a = z10;
        }

        @Override // o2.c
        public void c() {
            if (this.f25702a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private c() {
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();
}
