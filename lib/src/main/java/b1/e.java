package b1;

import android.app.Notification;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f4347a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4348b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f4349c;

    public e(int i10, Notification notification, int i11) {
        this.f4347a = i10;
        this.f4349c = notification;
        this.f4348b = i11;
    }

    public int a() {
        return this.f4348b;
    }

    public Notification b() {
        return this.f4349c;
    }

    public int c() {
        return this.f4347a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4347a == eVar.f4347a && this.f4348b == eVar.f4348b) {
            return this.f4349c.equals(eVar.f4349c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4347a * 31) + this.f4348b) * 31) + this.f4349c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f4347a + ", mForegroundServiceType=" + this.f4348b + ", mNotification=" + this.f4349c + '}';
    }
}
