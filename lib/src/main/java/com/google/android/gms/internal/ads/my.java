package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class my implements gy {

    /* renamed from: d, reason: collision with root package name */
    static final Map f12293d = i4.f.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final j3.b f12294a;

    /* renamed from: b, reason: collision with root package name */
    private final h60 f12295b;

    /* renamed from: c, reason: collision with root package name */
    private final o60 f12296c;

    public my(j3.b bVar, h60 h60Var, o60 o60Var) {
        this.f12294a = bVar;
        this.f12295b = h60Var;
        this.f12296c = o60Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws JSONException {
        nk0 nk0Var = (nk0) obj;
        int iIntValue = ((Integer) f12293d.get((String) map.get("a"))).intValue();
        int i10 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                if (!this.f12294a.c()) {
                    this.f12294a.b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f12295b.i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new k60(nk0Var, map).i();
                    return;
                }
                if (iIntValue == 4) {
                    new f60(nk0Var, map).j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f12295b.h(true);
                        return;
                    } else if (iIntValue != 7) {
                        ze0.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f12296c.d();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z10 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (nk0Var == null) {
            ze0.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z10 ? -1 : 14;
        }
        nk0Var.G0(i10);
    }
}
