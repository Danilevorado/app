package r4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f26569m;

    /* renamed from: n, reason: collision with root package name */
    private final String f26570n;

    protected a(IBinder iBinder, String str) {
        this.f26569m = iBinder;
        this.f26570n = str;
    }

    protected final Parcel C(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f26569m.transact(i10, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26569m;
    }

    protected final Parcel w0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f26570n);
        return parcelObtain;
    }
}
