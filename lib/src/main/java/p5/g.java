package p5;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public abstract class g {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT < 31 || (i10 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i10 == 0) {
            return null;
        }
        return Typeface.create(typeface, a0.a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, AdError.NETWORK_ERROR_CODE), typeface.isItalic());
    }
}
