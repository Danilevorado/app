package w6;

/* loaded from: classes.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* renamed from: r, reason: collision with root package name */
    private static final f[] f27966r;

    /* renamed from: m, reason: collision with root package name */
    private final int f27968m;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        f27966r = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i10) {
        this.f27968m = i10;
    }

    public static f b(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = f27966r;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }
}
