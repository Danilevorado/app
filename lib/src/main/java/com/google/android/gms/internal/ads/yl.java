package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class yl extends f4.a {
    public static final Parcelable.Creator<yl> CREATOR = new zl();

    /* renamed from: m, reason: collision with root package name */
    private ParcelFileDescriptor f18090m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f18091n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f18092o;

    /* renamed from: p, reason: collision with root package name */
    private final long f18093p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f18094q;

    public yl() {
        this(null, false, false, 0L, false);
    }

    public yl(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j10, boolean z12) {
        this.f18090m = parcelFileDescriptor;
        this.f18091n = z10;
        this.f18092o = z11;
        this.f18093p = j10;
        this.f18094q = z12;
    }

    public final synchronized boolean A() {
        return this.f18094q;
    }

    public final synchronized long f() {
        return this.f18093p;
    }

    final synchronized ParcelFileDescriptor h() {
        return this.f18090m;
    }

    public final synchronized InputStream v() {
        if (this.f18090m == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f18090m);
        this.f18090m = null;
        return autoCloseInputStream;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = f4.c.a(parcel);
        f4.c.p(parcel, 2, h(), i10, false);
        f4.c.c(parcel, 3, x());
        f4.c.c(parcel, 4, z());
        f4.c.n(parcel, 5, f());
        f4.c.c(parcel, 6, A());
        f4.c.b(parcel, iA);
    }

    public final synchronized boolean x() {
        return this.f18091n;
    }

    public final synchronized boolean y() {
        return this.f18090m != null;
    }

    public final synchronized boolean z() {
        return this.f18092o;
    }
}
