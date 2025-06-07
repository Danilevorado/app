package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
abstract class g04 {
    static String a(ww3 ww3Var) {
        String str;
        StringBuilder sb2 = new StringBuilder(ww3Var.n());
        for (int i10 = 0; i10 < ww3Var.n(); i10++) {
            int iH = ww3Var.h(i10);
            if (iH == 34) {
                str = "\\\"";
            } else if (iH == 39) {
                str = "\\'";
            } else if (iH != 92) {
                switch (iH) {
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iH < 32 || iH > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((iH >>> 6) & 3) + 48));
                            sb2.append((char) (((iH >>> 3) & 7) + 48));
                            iH = (iH & 7) + 48;
                        }
                        sb2.append((char) iH);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
