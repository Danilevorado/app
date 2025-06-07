package f2;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import r1.h;
import t1.v;

/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f23620a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23621b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f23620a = compressFormat;
        this.f23621b = i10;
    }

    @Override // f2.e
    public v a(v vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f23620a, this.f23621b, byteArrayOutputStream);
        vVar.c();
        return new b2.b(byteArrayOutputStream.toByteArray());
    }
}
