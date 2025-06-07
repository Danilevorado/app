package v1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f27828a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27829b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27830c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27831d;

    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f27832i;

        /* renamed from: a, reason: collision with root package name */
        final Context f27833a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f27834b;

        /* renamed from: c, reason: collision with root package name */
        c f27835c;

        /* renamed from: e, reason: collision with root package name */
        float f27837e;

        /* renamed from: d, reason: collision with root package name */
        float f27836d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f27838f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f27839g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f27840h = 4194304;

        static {
            f27832i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f27837e = f27832i;
            this.f27833a = context;
            this.f27834b = (ActivityManager) context.getSystemService("activity");
            this.f27835c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f27834b)) {
                return;
            }
            this.f27837e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f27841a;

        b(DisplayMetrics displayMetrics) {
            this.f27841a = displayMetrics;
        }

        @Override // v1.i.c
        public int a() {
            return this.f27841a.heightPixels;
        }

        @Override // v1.i.c
        public int b() {
            return this.f27841a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f27830c = aVar.f27833a;
        int i10 = e(aVar.f27834b) ? aVar.f27840h / 2 : aVar.f27840h;
        this.f27831d = i10;
        int iC = c(aVar.f27834b, aVar.f27838f, aVar.f27839g);
        float fB = aVar.f27835c.b() * aVar.f27835c.a() * 4;
        int iRound = Math.round(aVar.f27837e * fB);
        int iRound2 = Math.round(fB * aVar.f27836d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f27829b = iRound2;
            this.f27828a = iRound;
        } else {
            float f5 = i11;
            float f10 = aVar.f27837e;
            float f11 = aVar.f27836d;
            float f12 = f5 / (f10 + f11);
            this.f27829b = Math.round(f11 * f12);
            this.f27828a = Math.round(f12 * aVar.f27837e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f27829b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f27828a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f27834b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f27834b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f5, float f10) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e(activityManager)) {
            f5 = f10;
        }
        return Math.round(memoryClass * f5);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f27830c, i10);
    }

    public int a() {
        return this.f27831d;
    }

    public int b() {
        return this.f27828a;
    }

    public int d() {
        return this.f27829b;
    }
}
