package s4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends f4.a {

    /* renamed from: m, reason: collision with root package name */
    final LocationRequest f26893m;

    /* renamed from: n, reason: collision with root package name */
    final List f26894n;

    /* renamed from: o, reason: collision with root package name */
    final String f26895o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f26896p;

    /* renamed from: q, reason: collision with root package name */
    final boolean f26897q;

    /* renamed from: r, reason: collision with root package name */
    final boolean f26898r;

    /* renamed from: s, reason: collision with root package name */
    final String f26899s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f26900t;

    /* renamed from: u, reason: collision with root package name */
    boolean f26901u;

    /* renamed from: v, reason: collision with root package name */
    String f26902v;

    /* renamed from: w, reason: collision with root package name */
    long f26903w;

    /* renamed from: x, reason: collision with root package name */
    static final List f26892x = Collections.emptyList();
    public static final Parcelable.Creator<o> CREATOR = new p();

    o(LocationRequest locationRequest, List list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.f26893m = locationRequest;
        this.f26894n = list;
        this.f26895o = str;
        this.f26896p = z10;
        this.f26897q = z11;
        this.f26898r = z12;
        this.f26899s = str2;
        this.f26900t = z13;
        this.f26901u = z14;
        this.f26902v = str3;
        this.f26903w = j10;
    }

    public static o f(String str, LocationRequest locationRequest) {
        return new o(locationRequest, f26892x, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (e4.o.a(this.f26893m, oVar.f26893m) && e4.o.a(this.f26894n, oVar.f26894n) && e4.o.a(this.f26895o, oVar.f26895o) && this.f26896p == oVar.f26896p && this.f26897q == oVar.f26897q && this.f26898r == oVar.f26898r && e4.o.a(this.f26899s, oVar.f26899s) && this.f26900t == oVar.f26900t && this.f26901u == oVar.f26901u && e4.o.a(this.f26902v, oVar.f26902v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26893m.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26893m);
        if (this.f26895o != null) {
            sb2.append(" tag=");
            sb2.append(this.f26895o);
        }
        if (this.f26899s != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f26899s);
        }
        if (this.f26902v != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f26902v);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f26896p);
        sb2.append(" clients=");
        sb2.append(this.f26894n);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f26897q);
        if (this.f26898r) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f26900t) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f26901u) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.p(parcel, 1, this.f26893m, i10, false);
        f4.c.u(parcel, 5, this.f26894n, false);
        f4.c.q(parcel, 6, this.f26895o, false);
        f4.c.c(parcel, 7, this.f26896p);
        f4.c.c(parcel, 8, this.f26897q);
        f4.c.c(parcel, 9, this.f26898r);
        f4.c.q(parcel, 10, this.f26899s, false);
        f4.c.c(parcel, 11, this.f26900t);
        f4.c.c(parcel, 12, this.f26901u);
        f4.c.q(parcel, 13, this.f26902v, false);
        f4.c.n(parcel, 14, this.f26903w);
        f4.c.b(parcel, iA);
    }
}
