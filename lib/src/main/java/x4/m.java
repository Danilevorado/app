package x4;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class m {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(b4.k.f4440a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
