package k1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f24582a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f24583a;

        /* synthetic */ a(s sVar) {
        }

        public d a() {
            String str = this.f24583a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            d dVar = new d(null);
            dVar.f24582a = str;
            return dVar;
        }

        public a b(String str) {
            this.f24583a = str;
            return this;
        }
    }

    /* synthetic */ d(t tVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f24582a;
    }
}
