package ha;

/* loaded from: classes2.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24154a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final c f24155b = new b();

    class a implements c {
        a() {
        }

        @Override // ha.c
        public void a(Exception exc) {
        }
    }

    class b implements c {
        b() {
        }

        @Override // ha.c
        public void a(Exception exc) {
            exc.printStackTrace();
        }
    }

    void a(Exception exc);
}
