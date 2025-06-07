package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public abstract /* synthetic */ class nt2 {
    public static ot2 a(Context context, int i10) {
        os osVar;
        if (cu2.a()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    case 8:
                        osVar = vs.f16842c;
                        break;
                    case 4:
                    case 9:
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        osVar = vs.f16843d;
                        break;
                    case 5:
                        osVar = vs.f16841b;
                        break;
                }
            } else {
                osVar = vs.f16844e;
            }
            if (((Boolean) osVar.e()).booleanValue()) {
                return new qt2(context, i10);
            }
        }
        return new lu2();
    }

    public static ot2 b(Context context, int i10, int i11, k3.c4 c4Var) {
        ot2 ot2VarA = a(context, i10);
        if (!(ot2VarA instanceof qt2)) {
            return ot2VarA;
        }
        ot2VarA.g();
        ot2VarA.a(i11);
        if (zt2.e(c4Var.B)) {
            ot2VarA.s(c4Var.B);
        }
        return ot2VarA;
    }
}
