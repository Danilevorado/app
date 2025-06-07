package a2;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class t implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final d f82a = new d();

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t1.v a(InputStream inputStream, int i10, int i11, r1.h hVar) {
        return this.f82a.a(ImageDecoder.createSource(n2.a.b(inputStream)), i10, i11, hVar);
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, r1.h hVar) {
        return true;
    }
}
