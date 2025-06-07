package x1;

import com.bumptech.glide.load.data.d;
import x1.m;

/* loaded from: classes.dex */
public class u implements m {

    /* renamed from: a, reason: collision with root package name */
    private static final u f28213a = new u();

    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private static final a f28214a = new a();

        public static a a() {
            return f28214a;
        }

        @Override // x1.n
        public m b(q qVar) {
            return u.c();
        }
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: m, reason: collision with root package name */
        private final Object f28215m;

        b(Object obj) {
            this.f28215m = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f28215m.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public r1.a e() {
            return r1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.d(this.f28215m);
        }
    }

    public static u c() {
        return f28213a;
    }

    @Override // x1.m
    public m.a a(Object obj, int i10, int i11, r1.h hVar) {
        return new m.a(new m2.b(obj), new b(obj));
    }

    @Override // x1.m
    public boolean b(Object obj) {
        return true;
    }
}
