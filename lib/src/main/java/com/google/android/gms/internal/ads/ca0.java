package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import l4.a;

/* loaded from: classes.dex */
public abstract class ca0 extends ej implements da0 {
    public ca0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ej
    protected final boolean K5(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int iT;
        if (i10 == 1) {
            ha0 ha0Var = (ha0) fj.a(parcel, ha0.CREATOR);
            fj.c(parcel);
            N1(ha0Var);
        } else if (i10 != 2) {
            ga0 ea0Var = null;
            ba0 ba0Var = null;
            if (i10 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    ea0Var = iInterfaceQueryLocalInterface instanceof ga0 ? (ga0) iInterfaceQueryLocalInterface : new ea0(strongBinder);
                }
                fj.c(parcel);
                u2(ea0Var);
            } else {
                if (i10 != 34) {
                    switch (i10) {
                        case 5:
                            iT = t();
                            break;
                        case 6:
                            g();
                            break;
                        case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                            j();
                            break;
                        case 8:
                            c();
                            break;
                        case 9:
                            l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                            fj.c(parcel);
                            i0(aVarW0);
                            break;
                        case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                            l4.a aVarW02 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                            fj.c(parcel);
                            J2(aVarW02);
                            break;
                        case 11:
                            l4.a aVarW03 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                            fj.c(parcel);
                            F0(aVarW03);
                            break;
                        case 12:
                            String strF = f();
                            parcel2.writeNoException();
                            parcel2.writeString(strF);
                            return true;
                        case 13:
                            String string = parcel.readString();
                            fj.c(parcel);
                            M(string);
                            break;
                        case 14:
                            k3.u0 u0VarL5 = k3.t0.L5(parcel.readStrongBinder());
                            fj.c(parcel);
                            d4(u0VarL5);
                            break;
                        case 15:
                            Bundle bundleB = b();
                            parcel2.writeNoException();
                            fj.e(parcel2, bundleB);
                            return true;
                        case 16:
                            IBinder strongBinder2 = parcel.readStrongBinder();
                            if (strongBinder2 != null) {
                                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                ba0Var = iInterfaceQueryLocalInterface2 instanceof ba0 ? (ba0) iInterfaceQueryLocalInterface2 : new ba0(strongBinder2);
                            }
                            fj.c(parcel);
                            X0(ba0Var);
                            break;
                        case 17:
                            parcel.readString();
                            fj.c(parcel);
                            break;
                        case 18:
                            l4.a aVarW04 = a.AbstractBinderC0158a.w0(parcel.readStrongBinder());
                            fj.c(parcel);
                            k0(aVarW04);
                            break;
                        case 19:
                            String string2 = parcel.readString();
                            fj.c(parcel);
                            G5(string2);
                            break;
                        case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                            iT = B();
                            break;
                        case 21:
                            k3.j2 j2VarD = d();
                            parcel2.writeNoException();
                            fj.f(parcel2, j2VarD);
                            return true;
                        default:
                            return false;
                    }
                    parcel2.writeNoException();
                    int i12 = fj.f8294b;
                    parcel2.writeInt(iT);
                    return true;
                }
                boolean zG = fj.g(parcel);
                fj.c(parcel);
                d3(zG);
            }
        } else {
            q();
        }
        parcel2.writeNoException();
        return true;
    }
}
