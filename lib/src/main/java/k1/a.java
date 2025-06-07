package k1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f24578a;

    /* renamed from: k1.a$a, reason: collision with other inner class name */
    public static final class C0151a {

        /* renamed from: a, reason: collision with root package name */
        private String f24579a;

        /* synthetic */ C0151a(j jVar) {
        }

        public a a() {
            String str = this.f24579a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            a aVar = new a(null);
            aVar.f24578a = str;
            return aVar;
        }

        public C0151a b(String str) {
            this.f24579a = str;
            return this;
        }
    }

    /* synthetic */ a(k kVar) {
    }

    public static C0151a b() {
        return new C0151a(null);
    }

    public String a() {
        return this.f24578a;
    }
}
