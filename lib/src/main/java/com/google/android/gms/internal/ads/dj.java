package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class dj implements IInterface {

    /* renamed from: m, reason: collision with root package name */
    private final IBinder f7334m;

    /* renamed from: n, reason: collision with root package name */
    private final String f7335n;

    protected dj(IBinder iBinder, String str) {
        this.f7334m = iBinder;
        this.f7335n = str;
    }

    protected final Parcel C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7335n);
        return parcelObtain;
    }

    protected final void L0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f7334m.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7334m;
    }

    protected final void p1(int i10, Parcel parcel) {
        try {
            this.f7334m.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel w0(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7334m.transact(i10, parcel, parcelObtain, 0);
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
