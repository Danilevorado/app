package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
final class l implements Comparable, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    private final Calendar f20965m;

    /* renamed from: n, reason: collision with root package name */
    final int f20966n;

    /* renamed from: o, reason: collision with root package name */
    final int f20967o;

    /* renamed from: p, reason: collision with root package name */
    final int f20968p;

    /* renamed from: q, reason: collision with root package name */
    final int f20969q;

    /* renamed from: r, reason: collision with root package name */
    final long f20970r;

    /* renamed from: s, reason: collision with root package name */
    private String f20971s;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return l.d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = s.d(calendar);
        this.f20965m = calendarD;
        this.f20966n = calendarD.get(2);
        this.f20967o = calendarD.get(1);
        this.f20968p = calendarD.getMaximum(7);
        this.f20969q = calendarD.getActualMaximum(5);
        this.f20970r = calendarD.getTimeInMillis();
    }

    static l d(int i10, int i11) {
        Calendar calendarK = s.k();
        calendarK.set(1, i10);
        calendarK.set(2, i11);
        return new l(calendarK);
    }

    static l g(long j10) {
        Calendar calendarK = s.k();
        calendarK.setTimeInMillis(j10);
        return new l(calendarK);
    }

    static l m() {
        return new l(s.i());
    }

    int A(l lVar) {
        if (this.f20965m instanceof GregorianCalendar) {
            return ((lVar.f20967o - this.f20967o) * 12) + (lVar.f20966n - this.f20966n);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return this.f20965m.compareTo(lVar.f20965m);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f20966n == lVar.f20966n && this.f20967o == lVar.f20967o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20966n), Integer.valueOf(this.f20967o)});
    }

    int r() {
        int firstDayOfWeek = this.f20965m.get(7) - this.f20965m.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f20968p : firstDayOfWeek;
    }

    long v(int i10) {
        Calendar calendarD = s.d(this.f20965m);
        calendarD.set(5, i10);
        return calendarD.getTimeInMillis();
    }

    int w(long j10) {
        Calendar calendarD = s.d(this.f20965m);
        calendarD.setTimeInMillis(j10);
        return calendarD.get(5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20967o);
        parcel.writeInt(this.f20966n);
    }

    String x() {
        if (this.f20971s == null) {
            this.f20971s = e.c(this.f20965m.getTimeInMillis());
        }
        return this.f20971s;
    }

    long y() {
        return this.f20965m.getTimeInMillis();
    }

    l z(int i10) {
        Calendar calendarD = s.d(this.f20965m);
        calendarD.add(2, i10);
        return new l(calendarD);
    }
}
