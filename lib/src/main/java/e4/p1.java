package e4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class p1 extends r4.a implements j {
    p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // e4.j
    public final Account b() {
        Parcel parcelC = C(2, w0());
        Account account = (Account) r4.c.a(parcelC, Account.CREATOR);
        parcelC.recycle();
        return account;
    }
}
