package s4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f26879m;

    /* renamed from: n, reason: collision with root package name */
    private final String f26880n;

    protected a(IBinder iBinder, String str) {
        this.f26879m = iBinder;
        this.f26880n = str;
    }

    protected final Parcel C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f26880n);
        return parcelObtain;
    }

    protected final void L0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f26879m.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26879m;
    }

    protected final Parcel w0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f26879m.transact(i10, parcel, parcelObtain, 0);
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
