package com.facebook.ads.internal.bridge.gms;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import h3.a;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String str, boolean z10) {
        this.mId = str;
        this.mLimitAdTracking = z10;
    }

    @SuppressLint({"CatchGeneralException"})
    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            a.C0142a c0142aA = a.a(context);
            if (c0142aA != null) {
                return new AdvertisingId(c0142aA.a(), c0142aA.b());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}
