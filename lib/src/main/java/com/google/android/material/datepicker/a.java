package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0098a();

    /* renamed from: m, reason: collision with root package name */
    private final l f20889m;

    /* renamed from: n, reason: collision with root package name */
    private final l f20890n;

    /* renamed from: o, reason: collision with root package name */
    private final c f20891o;

    /* renamed from: p, reason: collision with root package name */
    private l f20892p;

    /* renamed from: q, reason: collision with root package name */
    private final int f20893q;

    /* renamed from: r, reason: collision with root package name */
    private final int f20894r;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0098a implements Parcelable.Creator {
        C0098a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final long f20895e = s.a(l.d(1900, 0).f20970r);

        /* renamed from: f, reason: collision with root package name */
        static final long f20896f = s.a(l.d(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f20970r);

        /* renamed from: a, reason: collision with root package name */
        private long f20897a;

        /* renamed from: b, reason: collision with root package name */
        private long f20898b;

        /* renamed from: c, reason: collision with root package name */
        private Long f20899c;

        /* renamed from: d, reason: collision with root package name */
        private c f20900d;

        b(a aVar) {
            this.f20897a = f20895e;
            this.f20898b = f20896f;
            this.f20900d = f.a(Long.MIN_VALUE);
            this.f20897a = aVar.f20889m.f20970r;
            this.f20898b = aVar.f20890n.f20970r;
            this.f20899c = Long.valueOf(aVar.f20892p.f20970r);
            this.f20900d = aVar.f20891o;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f20900d);
            l lVarG = l.g(this.f20897a);
            l lVarG2 = l.g(this.f20898b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f20899c;
            return new a(lVarG, lVarG2, cVar, l10 == null ? null : l.g(l10.longValue()), null);
        }

        public b b(long j10) {
            this.f20899c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean n(long j10);
    }

    private a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f20889m = lVar;
        this.f20890n = lVar2;
        this.f20892p = lVar3;
        this.f20891o = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f20894r = lVar.A(lVar2) + 1;
        this.f20893q = (lVar2.f20967o - lVar.f20967o) + 1;
    }

    /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0098a c0098a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    l e(l lVar) {
        return lVar.compareTo(this.f20889m) < 0 ? this.f20889m : lVar.compareTo(this.f20890n) > 0 ? this.f20890n : lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20889m.equals(aVar.f20889m) && this.f20890n.equals(aVar.f20890n) && androidx.core.util.c.a(this.f20892p, aVar.f20892p) && this.f20891o.equals(aVar.f20891o);
    }

    public c f() {
        return this.f20891o;
    }

    l g() {
        return this.f20890n;
    }

    int h() {
        return this.f20894r;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20889m, this.f20890n, this.f20892p, this.f20891o});
    }

    l j() {
        return this.f20892p;
    }

    l m() {
        return this.f20889m;
    }

    int r() {
        return this.f20893q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f20889m, 0);
        parcel.writeParcelable(this.f20890n, 0);
        parcel.writeParcelable(this.f20892p, 0);
        parcel.writeParcelable(this.f20891o, 0);
    }
}
