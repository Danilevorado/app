package k3;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bb0;
import com.google.android.gms.internal.ads.cb0;
import com.google.android.gms.internal.ads.ib0;
import com.google.android.gms.internal.ads.ra0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.ta0;
import com.google.android.gms.internal.ads.xa0;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
public final class o3 extends ta0 {
    private static void M5(final bb0 bb0Var) {
        ze0.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        se0.f15201b.post(new Runnable() { // from class: k3.n3
            @Override // java.lang.Runnable
            public final void run() {
                bb0 bb0Var2 = bb0Var;
                if (bb0Var2 != null) {
                    try {
                        bb0Var2.H(1);
                    } catch (RemoteException e5) {
                        ze0.i("#007 Could not call remote method.", e5);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void E4(c4 c4Var, bb0 bb0Var) {
        M5(bb0Var);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void H1(cb0 cb0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void J0(l4.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void O4(l4.a aVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final Bundle b() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final String c() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final j2 d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final ra0 f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void g2(c2 c2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void n0(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void n2(xa0 xa0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void s3(c4 c4Var, bb0 bb0Var) {
        M5(bb0Var);
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void s4(z1 z1Var) {
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void y4(ib0 ib0Var) {
    }
}
