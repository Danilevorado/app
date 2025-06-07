package l7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final List f25148a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f25149b;

    /* renamed from: c, reason: collision with root package name */
    private static a f25150c;

    /* renamed from: d, reason: collision with root package name */
    private static ComponentName f25151d;

    static {
        LinkedList linkedList = new LinkedList();
        f25148a = linkedList;
        f25149b = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    public static void a(Context context, int i10) throws b {
        if (f25150c == null && !b(context)) {
            throw new b("No default launcher available");
        }
        try {
            f25150c.b(context, f25151d, i10);
        } catch (Exception e5) {
            throw new b("Unable to execute badge", e5);
        }
    }

    private static boolean b(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f25151d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveInfoResolveActivity.activityInfo.packageName;
        Iterator it = f25148a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a aVar = null;
            try {
                aVar = (a) ((Class) it.next()).newInstance();
            } catch (Exception unused) {
            }
            if (aVar != null && aVar.a().contains(str)) {
                f25150c = aVar;
                break;
            }
        }
        if (f25150c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        f25150c = str2.equalsIgnoreCase("ZUK") ? new ZukHomeBadger() : str2.equalsIgnoreCase("OPPO") ? new OPPOHomeBader() : str2.equalsIgnoreCase("VIVO") ? new VivoHomeBadger() : new DefaultBadger();
        return true;
    }
}
