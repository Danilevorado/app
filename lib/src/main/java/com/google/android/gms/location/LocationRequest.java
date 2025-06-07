package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e4.o;
import f4.c;

/* loaded from: classes.dex */
public final class LocationRequest extends f4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    int f19717m;

    /* renamed from: n, reason: collision with root package name */
    long f19718n;

    /* renamed from: o, reason: collision with root package name */
    long f19719o;

    /* renamed from: p, reason: collision with root package name */
    boolean f19720p;

    /* renamed from: q, reason: collision with root package name */
    long f19721q;

    /* renamed from: r, reason: collision with root package name */
    int f19722r;

    /* renamed from: s, reason: collision with root package name */
    float f19723s;

    /* renamed from: t, reason: collision with root package name */
    long f19724t;

    /* renamed from: u, reason: collision with root package name */
    boolean f19725u;

    @Deprecated
    public LocationRequest() {
        this.f19717m = 102;
        this.f19718n = 3600000L;
        this.f19719o = 600000L;
        this.f19720p = false;
        this.f19721q = Long.MAX_VALUE;
        this.f19722r = Integer.MAX_VALUE;
        this.f19723s = 0.0f;
        this.f19724t = 0L;
        this.f19725u = false;
    }

    LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f5, long j13, boolean z11) {
        this.f19717m = i10;
        this.f19718n = j10;
        this.f19719o = j11;
        this.f19720p = z10;
        this.f19721q = j12;
        this.f19722r = i11;
        this.f19723s = f5;
        this.f19724t = j13;
        this.f19725u = z11;
    }

    private static void B(long j10) {
        if (j10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("invalid interval: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static LocationRequest f() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.A(true);
        return locationRequest;
    }

    public LocationRequest A(boolean z10) {
        this.f19725u = z10;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f19717m == locationRequest.f19717m && this.f19718n == locationRequest.f19718n && this.f19719o == locationRequest.f19719o && this.f19720p == locationRequest.f19720p && this.f19721q == locationRequest.f19721q && this.f19722r == locationRequest.f19722r && this.f19723s == locationRequest.f19723s && h() == locationRequest.h() && this.f19725u == locationRequest.f19725u) {
                return true;
            }
        }
        return false;
    }

    public long h() {
        long j10 = this.f19724t;
        long j11 = this.f19718n;
        return j10 < j11 ? j11 : j10;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f19717m), Long.valueOf(this.f19718n), Float.valueOf(this.f19723s), Long.valueOf(this.f19724t));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i10 = this.f19717m;
        sb2.append(i10 != 100 ? i10 != 102 ? i10 != 104 ? i10 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f19717m != 105) {
            sb2.append(" requested=");
            sb2.append(this.f19718n);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f19719o);
        sb2.append("ms");
        if (this.f19724t > this.f19718n) {
            sb2.append(" maxWait=");
            sb2.append(this.f19724t);
            sb2.append("ms");
        }
        if (this.f19723s > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f19723s);
            sb2.append("m");
        }
        long j10 = this.f19721q;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f19722r != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f19722r);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public LocationRequest v(long j10) {
        B(j10);
        this.f19720p = true;
        this.f19719o = j10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.k(parcel, 1, this.f19717m);
        c.n(parcel, 2, this.f19718n);
        c.n(parcel, 3, this.f19719o);
        c.c(parcel, 4, this.f19720p);
        c.n(parcel, 5, this.f19721q);
        c.k(parcel, 6, this.f19722r);
        c.h(parcel, 7, this.f19723s);
        c.n(parcel, 8, this.f19724t);
        c.c(parcel, 9, this.f19725u);
        c.b(parcel, iA);
    }

    public LocationRequest x(long j10) {
        B(j10);
        this.f19718n = j10;
        if (!this.f19720p) {
            this.f19719o = (long) (j10 / 6.0d);
        }
        return this;
    }

    public LocationRequest y(long j10) {
        B(j10);
        this.f19724t = j10;
        return this;
    }

    public LocationRequest z(int i10) {
        if (i10 == 100 || i10 == 102 || i10 == 104 || i10 == 105) {
            this.f19717m = i10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("invalid quality: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
