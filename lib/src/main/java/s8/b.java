package s8;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import w9.l;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final d f27078a;

    public b(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27078a = new f(notificationManager);
        } else {
            this.f27078a = new e();
        }
    }

    public String a(String str) {
        return this.f27078a.e("pw_push_notifications_summary_id", str, "");
    }

    public String b(w9.d dVar, String str, String str2) {
        String strD = a.d(dVar);
        String strB = a.b(strD);
        if (TextUtils.isEmpty(str)) {
            str = strD;
        }
        this.f27078a.b(strB, str, str2, dVar);
        return strB;
    }

    public void c() {
        this.f27078a.a();
    }

    public void d(Notification notification, int i10, int i11, int i12) {
        this.f27078a.d(notification, i10, i11, i12);
    }

    public void e(Notification notification, Uri uri, boolean z10) {
        this.f27078a.f(notification, uri, z10);
    }

    public void f(Notification notification, l lVar, boolean z10) {
        this.f27078a.c(notification, lVar, z10);
    }
}
