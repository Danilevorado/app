package f6;

/* loaded from: classes.dex */
public interface k {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: m, reason: collision with root package name */
        private final int f23655m;

        a(int i10) {
            this.f23655m = i10;
        }

        public int b() {
            return this.f23655m;
        }
    }

    a b(String str);
}
