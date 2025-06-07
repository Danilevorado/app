package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    private final int f292m;

    /* renamed from: n, reason: collision with root package name */
    private final float f293n;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    RatingCompat(int i10, float f5) {
        this.f292m = i10;
        this.f293n = f5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f292m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f292m);
        sb2.append(" rating=");
        float f5 = this.f293n;
        sb2.append(f5 < 0.0f ? "unrated" : String.valueOf(f5));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f292m);
        parcel.writeFloat(this.f293n);
    }
}
