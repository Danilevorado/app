package w9;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.l;
import com.pushwoosh.notification.NotificationOpenActivity;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: c, reason: collision with root package name */
    public static String f28072c = "pushwoosh_need_to_add_new_notification_channel_id";

    /* renamed from: a, reason: collision with root package name */
    private final Context f28073a;

    /* renamed from: b, reason: collision with root package name */
    private s8.b f28074b;

    j() {
        Context contextB = c9.a.b();
        this.f28073a = contextB;
        this.f28074b = new s8.b(contextB);
    }

    private String a() {
        return this.f28074b.a("Push notifications summary");
    }

    public static Intent d() {
        Intent intent = new Intent(c9.a.b(), (Class<?>) NotificationOpenActivity.class);
        intent.setAction("summary-" + System.currentTimeMillis());
        return intent;
    }

    public boolean b() {
        return false;
    }

    protected final Context c() {
        return this.f28073a;
    }

    public final Notification e(int i10, String str, String str2) {
        if (!f()) {
            return null;
        }
        if (c() == null) {
            k9.h.k("onGenerateSummaryNotification Incorrect state of app. Context is null");
            return null;
        }
        int iH = h();
        if (iH == -1) {
            iH = z7.f.n(null);
        }
        int iG = g();
        if (iG == -1) {
            iG = ka.e.d().e().a();
        }
        if (TextUtils.equals(str, f28072c)) {
            str = a();
        }
        q8.b bVarF = x9.b.f(c(), str);
        bVarF.g(iH).b(iG).a(i10).d(b()).c(str2).e(true);
        String strI = i(i10);
        if (!TextUtils.isEmpty(strI)) {
            bVarF.f(new l.g().j(strI));
        }
        return bVarF.build();
    }

    public boolean f() {
        return true;
    }

    public abstract int g();

    public abstract int h();

    public abstract String i(int i10);
}
