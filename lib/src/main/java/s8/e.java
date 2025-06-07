package s8;

import android.app.Notification;
import android.media.AudioManager;
import android.net.Uri;
import w9.l;

/* loaded from: classes2.dex */
class e implements d {
    e() {
    }

    @Override // s8.d
    public void a() {
    }

    @Override // s8.d
    public void b(String str, String str2, String str3, w9.d dVar) {
    }

    @Override // s8.d
    public void c(Notification notification, l lVar, boolean z10) {
        AudioManager audioManagerH = c9.a.e().h();
        if (audioManagerH == null) {
            return;
        }
        if ((z10 || lVar == l.ALWAYS || (audioManagerH.getRingerMode() == 1 && lVar == l.DEFAULT_MODE)) && z7.f.j()) {
            notification.defaults |= 2;
        }
    }

    @Override // s8.d
    public void d(Notification notification, int i10, int i11, int i12) {
        notification.ledARGB = i10;
        notification.flags |= 1;
        notification.ledOnMS = i11;
        notification.ledOffMS = i12;
    }

    @Override // s8.d
    public String e(String str, String str2, String str3) {
        return "Stub!";
    }

    @Override // s8.d
    public void f(Notification notification, Uri uri, boolean z10) {
        notification.sound = uri;
        if (z10) {
            notification.defaults |= 1;
        }
    }
}
