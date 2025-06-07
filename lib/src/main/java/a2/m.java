package a2;

import a2.s;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final r1.g f44f = r1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", r1.b.f26437o);

    /* renamed from: g, reason: collision with root package name */
    public static final r1.g f45g = r1.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final r1.g f46h = l.f39h;

    /* renamed from: i, reason: collision with root package name */
    public static final r1.g f47i;

    /* renamed from: j, reason: collision with root package name */
    public static final r1.g f48j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set f49k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f50l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set f51m;

    /* renamed from: n, reason: collision with root package name */
    private static final Queue f52n;

    /* renamed from: a, reason: collision with root package name */
    private final u1.d f53a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f54b;

    /* renamed from: c, reason: collision with root package name */
    private final u1.b f55c;

    /* renamed from: d, reason: collision with root package name */
    private final List f56d;

    /* renamed from: e, reason: collision with root package name */
    private final r f57e = r.b();

    class a implements b {
        a() {
        }

        @Override // a2.m.b
        public void a(u1.d dVar, Bitmap bitmap) {
        }

        @Override // a2.m.b
        public void b() {
        }
    }

    public interface b {
        void a(u1.d dVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f47i = r1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f48j = r1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f49k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f50l = new a();
        f51m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f52n = n2.l.e(0);
    }

    public m(List list, DisplayMetrics displayMetrics, u1.d dVar, u1.b bVar) {
        this.f56d = list;
        this.f54b = (DisplayMetrics) n2.k.d(displayMetrics);
        this.f53a = (u1.d) n2.k.d(dVar);
        this.f55c = (u1.b) n2.k.d(bVar);
    }

    private static int a(double d10) {
        return x((d10 / (r1 / r0)) * x(l(d10) * d10));
    }

    private void b(s sVar, r1.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        if (this.f57e.i(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == r1.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean zHasAlpha = false;
        try {
            zHasAlpha = sVar.d().hasAlpha();
        } catch (IOException e5) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e5);
            }
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(com.bumptech.glide.load.ImageHeaderParser.ImageType r18, a2.s r19, a2.m.b r20, u1.d r21, a2.l r22, int r23, int r24, int r25, int r26, int r27, android.graphics.BitmapFactory.Options r28) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m.c(com.bumptech.glide.load.ImageHeaderParser$ImageType, a2.s, a2.m$b, u1.d, a2.l, int, int, int, int, int, android.graphics.BitmapFactory$Options):void");
    }

    private t1.v d(s sVar, int i10, int i11, r1.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f55c.e(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        r1.b bVar2 = (r1.b) hVar.c(f44f);
        r1.i iVar = (r1.i) hVar.c(f45g);
        l lVar = (l) hVar.c(l.f39h);
        boolean zBooleanValue = ((Boolean) hVar.c(f47i)).booleanValue();
        r1.g gVar = f48j;
        try {
            return e.e(h(sVar, optionsK, lVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f53a);
        } finally {
            v(optionsK);
            this.f55c.d(bArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0162, code lost:
    
        if (r0 >= 26) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Bitmap h(a2.s r30, android.graphics.BitmapFactory.Options r31, a2.l r32, r1.b r33, r1.i r34, boolean r35, int r36, int r37, boolean r38, a2.m.b r39) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m.h(a2.s, android.graphics.BitmapFactory$Options, a2.l, r1.b, r1.i, boolean, int, int, boolean, a2.m$b):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(a2.s r5, android.graphics.BitmapFactory.Options r6, a2.m.b r7, u1.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = a2.z.f()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = a2.z.f()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.d(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = a2.z.f()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = a2.z.f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.m.i(a2.s, android.graphics.BitmapFactory$Options, a2.m$b, u1.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        Queue queue = f52n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            w(options);
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(s sVar, BitmapFactory.Options options, b bVar, u1.d dVar) {
        options.inJustDecodeBounds = true;
        i(sVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + n2.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f52n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, u1.d dVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public t1.v e(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, r1.h hVar) {
        return d(new s.c(parcelFileDescriptor, this.f56d, this.f55c), i10, i11, hVar, f50l);
    }

    public t1.v f(InputStream inputStream, int i10, int i11, r1.h hVar, b bVar) {
        return d(new s.b(inputStream, this.f56d, this.f55c), i10, i11, hVar, bVar);
    }

    public t1.v g(ByteBuffer byteBuffer, int i10, int i11, r1.h hVar) {
        return d(new s.a(byteBuffer, this.f56d, this.f55c), i10, i11, hVar, f50l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
