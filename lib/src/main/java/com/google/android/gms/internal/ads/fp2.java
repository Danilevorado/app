package com.google.android.gms.internal.ads;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public abstract class fp2 {
    public static k3.w2 a(Throwable th) {
        if (th instanceof ez1) {
            ez1 ez1Var = (ez1) th;
            return c(ez1Var.a(), ez1Var.b());
        }
        if (th instanceof yq1) {
            return th.getMessage() == null ? d(((yq1) th).a(), null, null) : d(((yq1) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof m3.z)) {
            return d(1, null, null);
        }
        m3.z zVar = (m3.z) th;
        return new k3.w2(zVar.a(), y33.c(zVar.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static k3.w2 b(Throwable th, fz1 fz1Var) {
        k3.w2 w2Var;
        k3.w2 w2VarA = a(th);
        int i10 = w2VarA.f24788m;
        if ((i10 == 3 || i10 == 0) && (w2Var = w2VarA.f24791p) != null && !w2Var.f24790o.equals("com.google.android.gms.ads")) {
            w2VarA.f24791p = null;
        }
        if (fz1Var != null) {
            w2VarA.f24792q = fz1Var.b();
        }
        return w2VarA;
    }

    public static k3.w2 c(int i10, k3.w2 w2Var) {
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 8) {
            if (((Integer) k3.w.c().b(ir.J7)).intValue() > 0) {
                return w2Var;
            }
            i10 = 8;
        }
        return d(i10, null, w2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static k3.w2 d(int i10, String str, k3.w2 w2Var) {
        String str2;
        int i11;
        String str3;
        if (str == null) {
            int i12 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            switch (i12) {
                case 1:
                    str = "Invalid request.";
                    str2 = str;
                    break;
                case 2:
                    str2 = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    str2 = str;
                    break;
                case 4:
                    str = "Network error.";
                    str2 = str;
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    str2 = str;
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    str2 = str;
                    break;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    str = "A mediation adapter failed to show the ad.";
                    str2 = str;
                    break;
                case 8:
                    str = "The ad is not ready.";
                    str2 = str;
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    str2 = str;
                    break;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    str = "The ad can not be shown when app is not in foreground.";
                    str2 = str;
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    str2 = str;
                    break;
                case 12:
                    if (((Integer) k3.w.c().b(ir.M7)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        str2 = str;
                        break;
                    }
                    str2 = "No fill.";
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    str2 = str;
                    break;
                case 14:
                    str = "Invalid ad string.";
                    str2 = str;
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    str2 = str;
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    str2 = str;
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    str2 = str;
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    str2 = str;
                    break;
            }
        } else {
            str2 = str;
        }
        int i13 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        int i14 = 0;
        switch (i13) {
            case 0:
            case 11:
            case 15:
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i14 = 1;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case 2:
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
            case 18:
                i14 = 3;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case 3:
                i11 = 8;
                i14 = i11;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case 4:
            case 8:
            case 17:
                i14 = 2;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                i11 = 4;
                i14 = i11;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case 12:
                if (((Integer) k3.w.c().b(ir.M7)).intValue() <= 0) {
                    i11 = 9;
                    i14 = i11;
                    return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
                }
                i14 = 3;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case 13:
                i11 = 10;
                i14 = i11;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            case 14:
                i11 = 11;
                i14 = i11;
                return new k3.w2(i14, str2, "com.google.android.gms.ads", w2Var, null);
            default:
                switch (i10) {
                    case 1:
                        str3 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str3 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str3 = "NO_FILL";
                        break;
                    case 4:
                        str3 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str3 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str3 = "INVALID_AD_UNIT_ID";
                        break;
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        str3 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str3 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str3 = "NOT_READY";
                        break;
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                        str3 = "AD_REUSED";
                        break;
                    case 11:
                        str3 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str3 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str3 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str3 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str3 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str3 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str3));
        }
    }
}
