package o7;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.o;
import k9.h;
import s8.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25810a = a.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private Context f25811b;

    /* renamed from: c, reason: collision with root package name */
    private NotificationManager f25812c;

    public a(Context context, NotificationManager notificationManager) {
        this.f25811b = context;
        this.f25812c = notificationManager;
    }

    private int a() {
        NotificationManager notificationManager = this.f25812c;
        if (notificationManager != null) {
            return c.b(notificationManager);
        }
        h.l(this.f25810a, "notificationManager is null");
        return 6;
    }

    private boolean c() {
        return o.e(this.f25811b).a();
    }

    public int b() {
        if (Build.VERSION.SDK_INT < 26) {
            return c() ? 6 : 0;
        }
        if (c()) {
            return a();
        }
        return 0;
    }
}
