package h1;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24008a = b1.j.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            b1.j jVarE = b1.j.e();
            String str = f24008a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            jVarE.a(str, sb2.toString());
        } catch (Exception e5) {
            b1.j jVarE2 = b1.j.e();
            String str2 = f24008a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            jVarE2.b(str2, sb3.toString(), e5);
        }
    }
}
