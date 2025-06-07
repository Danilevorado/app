package w9;

/* loaded from: classes2.dex */
public enum l {
    DEFAULT_MODE(0),
    NO_VIBRATE(1),
    ALWAYS(2);


    /* renamed from: m, reason: collision with root package name */
    private final int f28081m;

    l(int i10) {
        this.f28081m = i10;
    }

    public static l b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? DEFAULT_MODE : ALWAYS : NO_VIBRATE : DEFAULT_MODE;
    }

    public int d() {
        return this.f28081m;
    }
}
