package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    public int f301m;

    /* renamed from: n, reason: collision with root package name */
    public int f302n;

    /* renamed from: o, reason: collision with root package name */
    public int f303o;

    /* renamed from: p, reason: collision with root package name */
    public int f304p;

    /* renamed from: q, reason: collision with root package name */
    public int f305q;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f301m = parcel.readInt();
        this.f303o = parcel.readInt();
        this.f304p = parcel.readInt();
        this.f305q = parcel.readInt();
        this.f302n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f301m);
        parcel.writeInt(this.f303o);
        parcel.writeInt(this.f304p);
        parcel.writeInt(this.f305q);
        parcel.writeInt(this.f302n);
    }
}
