package u6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f27623h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f27624i = new a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f27625j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f27626k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f27627l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f27628m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f27629n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f27630o;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f27631a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f27632b;

    /* renamed from: c, reason: collision with root package name */
    private final b f27633c;

    /* renamed from: d, reason: collision with root package name */
    private final b f27634d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27635e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27636f;

    /* renamed from: g, reason: collision with root package name */
    private final int f27637g;

    static {
        a aVar = new a(67, 64, 1);
        f27625j = aVar;
        f27626k = new a(19, 16, 1);
        f27627l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f27628m = aVar2;
        f27629n = aVar2;
        f27630o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f27636f = i10;
        this.f27635e = i11;
        this.f27637g = i12;
        this.f27631a = new int[i11];
        this.f27632b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f27631a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f27632b[this.f27631a[i15]] = i15;
        }
        this.f27633c = new b(this, new int[]{0});
        this.f27634d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f27633c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    int c(int i10) {
        return this.f27631a[i10];
    }

    public int d() {
        return this.f27637g;
    }

    b e() {
        return this.f27634d;
    }

    public int f() {
        return this.f27635e;
    }

    b g() {
        return this.f27633c;
    }

    int h(int i10) {
        if (i10 != 0) {
            return this.f27631a[(this.f27635e - this.f27632b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int i(int i10) {
        if (i10 != 0) {
            return this.f27632b[i10];
        }
        throw new IllegalArgumentException();
    }

    int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f27631a;
        int[] iArr2 = this.f27632b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f27635e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f27636f) + ',' + this.f27635e + ')';
    }
}
