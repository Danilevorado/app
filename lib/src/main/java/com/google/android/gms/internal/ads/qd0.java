package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;
import l4.a;

/* loaded from: classes.dex */
public abstract class qd0 extends ej implements rd0 {
    public qd0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static rd0 L5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof rd0 ? (rd0) iInterfaceQueryLocalInterface : new pd0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        od0 md0Var = null;
        switch (i10) {
            case 1:
                l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                vd0 vd0Var = (vd0) fj.a(parcel, vd0.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    md0Var = iInterfaceQueryLocalInterface instanceof od0 ? (od0) iInterfaceQueryLocalInterface : new md0(strongBinder);
                }
                fj.c(parcel);
                b5(aVarW0, vd0Var, md0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                R(aVarW02);
                parcel2.writeNoException();
                return true;
            case 3:
                a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
            case 4:
                a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                parcel2.writeNoException();
                fj.f(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                t70 t70VarL5 = s70.L5(parcel.readStrongBinder());
                fj.c(parcel);
                J4(arrayListCreateTypedArrayList, aVarW03, t70VarL5);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                t70 t70VarL52 = s70.L5(parcel.readStrongBinder());
                fj.c(parcel);
                d1(arrayListCreateTypedArrayList2, aVarW04, t70VarL52);
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                w70 w70Var = (w70) fj.a(parcel, w70.CREATOR);
                fj.c(parcel);
                W0(w70Var);
                parcel2.writeNoException();
                return true;
            case 8:
                l4.a aVarW05 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                fj.c(parcel);
                i0(aVarW05);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                l4.a aVarW06 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                t70 t70VarL53 = s70.L5(parcel.readStrongBinder());
                fj.c(parcel);
                v4(arrayListCreateTypedArrayList3, aVarW06, t70VarL53);
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                l4.a aVarW07 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                t70 t70VarL54 = s70.L5(parcel.readStrongBinder());
                fj.c(parcel);
                D5(arrayListCreateTypedArrayList4, aVarW07, t70VarL54);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
