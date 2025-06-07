package a2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f62g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f63h;

    /* renamed from: i, reason: collision with root package name */
    private static final File f64i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile r f65j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile int f66k;

    /* renamed from: b, reason: collision with root package name */
    private final int f68b;

    /* renamed from: c, reason: collision with root package name */
    private final int f69c;

    /* renamed from: d, reason: collision with root package name */
    private int f70d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71e = true;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f72f = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f67a = f();

    static {
        int i10 = Build.VERSION.SDK_INT;
        f62g = i10 < 29;
        f63h = i10 >= 26;
        f64i = new File("/proc/self/fd");
        f66k = -1;
    }

    r() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f68b = 20000;
            this.f69c = 0;
        } else {
            this.f68b = 700;
            this.f69c = 128;
        }
    }

    private boolean a() {
        return f62g && !this.f72f.get();
    }

    public static r b() {
        if (f65j == null) {
            synchronized (r.class) {
                if (f65j == null) {
                    f65j = new r();
                }
            }
        }
        return f65j;
    }

    private int c() {
        return f66k != -1 ? f66k : this.f68b;
    }

    private synchronized boolean d() {
        boolean z10 = true;
        int i10 = this.f70d + 1;
        this.f70d = i10;
        if (i10 >= 50) {
            this.f70d = 0;
            int length = f64i.list().length;
            long jC = c();
            if (length >= jC) {
                z10 = false;
            }
            this.f71e = z10;
            if (!z10 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
            }
        }
        return this.f71e;
    }

    private static boolean f() {
        return (g() || h()) ? false : true;
    }

    private static boolean g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    public boolean e(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f67a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f63h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i12 = this.f69c;
        if (i10 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i11 < i12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean i(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zE = e(i10, i11, z10, z11);
        if (zE) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zE;
    }
}
