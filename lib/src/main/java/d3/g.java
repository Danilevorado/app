package d3;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.se0;
import k3.h4;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f22848a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22849b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22850c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22851d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22852e;

    /* renamed from: f, reason: collision with root package name */
    private int f22853f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22854g;

    /* renamed from: h, reason: collision with root package name */
    private int f22855h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f22837i = new g(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final g f22838j = new g(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final g f22839k = new g(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final g f22840l = new g(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final g f22841m = new g(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final g f22842n = new g(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    public static final g f22843o = new g(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    public static final g f22844p = new g(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    public static final g f22845q = new g(0, 0, "invalid");

    /* renamed from: s, reason: collision with root package name */
    public static final g f22847s = new g(50, 50, "50x50_mb");

    /* renamed from: r, reason: collision with root package name */
    public static final g f22846r = new g(-3, 0, "search_v2");

    public g(int i10, int i11) {
        this(i10, i11, (i10 == -1 ? "FULL" : String.valueOf(i10)) + "x" + (i11 == -2 ? "AUTO" : String.valueOf(i11)) + "_as");
    }

    g(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i10);
        }
        if (i11 >= 0 || i11 == -2 || i11 == -4) {
            this.f22848a = i10;
            this.f22849b = i11;
            this.f22850c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i11);
        }
    }

    public int a() {
        return this.f22849b;
    }

    public int b(Context context) {
        int i10 = this.f22849b;
        if (i10 == -4 || i10 == -3) {
            return -1;
        }
        if (i10 == -2) {
            return h4.f(context.getResources().getDisplayMetrics());
        }
        k3.t.b();
        return se0.z(context, this.f22849b);
    }

    public int c() {
        return this.f22848a;
    }

    public int d(Context context) {
        int i10 = this.f22848a;
        if (i10 == -3) {
            return -1;
        }
        if (i10 != -1) {
            k3.t.b();
            return se0.z(context, this.f22848a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<h4> creator = h4.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean e() {
        return this.f22848a == -3 && this.f22849b == -4;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f22848a == gVar.f22848a && this.f22849b == gVar.f22849b && this.f22850c.equals(gVar.f22850c);
    }

    final int f() {
        return this.f22855h;
    }

    final int g() {
        return this.f22853f;
    }

    final void h(int i10) {
        this.f22853f = i10;
    }

    public int hashCode() {
        return this.f22850c.hashCode();
    }

    final void i(int i10) {
        this.f22855h = i10;
    }

    final void j(boolean z10) {
        this.f22852e = true;
    }

    final void k(boolean z10) {
        this.f22854g = true;
    }

    final boolean l() {
        return this.f22851d;
    }

    final boolean m() {
        return this.f22852e;
    }

    final boolean n() {
        return this.f22854g;
    }

    public String toString() {
        return this.f22850c;
    }
}
