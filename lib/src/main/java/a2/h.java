package a2;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final d f24a = new d();

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t1.v a(ByteBuffer byteBuffer, int i10, int i11, r1.h hVar) {
        return this.f24a.a(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, r1.h hVar) {
        return true;
    }
}
