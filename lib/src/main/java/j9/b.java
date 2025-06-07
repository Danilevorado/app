package j9;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f24555b;

    /* renamed from: a, reason: collision with root package name */
    private final j9.a f24556a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private j9.a f24557a;

        public b a(boolean z10) {
            if (this.f24557a == null) {
                throw new IllegalArgumentException("You must setup deviceSpecific");
            }
            if (b.f24555b == null || z10) {
                b unused = b.f24555b = new b(this.f24557a);
            }
            return b.f24555b;
        }

        public a b(j9.a aVar) {
            this.f24557a = aVar;
            return this;
        }
    }

    private b(j9.a aVar) {
        this.f24556a = aVar;
    }

    public static b d() {
        return f24555b;
    }

    public static boolean f() {
        return f24555b != null;
    }

    public int c() {
        return this.f24556a.b();
    }

    public boolean e() {
        return j().equals("Android FCM");
    }

    public String g(String str) {
        return this.f24556a.a(str);
    }

    public String h() {
        return this.f24556a.c();
    }

    public i9.a i() {
        return this.f24556a.e();
    }

    public String j() {
        return this.f24556a.d();
    }
}
