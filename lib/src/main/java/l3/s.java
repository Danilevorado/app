package l3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.f91;
import m3.b2;

/* loaded from: classes.dex */
public final class s {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) throws NumberFormatException {
        if (adOverlayInfoParcel.f5539w != 4 || adOverlayInfoParcel.f5531o != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f5541y.f8255p);
            intent.putExtra("shouldCallOnOverlayOpened", z10);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!i4.m.f()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            j3.t.r();
            b2.o(context, intent);
            return;
        }
        k3.a aVar = adOverlayInfoParcel.f5530n;
        if (aVar != null) {
            aVar.O();
        }
        f91 f91Var = adOverlayInfoParcel.K;
        if (f91Var != null) {
            f91Var.r();
        }
        Activity activityI = adOverlayInfoParcel.f5532p.i();
        i iVar = adOverlayInfoParcel.f5529m;
        if (iVar != null && iVar.f25070v && activityI != null) {
            context = activityI;
        }
        j3.t.j();
        i iVar2 = adOverlayInfoParcel.f5529m;
        a.b(context, iVar2, adOverlayInfoParcel.f5537u, iVar2 != null ? iVar2.f25069u : null);
    }
}
