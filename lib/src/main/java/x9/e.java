package x9;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;

/* loaded from: classes2.dex */
class e implements q8.a {

    /* renamed from: a, reason: collision with root package name */
    private final Notification.Builder f28372a;

    e(Context context, String str) {
        this.f28372a = new Notification.Builder(context, str);
    }

    @Override // q8.a
    public q8.a a(int i10) {
        this.f28372a.setVisibility(i10);
        return this;
    }

    @Override // q8.a
    public q8.a b(int i10) {
        this.f28372a.setPriority(i10);
        return this;
    }

    @Override // q8.a
    public Notification build() {
        return this.f28372a.build();
    }

    @Override // q8.a
    public q8.a c(String str) {
        this.f28372a.setGroup(str);
        return this;
    }

    @Override // q8.a
    public q8.a d(Bitmap bitmap, CharSequence charSequence) {
        this.f28372a.setStyle(bitmap != null ? new Notification.BigPictureStyle().bigPicture(bitmap).setSummaryText(charSequence) : new Notification.BigTextStyle().bigText(charSequence));
        return this;
    }

    @Override // q8.a
    public q8.a e(CharSequence charSequence) {
        this.f28372a.setContentText(charSequence);
        return this;
    }

    @Override // q8.a
    public q8.a f(long j10) {
        this.f28372a.setWhen(j10);
        this.f28372a.setShowWhen(true);
        return this;
    }

    @Override // q8.a
    public q8.a g(int i10) {
        this.f28372a.setSmallIcon(i10);
        if (i10 == -1) {
            this.f28372a.setSmallIcon(c.b(c9.a.b(), c9.a.a().d()));
        }
        return this;
    }

    @Override // q8.a
    public q8.a h(Bitmap bitmap) {
        if (bitmap != null) {
            this.f28372a.setLargeIcon(bitmap);
        }
        return this;
    }

    @Override // q8.a
    public q8.a i(CharSequence charSequence) {
        this.f28372a.setTicker(charSequence);
        return this;
    }

    @Override // q8.a
    public q8.a j(Integer num) {
        if (num != null) {
            this.f28372a.setColor(num.intValue());
        }
        return this;
    }

    @Override // q8.a
    public q8.a k(CharSequence charSequence) {
        this.f28372a.setContentTitle(charSequence);
        return this;
    }

    @Override // q8.a
    public q8.a l(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f28372a.addAction(new Notification.Action(i10, charSequence, pendingIntent));
        return this;
    }

    @Override // q8.a
    public q8.a setExtras(Bundle bundle) {
        this.f28372a.setExtras(bundle);
        return this;
    }
}
