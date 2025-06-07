package e4;

import android.os.IBinder;
import android.os.Parcel;
import l4.a;

/* loaded from: classes.dex */
public final class q1 extends r4.a implements p0 {
    q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // e4.p0
    public final int d() {
        Parcel parcelC = C(2, w0());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    @Override // e4.p0
    public final l4.a f() {
        Parcel parcelC = C(1, w0());
        l4.a aVarW0 = a.AbstractBinderC0158a.w0(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarW0;
    }
}
