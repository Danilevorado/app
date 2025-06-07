package u1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements d {
    @Override // u1.d
    public void a(int i10) {
    }

    @Override // u1.d
    public void b() {
    }

    @Override // u1.d
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // u1.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // u1.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config);
    }
}
