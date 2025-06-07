package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0005a();

    /* renamed from: m, reason: collision with root package name */
    private final int f398m;

    /* renamed from: n, reason: collision with root package name */
    private final Intent f399n;

    /* renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    class C0005a implements Parcelable.Creator {
        C0005a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f398m = i10;
        this.f399n = intent;
    }

    a(Parcel parcel) {
        this.f398m = parcel.readInt();
        this.f399n = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f399n;
    }

    public int b() {
        return this.f398m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f398m) + ", data=" + this.f399n + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f398m);
        parcel.writeInt(this.f399n == null ? 0 : 1);
        Intent intent = this.f399n;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
