package n4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f25515m;

    /* renamed from: n, reason: collision with root package name */
    private final String f25516n = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected a(IBinder iBinder, String str) {
        this.f25515m = iBinder;
    }

    protected final Parcel C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f25516n);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25515m;
    }

    protected final Parcel w0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f25515m.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e5) {
                parcelObtain.recycle();
                throw e5;
            }
        } finally {
            parcel.recycle();
        }
    }
}
