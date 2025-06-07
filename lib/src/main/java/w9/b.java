package w9;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import com.pushwoosh.notification.NotificationOpenActivity;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28022a;

    /* renamed from: b, reason: collision with root package name */
    private s8.b f28023b;

    public b() {
        Context contextB = c9.a.b();
        this.f28022a = contextB;
        this.f28023b = new s8.b(contextB);
    }

    protected final void a(Notification notification) {
        notification.flags |= 16;
    }

    protected String b(d dVar) {
        String strD = s8.a.d(dVar);
        return this.f28023b.b(dVar, g(strD), f(strD));
    }

    protected final void c(Notification notification, Integer num, int i10, int i11) {
        ka.h hVarD = ka.e.d();
        boolean zA = hVarD.k().a();
        int iA = hVarD.j().a();
        if (zA || num != null) {
            s8.b bVar = this.f28023b;
            if (num != null) {
                iA = num.intValue();
            }
            bVar.d(notification, iA, i10, i11);
        }
    }

    protected final void d(Notification notification, String str) {
        Uri uriI = z7.f.i(str);
        if (uriI != null) {
            this.f28023b.e(notification, uriI, str == null);
        }
    }

    protected final void e(Notification notification, boolean z10) {
        this.f28023b.f(notification, ka.e.d().y().a(), z10);
    }

    public String f(String str) {
        return "";
    }

    public String g(String str) {
        return str;
    }

    protected final Context h() {
        return this.f28022a;
    }

    protected final CharSequence i(String str) {
        return TextUtils.isEmpty(str) ? str : Html.fromHtml(str);
    }

    public Intent j(d dVar) {
        Intent intent = new Intent(this.f28022a, (Class<?>) NotificationOpenActivity.class);
        intent.putExtra("pushBundle", dVar.v());
        intent.setAction(Long.toString(System.currentTimeMillis()));
        return intent;
    }

    public abstract Notification k(d dVar);
}
