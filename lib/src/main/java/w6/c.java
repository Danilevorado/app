package w6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
abstract class c {

    /* renamed from: m, reason: collision with root package name */
    public static final c f27951m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f27952n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f27953o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f27954p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f27955q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f27956r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f27957s;

    /* renamed from: t, reason: collision with root package name */
    public static final c f27958t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ c[] f27959u;

    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // w6.c
        boolean b(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f27951m = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: w6.c.b
            {
                a aVar2 = null;
            }

            @Override // w6.c
            boolean b(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f27952n = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: w6.c.c
            {
                a aVar2 = null;
            }

            @Override // w6.c
            boolean b(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f27953o = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: w6.c.d
            {
                a aVar2 = null;
            }

            @Override // w6.c
            boolean b(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f27954p = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: w6.c.e
            {
                a aVar2 = null;
            }

            @Override // w6.c
            boolean b(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f27955q = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: w6.c.f
            {
                a aVar2 = null;
            }

            @Override // w6.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f27956r = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: w6.c.g
            {
                a aVar2 = null;
            }

            @Override // w6.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f27957s = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: w6.c.h
            {
                a aVar2 = null;
            }

            @Override // w6.c
            boolean b(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        f27958t = cVar7;
        f27959u = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i10) {
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f27959u.clone();
    }

    abstract boolean b(int i10, int i11);

    final void d(s6.a aVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (b(i11, i12)) {
                    aVar.c(i12, i11);
                }
            }
        }
    }
}
