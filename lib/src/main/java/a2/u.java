package a2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class u implements t1.v, t1.r {

    /* renamed from: m, reason: collision with root package name */
    private final Resources f83m;

    /* renamed from: n, reason: collision with root package name */
    private final t1.v f84n;

    private u(Resources resources, t1.v vVar) {
        this.f83m = (Resources) n2.k.d(resources);
        this.f84n = (t1.v) n2.k.d(vVar);
    }

    public static t1.v e(Resources resources, t1.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new u(resources, vVar);
    }

    @Override // t1.v
    public int a() {
        return this.f84n.a();
    }

    @Override // t1.v
    public Class b() {
        return BitmapDrawable.class;
    }

    @Override // t1.v
    public void c() {
        this.f84n.c();
    }

    @Override // t1.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f83m, (Bitmap) this.f84n.get());
    }

    @Override // t1.r
    public void initialize() {
        t1.v vVar = this.f84n;
        if (vVar instanceof t1.r) {
            ((t1.r) vVar).initialize();
        }
    }
}
