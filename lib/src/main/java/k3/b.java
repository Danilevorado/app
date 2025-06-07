package k3;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.c70;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.f70;
import com.google.android.gms.internal.ads.g70;
import com.google.android.gms.internal.ads.ir;

/* loaded from: classes.dex */
final class b extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f24604b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f24605c;

    b(r rVar, Activity activity) {
        this.f24605c = rVar;
        this.f24604b = activity;
    }

    @Override // k3.s
    protected final /* bridge */ /* synthetic */ Object a() {
        r.p(this.f24604b, "ad_overlay");
        return null;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.J0(l4.b.p1(this.f24604b));
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        ir.a(this.f24604b);
        if (!((Boolean) w.c().b(ir.f9944f9)).booleanValue()) {
            return this.f24605c.f24727f.c(this.f24604b);
        }
        try {
            return c70.L5(((g70) df0.b(this.f24604b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new bf0() { // from class: k3.q4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    return f70.L5(obj);
                }
            })).zze(l4.b.p1(this.f24604b)));
        } catch (RemoteException | cf0 | NullPointerException e5) {
            this.f24605c.f24729h = b80.c(this.f24604b.getApplicationContext());
            this.f24605c.f24729h.a(e5, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
