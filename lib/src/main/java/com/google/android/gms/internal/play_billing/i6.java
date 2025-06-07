package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class i6 implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f19553m;

    /* renamed from: n, reason: collision with root package name */
    private final String f19554n = "com.android.vending.billing.IInAppBillingService";

    protected i6(IBinder iBinder, String str) {
        this.f19553m = iBinder;
    }

    protected final Parcel C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f19554n);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19553m;
    }

    protected final Parcel w0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f19553m.transact(i10, parcel, parcelObtain, 0);
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
