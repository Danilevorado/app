package a2;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class i extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f25b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(r1.f.f26444a);

    @Override // r1.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f25b);
    }

    @Override // a2.f
    protected Bitmap c(u1.d dVar, Bitmap bitmap, int i10, int i11) {
        return z.b(dVar, bitmap, i10, i11);
    }

    @Override // r1.f
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // r1.f
    public int hashCode() {
        return -599754482;
    }
}
