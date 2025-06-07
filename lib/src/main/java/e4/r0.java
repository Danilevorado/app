package e4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class r0 implements m {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f23225m;

    r0(IBinder iBinder) {
        this.f23225m = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f23225m;
    }

    @Override // e4.m
    public final void t5(l lVar, g gVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (gVar != null) {
                parcelObtain.writeInt(1);
                h1.a(gVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f23225m.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
