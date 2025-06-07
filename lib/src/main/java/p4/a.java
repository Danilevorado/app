package p4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f25916m;

    /* renamed from: n, reason: collision with root package name */
    private final String f25917n;

    protected a(IBinder iBinder, String str) {
        this.f25916m = iBinder;
        this.f25917n = str;
    }

    protected final Parcel C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f25917n);
        return parcelObtain;
    }

    protected final void L0(int i10, Parcel parcel) {
        try {
            this.f25916m.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25916m;
    }

    protected final void w0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f25916m.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
