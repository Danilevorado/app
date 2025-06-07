package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class wy1 implements xy1 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.dv2 e(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.dv2 r4 = com.google.android.gms.internal.ads.dv2.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.dv2 r4 = com.google.android.gms.internal.ads.dv2.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.dv2 r4 = com.google.android.gms.internal.ads.dv2.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wy1.e(java.lang.String):com.google.android.gms.internal.ads.dv2");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.fv2 f(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = r3
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r3) goto L41
            if (r4 == r2) goto L3e
            com.google.android.gms.internal.ads.fv2 r4 = com.google.android.gms.internal.ads.fv2.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.fv2 r4 = com.google.android.gms.internal.ads.fv2.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.fv2 r4 = com.google.android.gms.internal.ads.fv2.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.fv2 r4 = com.google.android.gms.internal.ads.fv2.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wy1.f(java.lang.String):com.google.android.gms.internal.ads.fv2");
    }

    private static gv2 g(String str) {
        return "native".equals(str) ? gv2.NATIVE : "javascript".equals(str) ? gv2.JAVASCRIPT : gv2.NONE;
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final l4.a a(String str, WebView webView, String str2, String str3, String str4, zy1 zy1Var, yy1 yy1Var, String str5) {
        String strValueOf;
        String str6;
        String strConcat;
        if (!((Boolean) k3.w.c().b(ir.G4)).booleanValue() || !wu2.b()) {
            return null;
        }
        hv2 hv2VarA = hv2.a("Google", str);
        gv2 gv2VarG = g("javascript");
        dv2 dv2VarE = e(yy1Var.toString());
        gv2 gv2Var = gv2.NONE;
        if (gv2VarG == gv2Var) {
            strConcat = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (dv2VarE == null) {
                strValueOf = String.valueOf(yy1Var);
                str6 = "Omid html session error; Unable to parse creative type: ";
            } else {
                gv2 gv2VarG2 = g(str4);
                if (dv2VarE != dv2.VIDEO || gv2VarG2 != gv2Var) {
                    return l4.b.p1(yu2.a(zu2.a(dv2VarE, f(zy1Var.toString()), gv2VarG, gv2VarG2, true), av2.b(hv2VarA, webView, str5, "")));
                }
                strValueOf = String.valueOf(str4);
                str6 = "Omid html session error; Video events owner unknown for video creative: ";
            }
            strConcat = str6.concat(strValueOf);
        }
        ze0.g(strConcat);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final void b(l4.a aVar, View view) {
        if (((Boolean) k3.w.c().b(ir.G4)).booleanValue() && wu2.b()) {
            Object objL0 = l4.b.L0(aVar);
            if (objL0 instanceof yu2) {
                ((yu2) objL0).d(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final l4.a c(String str, WebView webView, String str2, String str3, String str4, String str5, zy1 zy1Var, yy1 yy1Var, String str6) {
        String strValueOf;
        String str7;
        String strConcat;
        if (!((Boolean) k3.w.c().b(ir.G4)).booleanValue() || !wu2.b()) {
            return null;
        }
        hv2 hv2VarA = hv2.a(str5, str);
        gv2 gv2VarG = g("javascript");
        gv2 gv2VarG2 = g(str4);
        dv2 dv2VarE = e(yy1Var.toString());
        gv2 gv2Var = gv2.NONE;
        if (gv2VarG == gv2Var) {
            strConcat = "Omid js session error; Unable to parse impression owner: javascript";
        } else {
            if (dv2VarE == null) {
                strValueOf = String.valueOf(yy1Var);
                str7 = "Omid js session error; Unable to parse creative type: ";
            } else {
                if (dv2VarE != dv2.VIDEO || gv2VarG2 != gv2Var) {
                    return l4.b.p1(yu2.a(zu2.a(dv2VarE, f(zy1Var.toString()), gv2VarG, gv2VarG2, true), av2.c(hv2VarA, webView, str6, "")));
                }
                strValueOf = String.valueOf(str4);
                str7 = "Omid js session error; Video events owner unknown for video creative: ";
            }
            strConcat = str7.concat(strValueOf);
        }
        ze0.g(strConcat);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final boolean d(Context context) {
        if (!((Boolean) k3.w.c().b(ir.G4)).booleanValue()) {
            ze0.g("Omid flag is disabled");
            return false;
        }
        if (wu2.b()) {
            return true;
        }
        wu2.a(context);
        return wu2.b();
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final void d0(l4.a aVar) {
        if (((Boolean) k3.w.c().b(ir.G4)).booleanValue() && wu2.b()) {
            Object objL0 = l4.b.L0(aVar);
            if (objL0 instanceof yu2) {
                ((yu2) objL0).e();
            }
        }
    }
}
