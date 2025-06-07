package q8;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;

/* loaded from: classes2.dex */
public interface a {
    a a(int i10);

    a b(int i10);

    Notification build();

    a c(String str);

    a d(Bitmap bitmap, CharSequence charSequence);

    a e(CharSequence charSequence);

    a f(long j10);

    a g(int i10);

    a h(Bitmap bitmap);

    a i(CharSequence charSequence);

    a j(Integer num);

    a k(CharSequence charSequence);

    a l(int i10, CharSequence charSequence, PendingIntent pendingIntent);

    a setExtras(Bundle bundle);
}
