package m3;

import android.content.Context;
import com.google.android.gms.internal.ads.ye0;
import com.google.android.gms.internal.ads.ze0;
import java.io.IOException;

/* loaded from: classes.dex */
final class c1 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final Context f25208c;

    c1(Context context) {
        this.f25208c = context;
    }

    @Override // m3.b0
    public final void a() {
        boolean zC;
        try {
            zC = h3.a.c(this.f25208c);
        } catch (b4.g | IOException | IllegalStateException e5) {
            ze0.e("Fail to get isAdIdFakeForDebugLogging", e5);
            zC = false;
        }
        ye0.j(zC);
        ze0.g("Update ad debug logging enablement as " + zC);
    }
}
