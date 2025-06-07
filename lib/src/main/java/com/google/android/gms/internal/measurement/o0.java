package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class o0 implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f19139m;

    /* renamed from: n, reason: collision with root package name */
    private final String f19140n;

    protected o0(IBinder iBinder, String str) {
        this.f19139m = iBinder;
        this.f19140n = str;
    }

    protected final Parcel C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f19140n);
        return parcelObtain;
    }

    protected final void L0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f19139m.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19139m;
    }

    protected final Parcel w0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f19139m.transact(i10, parcel, parcelObtain, 0);
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
