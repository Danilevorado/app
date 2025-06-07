package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.c70;
import com.google.android.gms.internal.ads.d70;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.rd0;
import com.google.android.gms.internal.ads.ta0;
import com.google.android.gms.internal.ads.tu;
import com.google.android.gms.internal.ads.ua0;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.v60;
import com.google.android.gms.internal.ads.w60;

/* loaded from: classes.dex */
public final class z0 extends dj implements b1 {
    z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // k3.b1
    public final ua0 A1(l4.a aVar, String str, o30 o30Var, int i10) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString(str);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(12, parcelC);
        ua0 ua0VarL5 = ta0.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return ua0VarL5;
    }

    @Override // k3.b1
    public final q0 A3(l4.a aVar, h4 h4Var, String str, o30 o30Var, int i10) {
        q0 o0Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, h4Var);
        parcelC.writeString(str);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(13, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            o0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            o0Var = iInterfaceQueryLocalInterface instanceof q0 ? (q0) iInterfaceQueryLocalInterface : new o0(strongBinder);
        }
        parcelW0.recycle();
        return o0Var;
    }

    @Override // k3.b1
    public final f2 G1(l4.a aVar, o30 o30Var, int i10) {
        f2 d2Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(17, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            d2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            d2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new d2(strongBinder);
        }
        parcelW0.recycle();
        return d2Var;
    }

    @Override // k3.b1
    public final d70 J0(l4.a aVar) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        Parcel parcelW0 = w0(8, parcelC);
        d70 d70VarL5 = c70.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return d70VarL5;
    }

    @Override // k3.b1
    public final uu R0(l4.a aVar, l4.a aVar2) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, aVar2);
        Parcel parcelW0 = w0(5, parcelC);
        uu uuVarL5 = tu.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return uuVarL5;
    }

    @Override // k3.b1
    public final rd0 W1(l4.a aVar, o30 o30Var, int i10) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(14, parcelC);
        rd0 rd0VarL5 = qd0.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return rd0VarL5;
    }

    @Override // k3.b1
    public final q0 i2(l4.a aVar, h4 h4Var, String str, o30 o30Var, int i10) {
        q0 o0Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, h4Var);
        parcelC.writeString(str);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(1, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            o0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            o0Var = iInterfaceQueryLocalInterface instanceof q0 ? (q0) iInterfaceQueryLocalInterface : new o0(strongBinder);
        }
        parcelW0.recycle();
        return o0Var;
    }

    @Override // k3.b1
    public final w60 j1(l4.a aVar, o30 o30Var, int i10) {
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(15, parcelC);
        w60 w60VarL5 = v60.L5(parcelW0.readStrongBinder());
        parcelW0.recycle();
        return w60VarL5;
    }

    @Override // k3.b1
    public final q0 k1(l4.a aVar, h4 h4Var, String str, o30 o30Var, int i10) {
        q0 o0Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, h4Var);
        parcelC.writeString(str);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(2, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            o0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            o0Var = iInterfaceQueryLocalInterface instanceof q0 ? (q0) iInterfaceQueryLocalInterface : new o0(strongBinder);
        }
        parcelW0.recycle();
        return o0Var;
    }

    @Override // k3.b1
    public final q0 s2(l4.a aVar, h4 h4Var, String str, int i10) {
        q0 o0Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        fj.d(parcelC, h4Var);
        parcelC.writeString(str);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(10, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            o0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            o0Var = iInterfaceQueryLocalInterface instanceof q0 ? (q0) iInterfaceQueryLocalInterface : new o0(strongBinder);
        }
        parcelW0.recycle();
        return o0Var;
    }

    @Override // k3.b1
    public final m0 x1(l4.a aVar, String str, o30 o30Var, int i10) {
        m0 k0Var;
        Parcel parcelC = C();
        fj.f(parcelC, aVar);
        parcelC.writeString(str);
        fj.f(parcelC, o30Var);
        parcelC.writeInt(231004000);
        Parcel parcelW0 = w0(3, parcelC);
        IBinder strongBinder = parcelW0.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            k0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelW0.recycle();
        return k0Var;
    }
}
