package w9;

import android.R;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class e extends b {
    @Override // w9.b
    public Notification k(d dVar) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Bitmap bitmapM = m(dVar);
        Bitmap bitmapL = l(dVar);
        String strB = b(dVar);
        if (h() == null) {
            return null;
        }
        q8.a aVarE = x9.b.e(h(), strB);
        aVarE.k(i(dVar.e())).e(i(dVar.k())).g(dVar.n()).d(bitmapL, i(dVar.k())).h(bitmapM).j(dVar.f()).b(dVar.l()).a(dVar.s()).i(i(dVar.q())).c(dVar.d()).f(System.currentTimeMillis());
        Iterator it = dVar.a().iterator();
        while (it.hasNext()) {
            x9.b.b(h(), aVarE, (a) it.next());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            aVarE.setExtras(dVar.v());
        }
        Notification notificationBuild = aVarE.build();
        c(notificationBuild, dVar.h(), dVar.j(), dVar.i());
        d(notificationBuild, dVar.o());
        e(notificationBuild, dVar.r());
        a(notificationBuild);
        return notificationBuild;
    }

    protected Bitmap l(d dVar) {
        return z7.f.k(dVar.b(), -1);
    }

    protected Bitmap m(d dVar) {
        int iG = (int) c9.a.j().g(R.dimen.notification_large_icon_height);
        String strG = dVar.g();
        if (strG != null) {
            return z7.f.b(strG, iG);
        }
        return null;
    }
}
