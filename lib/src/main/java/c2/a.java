package c2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import n2.l;
import r1.h;
import r1.j;
import t1.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f4659a;

    /* renamed from: b, reason: collision with root package name */
    private final u1.b f4660b;

    /* renamed from: c2.a$a, reason: collision with other inner class name */
    private static final class C0085a implements v {

        /* renamed from: m, reason: collision with root package name */
        private final AnimatedImageDrawable f4661m;

        C0085a(AnimatedImageDrawable animatedImageDrawable) {
            this.f4661m = animatedImageDrawable;
        }

        @Override // t1.v
        public int a() {
            return this.f4661m.getIntrinsicWidth() * this.f4661m.getIntrinsicHeight() * l.h(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // t1.v
        public Class b() {
            return Drawable.class;
        }

        @Override // t1.v
        public void c() {
            this.f4661m.stop();
            this.f4661m.clearAnimationCallbacks();
        }

        @Override // t1.v
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f4661m;
        }
    }

    private static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final a f4662a;

        b(a aVar) {
            this.f4662a = aVar;
        }

        @Override // r1.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
            return this.f4662a.b(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
        }

        @Override // r1.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(ByteBuffer byteBuffer, h hVar) {
            return this.f4662a.d(byteBuffer);
        }
    }

    private static final class c implements j {

        /* renamed from: a, reason: collision with root package name */
        private final a f4663a;

        c(a aVar) {
            this.f4663a = aVar;
        }

        @Override // r1.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v a(InputStream inputStream, int i10, int i11, h hVar) {
            return this.f4663a.b(ImageDecoder.createSource(n2.a.b(inputStream)), i10, i11, hVar);
        }

        @Override // r1.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(InputStream inputStream, h hVar) {
            return this.f4663a.c(inputStream);
        }
    }

    private a(List list, u1.b bVar) {
        this.f4659a = list;
        this.f4660b = bVar;
    }

    public static j a(List list, u1.b bVar) {
        return new b(new a(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public static j f(List list, u1.b bVar) {
        return new c(new a(list, bVar));
    }

    v b(ImageDecoder.Source source, int i10, int i11, h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new z1.a(i10, i11, hVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new C0085a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f4659a, inputStream, this.f4660b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f4659a, byteBuffer));
    }
}
