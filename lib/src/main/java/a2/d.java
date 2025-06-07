package a2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final u1.d f20a = new u1.e();

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t1.v a(ImageDecoder.Source source, int i10, int i11, r1.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new z1.a(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new e(bitmapDecodeBitmap, this.f20a);
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ImageDecoder.Source source, r1.h hVar) {
        return true;
    }
}
