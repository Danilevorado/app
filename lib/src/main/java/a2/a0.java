package a2;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class a0 implements r1.j {

    private static final class a implements t1.v {

        /* renamed from: m, reason: collision with root package name */
        private final Bitmap f4m;

        a(Bitmap bitmap) {
            this.f4m = bitmap;
        }

        @Override // t1.v
        public int a() {
            return n2.l.g(this.f4m);
        }

        @Override // t1.v
        public Class b() {
            return Bitmap.class;
        }

        @Override // t1.v
        public void c() {
        }

        @Override // t1.v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f4m;
        }
    }

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t1.v a(Bitmap bitmap, int i10, int i11, r1.h hVar) {
        return new a(bitmap);
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Bitmap bitmap, r1.h hVar) {
        return true;
    }
}
