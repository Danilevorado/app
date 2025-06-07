package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f6 extends i6 implements h6 {
    f6(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Bundle H2(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeInt(6);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        k6.b(parcelC, bundle);
        Parcel parcelW0 = w0(9, parcelC);
        Bundle bundle2 = (Bundle) k6.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Bundle H4(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelC = C();
        parcelC.writeInt(3);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        parcelC.writeString(null);
        Parcel parcelW0 = w0(3, parcelC);
        Bundle bundle = (Bundle) k6.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Bundle J1(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        k6.b(parcelC, bundle);
        k6.b(parcelC, bundle2);
        Parcel parcelW0 = w0(901, parcelC);
        Bundle bundle3 = (Bundle) k6.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int P1(int i10, String str, String str2) {
        Parcel parcelC = C();
        parcelC.writeInt(3);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        Parcel parcelW0 = w0(5, parcelC);
        int i11 = parcelW0.readInt();
        parcelW0.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Bundle V1(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeInt(9);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        k6.b(parcelC, bundle);
        Parcel parcelW0 = w0(12, parcelC);
        Bundle bundle2 = (Bundle) k6.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Bundle l2(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeString(str3);
        parcelC.writeString(null);
        k6.b(parcelC, bundle);
        Parcel parcelW0 = w0(8, parcelC);
        Bundle bundle2 = (Bundle) k6.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int n4(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        k6.b(parcelC, bundle);
        Parcel parcelW0 = w0(10, parcelC);
        int i11 = parcelW0.readInt();
        parcelW0.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Bundle r5(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeInt(9);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        k6.b(parcelC, bundle);
        Parcel parcelW0 = w0(902, parcelC);
        Bundle bundle2 = (Bundle) k6.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final Bundle w2(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelC = C();
        parcelC.writeInt(3);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        k6.b(parcelC, bundle);
        Parcel parcelW0 = w0(2, parcelC);
        Bundle bundle2 = (Bundle) k6.a(parcelW0, Bundle.CREATOR);
        parcelW0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.h6
    public final int z2(int i10, String str, String str2) {
        Parcel parcelC = C();
        parcelC.writeInt(i10);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        Parcel parcelW0 = w0(1, parcelC);
        int i11 = parcelW0.readInt();
        parcelW0.recycle();
        return i11;
    }
}
