package s8;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import ka.h;
import w9.l;

/* loaded from: classes2.dex */
class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final NotificationManager f27079a;

    private static class a {

        /* renamed from: b, reason: collision with root package name */
        private Uri f27081b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f27082c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27083d;

        /* renamed from: a, reason: collision with root package name */
        private int f27080a = -1;

        /* renamed from: e, reason: collision with root package name */
        private int f27084e = 3;

        public a() {
            h hVarD = ka.e.d();
            e(hVarD.j().a()).f(!hVarD.y().a().equals(l.NO_VIBRATE)).d(hVarD.l().a());
        }

        NotificationChannel a(String str, String str2, String str3) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, this.f27084e);
            if (!this.f27082c) {
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(null);
            } else if (z7.f.j()) {
                notificationChannel.enableVibration(true);
                notificationChannel.setVibrationPattern(s8.a.c());
            }
            notificationChannel.enableLights(this.f27083d);
            notificationChannel.setLightColor(this.f27080a);
            if (this.f27081b != null) {
                notificationChannel.setSound(this.f27081b, new AudioAttributes.Builder().setUsage(5).setContentType(4).build());
            }
            notificationChannel.setDescription(str3);
            return notificationChannel;
        }

        a b(int i10) {
            this.f27084e = i10;
            return this;
        }

        a c(Uri uri) {
            this.f27081b = uri;
            return this;
        }

        a d(boolean z10) {
            this.f27083d = z10;
            return this;
        }

        a e(int i10) {
            this.f27080a = i10;
            return this;
        }

        a f(boolean z10) {
            this.f27082c = z10;
            return this;
        }
    }

    f(NotificationManager notificationManager) {
        this.f27079a = notificationManager;
    }

    @Override // s8.d
    public void a() {
        if (this.f27079a.getNotificationChannel("Push notifications group") != null) {
            this.f27079a.deleteNotificationChannel("Push notifications group");
        }
        e("pw_push_notifications_summary_id", "Push notifications summary", "");
    }

    @Override // s8.d
    public void b(String str, String str2, String str3, w9.d dVar) {
        Uri uriI;
        a aVar = new a();
        if (dVar.h() != null) {
            aVar.e(dVar.h().intValue());
            aVar.d(true);
        }
        if (dVar.o() != null && (uriI = z7.f.i(dVar.o())) != null) {
            aVar.c(uriI);
        }
        aVar.b(s8.a.a(dVar));
        aVar.f(dVar.r());
        this.f27079a.createNotificationChannel(aVar.a(str, str2, str3));
    }

    @Override // s8.d
    public void c(Notification notification, l lVar, boolean z10) {
    }

    @Override // s8.d
    public void d(Notification notification, int i10, int i11, int i12) {
    }

    @Override // s8.d
    public String e(String str, String str2, String str3) {
        NotificationChannel notificationChannelA = new a().a(str, str2, str3);
        notificationChannelA.setSound(null, null);
        notificationChannelA.enableVibration(false);
        this.f27079a.createNotificationChannel(notificationChannelA);
        return str;
    }

    @Override // s8.d
    public void f(Notification notification, Uri uri, boolean z10) {
    }
}
