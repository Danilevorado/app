package a2;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f32a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final l f33b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final l f34c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final l f35d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final l f36e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f37f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f38g;

    /* renamed from: h, reason: collision with root package name */
    public static final r1.g f39h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f40i;

    private static class a extends l {
        a() {
        }

        @Override // a2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // a2.l
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    private static class b extends l {
        b() {
        }

        @Override // a2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // a2.l
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    private static class c extends l {
        c() {
        }

        @Override // a2.l
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : l.f34c.a(i10, i11, i12, i13);
        }

        @Override // a2.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, l.f34c.b(i10, i11, i12, i13));
        }
    }

    private static class d extends l {
        d() {
        }

        @Override // a2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // a2.l
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    private static class e extends l {
        e() {
        }

        @Override // a2.l
        public g a(int i10, int i11, int i12, int i13) {
            return l.f40i ? g.QUALITY : g.MEMORY;
        }

        @Override // a2.l
        public float b(int i10, int i11, int i12, int i13) {
            if (l.f40i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    private static class f extends l {
        f() {
        }

        @Override // a2.l
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // a2.l
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f36e = dVar;
        f37f = new f();
        f38g = dVar;
        f39h = r1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f40i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
