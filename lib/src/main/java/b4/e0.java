package b4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import e4.r1;

/* loaded from: classes.dex */
public final class e0 extends f4.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: m, reason: collision with root package name */
    private final String f4418m;

    /* renamed from: n, reason: collision with root package name */
    private final v f4419n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f4420o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f4421p;

    e0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f4418m = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                l4.a aVarF = r1.w0(iBinder).f();
                byte[] bArr = aVarF == null ? null : (byte[]) l4.b.L0(aVarF);
                if (bArr != null) {
                    wVar = new w(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e5) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e5);
            }
        }
        this.f4419n = wVar;
        this.f4420o = z10;
        this.f4421p = z11;
    }

    e0(String str, v vVar, boolean z10, boolean z11) {
        this.f4418m = str;
        this.f4419n = vVar;
        this.f4420o = z10;
        this.f4421p = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f4418m;
        int iA = f4.c.a(parcel);
        f4.c.q(parcel, 1, str, false);
        v vVar = this.f4419n;
        if (vVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            vVar = null;
        }
        f4.c.j(parcel, 2, vVar, false);
        f4.c.c(parcel, 3, this.f4420o);
        f4.c.c(parcel, 4, this.f4421p);
        f4.c.b(parcel, iA);
    }
}
