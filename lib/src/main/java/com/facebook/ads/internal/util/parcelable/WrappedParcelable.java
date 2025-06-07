package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    private final byte[] f5492m;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WrappedParcelable[] newArray(int i10) {
            return new WrappedParcelable[i10];
        }
    }

    protected WrappedParcelable(Parcel parcel) {
        this.f5492m = parcel.createByteArray();
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f5492m = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.f5492m = bArr;
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] bArr = this.f5492m;
        if (bArr == null) {
            return null;
        }
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Parcelable parcelable = parcelObtain.readParcelable(classLoader);
        parcelObtain.recycle();
        return parcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f5492m);
    }
}
