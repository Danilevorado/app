package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f21309m;

    /* renamed from: n, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f21310n;

    /* renamed from: o, reason: collision with root package name */
    final int f21311o;

    /* renamed from: p, reason: collision with root package name */
    int f21312p;

    /* renamed from: q, reason: collision with root package name */
    int f21313q;

    /* renamed from: r, reason: collision with root package name */
    int f21314r;

    /* renamed from: s, reason: collision with root package name */
    int f21315s;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f21312p = i10;
        this.f21313q = i11;
        this.f21314r = i12;
        this.f21311o = i13;
        this.f21315s = c(i10);
        this.f21309m = new com.google.android.material.timepicker.a(59);
        this.f21310n = new com.google.android.material.timepicker.a(i13 == 1 ? 24 : 12);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21312p == cVar.f21312p && this.f21313q == cVar.f21313q && this.f21311o == cVar.f21311o && this.f21314r == cVar.f21314r;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21311o), Integer.valueOf(this.f21312p), Integer.valueOf(this.f21313q), Integer.valueOf(this.f21314r)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21312p);
        parcel.writeInt(this.f21313q);
        parcel.writeInt(this.f21314r);
        parcel.writeInt(this.f21311o);
    }
}
