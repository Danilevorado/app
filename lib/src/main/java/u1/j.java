package u1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class j implements d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f27554k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final k f27555a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f27556b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27557c;

    /* renamed from: d, reason: collision with root package name */
    private final a f27558d;

    /* renamed from: e, reason: collision with root package name */
    private long f27559e;

    /* renamed from: f, reason: collision with root package name */
    private long f27560f;

    /* renamed from: g, reason: collision with root package name */
    private int f27561g;

    /* renamed from: h, reason: collision with root package name */
    private int f27562h;

    /* renamed from: i, reason: collision with root package name */
    private int f27563i;

    /* renamed from: j, reason: collision with root package name */
    private int f27564j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        @Override // u1.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // u1.j.a
        public void b(Bitmap bitmap) {
        }
    }

    public j(long j10) {
        this(j10, l(), k());
    }

    j(long j10, k kVar, Set set) {
        this.f27557c = j10;
        this.f27559e = j10;
        this.f27555a = kVar;
        this.f27556b = set;
        this.f27558d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f27554k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f27561g + ", misses=" + this.f27562h + ", puts=" + this.f27563i + ", evictions=" + this.f27564j + ", currentSize=" + this.f27560f + ", maxSize=" + this.f27559e + "\nStrategy=" + this.f27555a);
    }

    private void j() {
        q(this.f27559e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapC;
        f(config);
        bitmapC = this.f27555a.c(i10, i11, config != null ? config : f27554k);
        if (bitmapC == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f27555a.a(i10, i11, config));
            }
            this.f27562h++;
        } else {
            this.f27561g++;
            this.f27560f -= this.f27555a.b(bitmapC);
            this.f27558d.a(bitmapC);
            p(bitmapC);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f27555a.a(i10, i11, config));
        }
        h();
        return bitmapC;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f27560f > j10) {
            Bitmap bitmapE = this.f27555a.e();
            if (bitmapE == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.f27560f = 0L;
                return;
            }
            this.f27558d.a(bitmapE);
            this.f27560f -= this.f27555a.b(bitmapE);
            this.f27564j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f27555a.f(bitmapE));
            }
            h();
            bitmapE.recycle();
        }
    }

    @Override // u1.d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // u1.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // u1.d
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // u1.d
    public synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f27555a.b(bitmap) <= this.f27559e && this.f27556b.contains(bitmap.getConfig())) {
                int iB = this.f27555a.b(bitmap);
                this.f27555a.d(bitmap);
                this.f27558d.b(bitmap);
                this.f27563i++;
                this.f27560f += iB;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f27555a.f(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f27555a.f(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f27556b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // u1.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        return bitmapM == null ? g(i10, i11, config) : bitmapM;
    }

    public long n() {
        return this.f27559e;
    }
}
