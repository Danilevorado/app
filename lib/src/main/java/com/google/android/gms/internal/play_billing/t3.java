package com.google.android.gms.internal.play_billing;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
abstract class t3 {
    static String a(q0 q0Var) {
        String str;
        StringBuilder sb2 = new StringBuilder(q0Var.h());
        for (int i10 = 0; i10 < q0Var.h(); i10++) {
            int iE = q0Var.e(i10);
            if (iE == 34) {
                str = "\\\"";
            } else if (iE == 39) {
                str = "\\'";
            } else if (iE != 92) {
                switch (iE) {
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
                        if (iE < 32 || iE > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((iE >>> 6) & 3) + 48));
                            sb2.append((char) (((iE >>> 3) & 7) + 48));
                            iE = (iE & 7) + 48;
                        }
                        sb2.append((char) iE);
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
