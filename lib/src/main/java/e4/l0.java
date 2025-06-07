package e4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = f4.b.y(parcel);
        int iT = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = f4.b.r(parcel);
            int iL = f4.b.l(iR);
            if (iL == 1) {
                iT = f4.b.t(parcel, iR);
            } else if (iL == 2) {
                account = (Account) f4.b.e(parcel, iR, Account.CREATOR);
            } else if (iL == 3) {
                iT2 = f4.b.t(parcel, iR);
            } else if (iL != 4) {
                f4.b.x(parcel, iR);
            } else {
                googleSignInAccount = (GoogleSignInAccount) f4.b.e(parcel, iR, GoogleSignInAccount.CREATOR);
            }
        }
        f4.b.k(parcel, iY);
        return new k0(iT, account, iT2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k0[i10];
    }
}
