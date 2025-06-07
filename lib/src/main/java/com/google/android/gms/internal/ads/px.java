package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class px implements gy {
    px() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str;
        nk0 nk0Var = (nk0) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            j13 j13VarJ = k13.j();
            j13VarJ.b((String) map.get("appId"));
            j13VarJ.h(nk0Var.getWidth());
            j13VarJ.g(nk0Var.z().getWindowToken());
            j13VarJ.d((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            j13VarJ.e(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                j13VarJ.a((String) map.get("enifd"));
            }
            try {
                j3.t.l().j(nk0Var, j13VarJ.i());
                return;
            } catch (NullPointerException e5) {
                j3.t.q().u(e5, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        m3.n1.k(str);
    }
}
