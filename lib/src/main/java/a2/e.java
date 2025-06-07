package a2;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements t1.v, t1.r {

    /* renamed from: m, reason: collision with root package name */
    private final Bitmap f21m;

    /* renamed from: n, reason: collision with root package name */
    private final u1.d f22n;

    public e(Bitmap bitmap, u1.d dVar) {
        this.f21m = (Bitmap) n2.k.e(bitmap, "Bitmap must not be null");
        this.f22n = (u1.d) n2.k.e(dVar, "BitmapPool must not be null");
    }

    public static e e(Bitmap bitmap, u1.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // t1.v
    public int a() {
        return n2.l.g(this.f21m);
    }

    @Override // t1.v
    public Class b() {
        return Bitmap.class;
    }

    @Override // t1.v
    public void c() {
        this.f22n.d(this.f21m);
    }

    @Override // t1.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f21m;
    }

    @Override // t1.r
    public void initialize() {
        this.f21m.prepareToDraw();
    }
}
