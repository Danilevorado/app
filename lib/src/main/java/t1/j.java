package t1;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f27213a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final j f27214b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j f27215c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final j f27216d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final j f27217e = new e();

    class a extends j {
        a() {
        }

        @Override // t1.j
        public boolean a() {
            return true;
        }

        @Override // t1.j
        public boolean b() {
            return true;
        }

        @Override // t1.j
        public boolean c(r1.a aVar) {
            return aVar == r1.a.REMOTE;
        }

        @Override // t1.j
        public boolean d(boolean z10, r1.a aVar, r1.c cVar) {
            return (aVar == r1.a.RESOURCE_DISK_CACHE || aVar == r1.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends j {
        b() {
        }

        @Override // t1.j
        public boolean a() {
            return false;
        }

        @Override // t1.j
        public boolean b() {
            return false;
        }

        @Override // t1.j
        public boolean c(r1.a aVar) {
            return false;
        }

        @Override // t1.j
        public boolean d(boolean z10, r1.a aVar, r1.c cVar) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        @Override // t1.j
        public boolean a() {
            return true;
        }

        @Override // t1.j
        public boolean b() {
            return false;
        }

        @Override // t1.j
        public boolean c(r1.a aVar) {
            return (aVar == r1.a.DATA_DISK_CACHE || aVar == r1.a.MEMORY_CACHE) ? false : true;
        }

        @Override // t1.j
        public boolean d(boolean z10, r1.a aVar, r1.c cVar) {
            return false;
        }
    }

    class d extends j {
        d() {
        }

        @Override // t1.j
        public boolean a() {
            return false;
        }

        @Override // t1.j
        public boolean b() {
            return true;
        }

        @Override // t1.j
        public boolean c(r1.a aVar) {
            return false;
        }

        @Override // t1.j
        public boolean d(boolean z10, r1.a aVar, r1.c cVar) {
            return (aVar == r1.a.RESOURCE_DISK_CACHE || aVar == r1.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends j {
        e() {
        }

        @Override // t1.j
        public boolean a() {
            return true;
        }

        @Override // t1.j
        public boolean b() {
            return true;
        }

        @Override // t1.j
        public boolean c(r1.a aVar) {
            return aVar == r1.a.REMOTE;
        }

        @Override // t1.j
        public boolean d(boolean z10, r1.a aVar, r1.c cVar) {
            return ((z10 && aVar == r1.a.DATA_DISK_CACHE) || aVar == r1.a.LOCAL) && cVar == r1.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(r1.a aVar);

    public abstract boolean d(boolean z10, r1.a aVar, r1.c cVar);
}
