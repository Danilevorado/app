package com.facebook.ads.internal.bridge.fbsdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class FBLoginASID {
    @SuppressLint({"CatchGeneralException"})
    public static String getFBLoginASID() {
        try {
            Object objInvoke = Class.forName("com.facebook.AccessToken").getDeclaredMethod("getCurrentAccessToken", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke != null) {
                return (String) Class.forName("com.facebook.AccessToken").getDeclaredMethod("getUserId", new Class[0]).invoke(objInvoke, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
