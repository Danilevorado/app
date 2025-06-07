package g3;

import d3.x;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23847a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23848b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23849c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23850d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23851e;

    /* renamed from: f, reason: collision with root package name */
    private final x f23852f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23853g;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private x f23858e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f23854a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f23855b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f23856c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f23857d = false;

        /* renamed from: f, reason: collision with root package name */
        private int f23859f = 1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f23860g = false;

        public e a() {
            return new e(this, null);
        }

        public a b(int i10) {
            this.f23859f = i10;
            return this;
        }

        public a c(int i10) {
            this.f23855b = i10;
            return this;
        }

        public a d(int i10) {
            this.f23856c = i10;
            return this;
        }

        public a e(boolean z10) {
            this.f23860g = z10;
            return this;
        }

        public a f(boolean z10) {
            this.f23857d = z10;
            return this;
        }

        public a g(boolean z10) {
            this.f23854a = z10;
            return this;
        }

        public a h(x xVar) {
            this.f23858e = xVar;
            return this;
        }
    }

    /* synthetic */ e(a aVar, k kVar) {
        this.f23847a = aVar.f23854a;
        this.f23848b = aVar.f23855b;
        this.f23849c = aVar.f23856c;
        this.f23850d = aVar.f23857d;
        this.f23851e = aVar.f23859f;
        this.f23852f = aVar.f23858e;
        this.f23853g = aVar.f23860g;
    }

    public int a() {
        return this.f23851e;
    }

    public int b() {
        return this.f23848b;
    }

    public int c() {
        return this.f23849c;
    }

    public x d() {
        return this.f23852f;
    }

    public boolean e() {
        return this.f23850d;
    }

    public boolean f() {
        return this.f23847a;
    }

    public final boolean g() {
        return this.f23853g;
    }
}
