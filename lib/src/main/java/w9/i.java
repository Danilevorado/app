package w9;

/* loaded from: classes2.dex */
public enum i {
    DEFAULT_MODE(0),
    NO_SOUND(1),
    ALWAYS(2);


    /* renamed from: m, reason: collision with root package name */
    private final int f28071m;

    i(int i10) {
        this.f28071m = i10;
    }

    public static i b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? DEFAULT_MODE : ALWAYS : NO_SOUND : DEFAULT_MODE;
    }

    public int d() {
        return this.f28071m;
    }
}
