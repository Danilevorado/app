package l9;

import android.content.ContentProvider;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        String callingPackage = contentProvider.getCallingPackage();
        if (context == null || !TextUtils.equals(callingPackage, context.getPackageName())) {
            throw new SecurityException("Provider does not allow granting of Uri permissions");
        }
    }

    public static void b(ContentProvider contentProvider, String[] strArr) {
        String callingPackage = contentProvider.getCallingPackage();
        if (strArr.length > 0) {
            for (String str : strArr) {
                if (TextUtils.equals(callingPackage, str)) {
                    return;
                }
            }
        }
        throw new SecurityException(contentProvider.getClass().getName() + "queried by an untrusted package.");
    }
}
