package e4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import e4.j;

/* loaded from: classes.dex */
public class g extends f4.a {

    /* renamed from: m, reason: collision with root package name */
    final int f23139m;

    /* renamed from: n, reason: collision with root package name */
    final int f23140n;

    /* renamed from: o, reason: collision with root package name */
    final int f23141o;

    /* renamed from: p, reason: collision with root package name */
    String f23142p;

    /* renamed from: q, reason: collision with root package name */
    IBinder f23143q;

    /* renamed from: r, reason: collision with root package name */
    Scope[] f23144r;

    /* renamed from: s, reason: collision with root package name */
    Bundle f23145s;

    /* renamed from: t, reason: collision with root package name */
    Account f23146t;

    /* renamed from: u, reason: collision with root package name */
    b4.d[] f23147u;

    /* renamed from: v, reason: collision with root package name */
    b4.d[] f23148v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f23149w;

    /* renamed from: x, reason: collision with root package name */
    final int f23150x;

    /* renamed from: y, reason: collision with root package name */
    boolean f23151y;

    /* renamed from: z, reason: collision with root package name */
    private final String f23152z;
    public static final Parcelable.Creator<g> CREATOR = new h1();
    static final Scope[] A = new Scope[0];
    static final b4.d[] B = new b4.d[0];

    g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, b4.d[] dVarArr, b4.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? A : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? B : dVarArr;
        dVarArr2 = dVarArr2 == null ? B : dVarArr2;
        this.f23139m = i10;
        this.f23140n = i11;
        this.f23141o = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f23142p = "com.google.android.gms";
        } else {
            this.f23142p = str;
        }
        if (i10 < 2) {
            this.f23146t = iBinder != null ? a.L0(j.a.w0(iBinder)) : null;
        } else {
            this.f23143q = iBinder;
            this.f23146t = account;
        }
        this.f23144r = scopeArr;
        this.f23145s = bundle;
        this.f23147u = dVarArr;
        this.f23148v = dVarArr2;
        this.f23149w = z10;
        this.f23150x = i13;
        this.f23151y = z11;
        this.f23152z = str2;
    }

    public final String f() {
        return this.f23152z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        h1.a(this, parcel, i10);
    }
}
