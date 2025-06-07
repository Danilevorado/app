package o4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f25734m;

    /* renamed from: n, reason: collision with root package name */
    private final String f25735n = "com.google.android.gms.appset.internal.IAppSetService";

    protected a(IBinder iBinder, String str) {
        this.f25734m = iBinder;
    }

    protected final Parcel C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f25735n);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25734m;
    }

    protected final void w0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f25734m.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
