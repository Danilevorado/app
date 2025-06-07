package b4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4422a = i.f4427a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f4423b = new f();

    f() {
    }

    public static f h() {
        return f4423b;
    }

    public void a(Context context) {
        i.a(context);
    }

    public int b(Context context) {
        return i.b(context);
    }

    public Intent c(int i10) {
        return d(null, i10, null);
    }

    public Intent d(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && i4.i.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f4422a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(k4.c.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent e(Context context, int i10, int i11) {
        return f(context, i10, i11, null);
    }

    public PendingIntent f(Context context, int i10, int i11, String str) {
        Intent intentD = d(context, i10, str);
        if (intentD == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, intentD, r4.d.f26572a | 134217728);
    }

    public String g(int i10) {
        return i.c(i10);
    }

    public int i(Context context) {
        return j(context, f4422a);
    }

    public int j(Context context, int i10) {
        int iH = i.h(context, i10);
        if (i.i(context, iH)) {
            return 18;
        }
        return iH;
    }

    public boolean k(Context context, int i10) {
        return i.i(context, i10);
    }

    public boolean l(Context context, String str) {
        return i.m(context, str);
    }

    public boolean m(int i10) {
        return i.k(i10);
    }
}
