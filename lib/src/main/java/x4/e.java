package x4;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.q9;
import com.google.android.gms.measurement.internal.z9;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends p0 implements f {
    public e() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean C(int i10, Parcel parcel, Parcel parcel2, int i11) {
        List listM2;
        switch (i10) {
            case 1:
                com.google.android.gms.measurement.internal.v vVar = (com.google.android.gms.measurement.internal.v) q0.a(parcel, com.google.android.gms.measurement.internal.v.CREATOR);
                z9 z9Var = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                k5(vVar, z9Var);
                parcel2.writeNoException();
                return true;
            case 2:
                q9 q9Var = (q9) q0.a(parcel, q9.CREATOR);
                z9 z9Var2 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                i3(q9Var, z9Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                z9 z9Var3 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                y5(z9Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.v vVar2 = (com.google.android.gms.measurement.internal.v) q0.a(parcel, com.google.android.gms.measurement.internal.v.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                q0.c(parcel);
                y1(vVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                z9 z9Var4 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                D1(z9Var4);
                parcel2.writeNoException();
                return true;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                z9 z9Var5 = (z9) q0.a(parcel, z9.CREATOR);
                boolean zG = q0.g(parcel);
                q0.c(parcel);
                listM2 = m2(z9Var5, zG);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM2);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.v vVar3 = (com.google.android.gms.measurement.internal.v) q0.a(parcel, com.google.android.gms.measurement.internal.v.CREATOR);
                String string3 = parcel.readString();
                q0.c(parcel);
                byte[] bArrQ2 = q2(vVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrQ2);
                return true;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                q0.c(parcel);
                i1(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                z9 z9Var6 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                String strM2 = M2(z9Var6);
                parcel2.writeNoException();
                parcel2.writeString(strM2);
                return true;
            case 12:
                com.google.android.gms.measurement.internal.d dVar = (com.google.android.gms.measurement.internal.d) q0.a(parcel, com.google.android.gms.measurement.internal.d.CREATOR);
                z9 z9Var7 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                b4(dVar, z9Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.measurement.internal.d dVar2 = (com.google.android.gms.measurement.internal.d) q0.a(parcel, com.google.android.gms.measurement.internal.d.CREATOR);
                q0.c(parcel);
                Z1(dVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zG2 = q0.g(parcel);
                z9 z9Var8 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                listM2 = L2(string7, string8, zG2, z9Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM2);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zG3 = q0.g(parcel);
                q0.c(parcel);
                listM2 = T1(string9, string10, string11, zG3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM2);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                z9 z9Var9 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                listM2 = A5(string12, string13, z9Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM2);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                q0.c(parcel);
                listM2 = p3(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM2);
                return true;
            case 18:
                z9 z9Var10 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                v3(z9Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) q0.a(parcel, Bundle.CREATOR);
                z9 z9Var11 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                Q1(bundle, z9Var11);
                parcel2.writeNoException();
                return true;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                z9 z9Var12 = (z9) q0.a(parcel, z9.CREATOR);
                q0.c(parcel);
                A2(z9Var12);
                parcel2.writeNoException();
                return true;
        }
    }
}
