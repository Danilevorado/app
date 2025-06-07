package q2;

import q2.e;

/* loaded from: classes.dex */
public abstract class k {

    public static abstract class a {
        public abstract k a();

        public abstract a b(q2.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: m, reason: collision with root package name */
        private final int f26246m;

        b(int i10) {
            this.f26246m = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract q2.a b();

    public abstract b c();
}
