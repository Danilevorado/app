package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new cn4();

    /* renamed from: m, reason: collision with root package name */
    private int f6295m;

    /* renamed from: n, reason: collision with root package name */
    public final UUID f6296n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6297o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6298p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f6299q;

    b(Parcel parcel) {
        this.f6296n = new UUID(parcel.readLong(), parcel.readLong());
        this.f6297o = parcel.readString();
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f6298p = string;
        this.f6299q = parcel.createByteArray();
    }

    public b(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f6296n = uuid;
        this.f6297o = null;
        this.f6298p = str2;
        this.f6299q = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        return sv2.b(this.f6297o, bVar.f6297o) && sv2.b(this.f6298p, bVar.f6298p) && sv2.b(this.f6296n, bVar.f6296n) && Arrays.equals(this.f6299q, bVar.f6299q);
    }

    public final int hashCode() {
        int i10 = this.f6295m;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f6296n.hashCode() * 31;
        String str = this.f6297o;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6298p.hashCode()) * 31) + Arrays.hashCode(this.f6299q);
        this.f6295m = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6296n.getMostSignificantBits());
        parcel.writeLong(this.f6296n.getLeastSignificantBits());
        parcel.writeString(this.f6297o);
        parcel.writeString(this.f6298p);
        parcel.writeByteArray(this.f6299q);
    }
}
