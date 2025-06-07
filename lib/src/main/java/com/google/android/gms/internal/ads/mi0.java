package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class mi0 implements gy {
    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        lh0 lh0Var = (lh0) obj;
        kl0 kl0VarQ = lh0Var.q();
        if (kl0VarQ == null) {
            try {
                kl0 kl0Var = new kl0(lh0Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                lh0Var.H(kl0Var);
                kl0VarQ = kl0Var;
            } catch (NullPointerException e5) {
                e = e5;
                ze0.e("Unable to parse videoMeta message.", e);
                j3.t.q().u(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e10) {
                e = e10;
                ze0.e("Unable to parse videoMeta message.", e);
                j3.t.q().u(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f5 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f10 = Float.parseFloat((String) map.get("currentTime"));
        int i10 = Integer.parseInt((String) map.get("playbackState"));
        int i11 = 0;
        if (i10 >= 0 && i10 <= 3) {
            i11 = i10;
        }
        String str = (String) map.get("aspectRatio");
        float f11 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (ze0.j(3)) {
            ze0.b("Video Meta GMSG: currentTime : " + f10 + " , duration : " + f5 + " , isMuted : " + zEquals + " , playbackState : " + i11 + " , aspectRatio : " + str);
        }
        kl0VarQ.M5(f10, f5, i11, zEquals, f11);
    }
}
