package e4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class d extends f4.a {
    public static final Parcelable.Creator<d> CREATOR = new w();

    /* renamed from: m, reason: collision with root package name */
    public final int f23109m;

    /* renamed from: n, reason: collision with root package name */
    public final String f23110n;

    public d(int i10, String str) {
        this.f23109m = i10;
        this.f23110n = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f23109m == this.f23109m && o.a(dVar.f23110n, this.f23110n);
    }

    public final int hashCode() {
        return this.f23109m;
    }

    public final String toString() {
        return this.f23109m + ":" + this.f23110n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23109m;
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, i11);
        f4.c.q(parcel, 2, this.f23110n, false);
        f4.c.b(parcel, iA);
    }
}
