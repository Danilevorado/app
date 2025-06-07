package a2;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import r1.g;

/* loaded from: classes.dex */
public class b0 implements r1.j {

    /* renamed from: d, reason: collision with root package name */
    public static final r1.g f7d = r1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final r1.g f8e = r1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final e f9f = new e();

    /* renamed from: a, reason: collision with root package name */
    private final f f10a;

    /* renamed from: b, reason: collision with root package name */
    private final u1.d f11b;

    /* renamed from: c, reason: collision with root package name */
    private final e f12c;

    class a implements g.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f13a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // r1.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f13a) {
                this.f13a.position(0);
                messageDigest.update(this.f13a.putLong(l10.longValue()).array());
            }
        }
    }

    class b implements g.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f14a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // r1.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f14a) {
                this.f14a.position(0);
                messageDigest.update(this.f14a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements f {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // a2.b0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static final class d implements f {

        class a extends MediaDataSource {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f15m;

            a(ByteBuffer byteBuffer) {
                this.f15m = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f15m.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f15m.limit()) {
                    return -1;
                }
                this.f15m.position((int) j10);
                int iMin = Math.min(i11, this.f15m.remaining());
                this.f15m.get(bArr, i10, iMin);
                return iMin;
            }
        }

        d() {
        }

        @Override // a2.b0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    interface f {
        void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    static final class g implements f {
        g() {
        }

        @Override // a2.b0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    b0(u1.d dVar, f fVar) {
        this(dVar, fVar, f9f);
    }

    b0(u1.d dVar, f fVar, e eVar) {
        this.f11b = dVar;
        this.f10a = fVar;
        this.f12c = eVar;
    }

    public static r1.j c(u1.d dVar) {
        return new b0(dVar, new c(null));
    }

    public static r1.j d(u1.d dVar) {
        return new b0(dVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        Bitmap bitmapG = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || lVar == l.f37f) ? null : g(mediaMetadataRetriever, j10, i10, i11, i12, lVar);
        if (bitmapG == null) {
            bitmapG = f(mediaMetadataRetriever, j10, i10);
        }
        if (bitmapG != null) {
            return bitmapG;
        }
        throw new h();
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = lVar.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    public static r1.j h(u1.d dVar) {
        return new b0(dVar, new g());
    }

    @Override // r1.j
    public t1.v a(Object obj, int i10, int i11, r1.h hVar) throws IOException {
        long jLongValue = ((Long) hVar.c(f7d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) hVar.c(f8e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) hVar.c(l.f39h);
        if (lVar == null) {
            lVar = l.f38g;
        }
        l lVar2 = lVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f12c.a();
        try {
            this.f10a.a(mediaMetadataRetrieverA, obj);
            return a2.e.e(e(mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, lVar2), this.f11b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverA.close();
            } else {
                mediaMetadataRetrieverA.release();
            }
        }
    }

    @Override // r1.j
    public boolean b(Object obj, r1.h hVar) {
        return true;
    }
}
