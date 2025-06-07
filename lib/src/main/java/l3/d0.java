package l3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.c70;
import com.google.android.gms.internal.ads.f91;
import com.google.android.gms.internal.ads.ir;

/* loaded from: classes.dex */
public final class d0 extends c70 {

    /* renamed from: m, reason: collision with root package name */
    private final AdOverlayInfoParcel f25057m;

    /* renamed from: n, reason: collision with root package name */
    private final Activity f25058n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25059o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25060p = false;

    public d0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f25057m = adOverlayInfoParcel;
        this.f25058n = activity;
    }

    private final synchronized void b() {
        if (this.f25060p) {
            return;
        }
        t tVar = this.f25057m.f5531o;
        if (tVar != null) {
            tVar.C(4);
        }
        this.f25060p = true;
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void B() {
        if (this.f25058n.isFinishing()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void D() {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void N4(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void R(l4.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void S2(Bundle bundle) {
        t tVar;
        if (((Boolean) k3.w.c().b(ir.f9987j8)).booleanValue()) {
            this.f25058n.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25057m;
        if (adOverlayInfoParcel != null && !z10) {
            if (bundle == null) {
                k3.a aVar = adOverlayInfoParcel.f5530n;
                if (aVar != null) {
                    aVar.O();
                }
                f91 f91Var = this.f25057m.K;
                if (f91Var != null) {
                    f91Var.r();
                }
                if (this.f25058n.getIntent() != null && this.f25058n.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (tVar = this.f25057m.f5531o) != null) {
                    tVar.b();
                }
            }
            j3.t.j();
            Activity activity = this.f25058n;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f25057m;
            i iVar = adOverlayInfoParcel2.f5529m;
            if (a.b(activity, iVar, adOverlayInfoParcel2.f5537u, iVar.f25069u)) {
                return;
            }
        }
        this.f25058n.finish();
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void Y0(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void f0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f25059o);
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void l() {
        if (this.f25058n.isFinishing()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void m() {
        t tVar = this.f25057m.f5531o;
        if (tVar != null) {
            tVar.L0();
        }
        if (this.f25058n.isFinishing()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void q() {
        if (this.f25059o) {
            this.f25058n.finish();
            return;
        }
        this.f25059o = true;
        t tVar = this.f25057m.f5531o;
        if (tVar != null) {
            tVar.w0();
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final void u() {
        t tVar = this.f25057m.f5531o;
        if (tVar != null) {
            tVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.d70
    public final boolean z() {
        return false;
    }
}
