package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e4.p;

/* loaded from: classes.dex */
public final class Scope extends f4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new c();

    /* renamed from: m, reason: collision with root package name */
    final int f5590m;

    /* renamed from: n, reason: collision with root package name */
    private final String f5591n;

    Scope(int i10, String str) {
        p.g(str, "scopeUri must not be null or empty");
        this.f5590m = i10;
        this.f5591n = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f5591n.equals(((Scope) obj).f5591n);
        }
        return false;
    }

    public String f() {
        return this.f5591n;
    }

    public int hashCode() {
        return this.f5591n.hashCode();
    }

    public String toString() {
        return this.f5591n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f5590m;
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, i11);
        f4.c.q(parcel, 2, f(), false);
        f4.c.b(parcel, iA);
    }
}
