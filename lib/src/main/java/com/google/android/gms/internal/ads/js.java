package com.google.android.gms.internal.ads;

import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
public abstract class js {
    public static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 2:
                return "CONTEXT_NOT_AN_ACTIVITY";
            case 3:
                return "CONTEXT_NULL";
            case 4:
                return "CCT_NOT_SUPPORTED";
            case 5:
                return "CCT_READY_TO_OPEN";
            case 6:
                return "ACTIVITY_NOT_FOUND";
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return "EMPTY_URL";
            case 8:
                return "UNKNOWN";
            default:
                return "WRONG_EXP_SETUP";
        }
    }
}
