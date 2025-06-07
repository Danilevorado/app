package b1;

/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f4363a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0076b f4364b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f4365a;

            public a(Throwable th) {
                this.f4365a = th;
            }

            public Throwable a() {
                return this.f4365a;
            }

            public String toString() {
                return "FAILURE (" + this.f4365a.getMessage() + ")";
            }
        }

        /* renamed from: b1.m$b$b, reason: collision with other inner class name */
        public static final class C0076b extends b {
            private C0076b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }

    static {
        f4363a = new b.c();
        f4364b = new b.C0076b();
    }
}
