package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f2916m;

    /* renamed from: n, reason: collision with root package name */
    ArrayList f2917n;

    /* renamed from: o, reason: collision with root package name */
    b[] f2918o;

    /* renamed from: p, reason: collision with root package name */
    int f2919p;

    /* renamed from: q, reason: collision with root package name */
    String f2920q;

    /* renamed from: r, reason: collision with root package name */
    ArrayList f2921r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f2922s;

    /* renamed from: t, reason: collision with root package name */
    ArrayList f2923t;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o() {
        this.f2920q = null;
        this.f2921r = new ArrayList();
        this.f2922s = new ArrayList();
    }

    public o(Parcel parcel) {
        this.f2920q = null;
        this.f2921r = new ArrayList();
        this.f2922s = new ArrayList();
        this.f2916m = parcel.createTypedArrayList(s.CREATOR);
        this.f2917n = parcel.createStringArrayList();
        this.f2918o = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2919p = parcel.readInt();
        this.f2920q = parcel.readString();
        this.f2921r = parcel.createStringArrayList();
        this.f2922s = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2923t = parcel.createTypedArrayList(m.C0045m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f2916m);
        parcel.writeStringList(this.f2917n);
        parcel.writeTypedArray(this.f2918o, i10);
        parcel.writeInt(this.f2919p);
        parcel.writeString(this.f2920q);
        parcel.writeStringList(this.f2921r);
        parcel.writeTypedList(this.f2922s);
        parcel.writeTypedList(this.f2923t);
    }
}
