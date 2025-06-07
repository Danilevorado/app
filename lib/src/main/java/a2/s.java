package a2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
interface s {

    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f73a;

        /* renamed from: b, reason: collision with root package name */
        private final List f74b;

        /* renamed from: c, reason: collision with root package name */
        private final u1.b f75c;

        a(ByteBuffer byteBuffer, List list, u1.b bVar) {
            this.f73a = byteBuffer;
            this.f74b = list;
            this.f75c = bVar;
        }

        private InputStream e() {
            return n2.a.g(n2.a.d(this.f73a));
        }

        @Override // a2.s
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // a2.s
        public void b() {
        }

        @Override // a2.s
        public int c() {
            return com.bumptech.glide.load.a.c(this.f74b, n2.a.d(this.f73a), this.f75c);
        }

        @Override // a2.s
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f74b, n2.a.d(this.f73a));
        }
    }

    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f76a;

        /* renamed from: b, reason: collision with root package name */
        private final u1.b f77b;

        /* renamed from: c, reason: collision with root package name */
        private final List f78c;

        b(InputStream inputStream, List list, u1.b bVar) {
            this.f77b = (u1.b) n2.k.d(bVar);
            this.f78c = (List) n2.k.d(list);
            this.f76a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // a2.s
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f76a.a(), null, options);
        }

        @Override // a2.s
        public void b() {
            this.f76a.c();
        }

        @Override // a2.s
        public int c() {
            return com.bumptech.glide.load.a.b(this.f78c, this.f76a.a(), this.f77b);
        }

        @Override // a2.s
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f78c, this.f76a.a(), this.f77b);
        }
    }

    public static final class c implements s {

        /* renamed from: a, reason: collision with root package name */
        private final u1.b f79a;

        /* renamed from: b, reason: collision with root package name */
        private final List f80b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f81c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, u1.b bVar) {
            this.f79a = (u1.b) n2.k.d(bVar);
            this.f80b = (List) n2.k.d(list);
            this.f81c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // a2.s
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f81c.a().getFileDescriptor(), null, options);
        }

        @Override // a2.s
        public void b() {
        }

        @Override // a2.s
        public int c() {
            return com.bumptech.glide.load.a.a(this.f80b, this.f81c, this.f79a);
        }

        @Override // a2.s
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f80b, this.f81c, this.f79a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
