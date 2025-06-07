package n7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import n7.l;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25551a = "PushwooshInitializer";

    private static void a(Context context) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("com.pushwoosh.xamarin.internal.XamarinPluginProvider");
            h8.a.class.getMethod("init", Context.class).invoke(null, context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public static void b(Context context, boolean z10) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (c() && !z10) {
            k9.h.v(f25551a, "already init");
            return;
        }
        j9.b.f();
        c9.a.m(context);
        ta.i.a(context);
        a(context);
        if (j9.b.d() == null) {
            k9.h.l(f25551a, "No attached push notifications providers have been found.\nThis error can be seen when you use 'pushwoosh-huawei' module\nnot on Huawei device or you have not added any module attaching\npush notifications provider.\nPushwoosh supports Firebase, Amazon, Huawei, Baidu push notification providers.\nSee the integration guide https://docs.pushwoosh.com/platform-docs/pushwoosh-sdk/android-push-notifications");
            return;
        }
        p pVar = new p();
        if (z10) {
            pVar.B(false);
        }
        l lVarC = new l.b().b(pVar).a(j9.b.d().i()).c();
        if (pVar.C()) {
            return;
        }
        lVarC.p();
        c9.a.c().c(lVarC.c().g());
        k9.d dVar = new k9.d();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ANSWER");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(dVar, intentFilter, 4);
        } else {
            context.registerReceiver(dVar, intentFilter);
        }
        k9.h.v(f25551a, "Pushwoosh init finished");
    }

    private static boolean c() {
        return (!j9.b.f() || l.i() == null || c9.a.b() == null) ? false : true;
    }

    public static void d(Context context) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        b(context, false);
    }
}
