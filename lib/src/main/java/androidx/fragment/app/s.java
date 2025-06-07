package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    final String f2932m;

    /* renamed from: n, reason: collision with root package name */
    final String f2933n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f2934o;

    /* renamed from: p, reason: collision with root package name */
    final int f2935p;

    /* renamed from: q, reason: collision with root package name */
    final int f2936q;

    /* renamed from: r, reason: collision with root package name */
    final String f2937r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f2938s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f2939t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f2940u;

    /* renamed from: v, reason: collision with root package name */
    final Bundle f2941v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f2942w;

    /* renamed from: x, reason: collision with root package name */
    final int f2943x;

    /* renamed from: y, reason: collision with root package name */
    Bundle f2944y;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i10) {
            return new s[i10];
        }
    }

    s(Parcel parcel) {
        this.f2932m = parcel.readString();
        this.f2933n = parcel.readString();
        this.f2934o = parcel.readInt() != 0;
        this.f2935p = parcel.readInt();
        this.f2936q = parcel.readInt();
        this.f2937r = parcel.readString();
        this.f2938s = parcel.readInt() != 0;
        this.f2939t = parcel.readInt() != 0;
        this.f2940u = parcel.readInt() != 0;
        this.f2941v = parcel.readBundle();
        this.f2942w = parcel.readInt() != 0;
        this.f2944y = parcel.readBundle();
        this.f2943x = parcel.readInt();
    }

    s(Fragment fragment) {
        this.f2932m = fragment.getClass().getName();
        this.f2933n = fragment.f2677r;
        this.f2934o = fragment.f2685z;
        this.f2935p = fragment.I;
        this.f2936q = fragment.J;
        this.f2937r = fragment.K;
        this.f2938s = fragment.N;
        this.f2939t = fragment.f2684y;
        this.f2940u = fragment.M;
        this.f2941v = fragment.f2678s;
        this.f2942w = fragment.L;
        this.f2943x = fragment.f2663d0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2932m);
        sb2.append(" (");
        sb2.append(this.f2933n);
        sb2.append(")}:");
        if (this.f2934o) {
            sb2.append(" fromLayout");
        }
        if (this.f2936q != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2936q));
        }
        String str = this.f2937r;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2937r);
        }
        if (this.f2938s) {
            sb2.append(" retainInstance");
        }
        if (this.f2939t) {
            sb2.append(" removing");
        }
        if (this.f2940u) {
            sb2.append(" detached");
        }
        if (this.f2942w) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2932m);
        parcel.writeString(this.f2933n);
        parcel.writeInt(this.f2934o ? 1 : 0);
        parcel.writeInt(this.f2935p);
        parcel.writeInt(this.f2936q);
        parcel.writeString(this.f2937r);
        parcel.writeInt(this.f2938s ? 1 : 0);
        parcel.writeInt(this.f2939t ? 1 : 0);
        parcel.writeInt(this.f2940u ? 1 : 0);
        parcel.writeBundle(this.f2941v);
        parcel.writeInt(this.f2942w ? 1 : 0);
        parcel.writeBundle(this.f2944y);
        parcel.writeInt(this.f2943x);
    }
}
