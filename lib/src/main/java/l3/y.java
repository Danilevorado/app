package l3;

import android.app.Activity;
import android.os.Bundle;
import m3.n1;

/* loaded from: classes.dex */
public final class y extends r {
    public y(Activity activity) {
        super(activity);
    }

    @Override // l3.r, com.google.android.gms.internal.ads.d70
    public final void S2(Bundle bundle) {
        n1.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.F = 4;
        this.f25082m.finish();
    }
}
