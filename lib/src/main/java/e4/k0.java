package e4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class k0 extends f4.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: m, reason: collision with root package name */
    final int f23182m;

    /* renamed from: n, reason: collision with root package name */
    private final Account f23183n;

    /* renamed from: o, reason: collision with root package name */
    private final int f23184o;

    /* renamed from: p, reason: collision with root package name */
    private final GoogleSignInAccount f23185p;

    k0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f23182m = i10;
        this.f23183n = account;
        this.f23184o = i11;
        this.f23185p = googleSignInAccount;
    }

    public k0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23182m;
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, i11);
        f4.c.p(parcel, 2, this.f23183n, i10, false);
        f4.c.k(parcel, 3, this.f23184o);
        f4.c.p(parcel, 4, this.f23185p, i10, false);
        f4.c.b(parcel, iA);
    }
}
