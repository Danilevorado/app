package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2021a = (IconCompat) aVar.v(remoteActionCompat.f2021a, 1);
        remoteActionCompat.f2022b = aVar.l(remoteActionCompat.f2022b, 2);
        remoteActionCompat.f2023c = aVar.l(remoteActionCompat.f2023c, 3);
        remoteActionCompat.f2024d = (PendingIntent) aVar.r(remoteActionCompat.f2024d, 4);
        remoteActionCompat.f2025e = aVar.h(remoteActionCompat.f2025e, 5);
        remoteActionCompat.f2026f = aVar.h(remoteActionCompat.f2026f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f2021a, 1);
        aVar.D(remoteActionCompat.f2022b, 2);
        aVar.D(remoteActionCompat.f2023c, 3);
        aVar.H(remoteActionCompat.f2024d, 4);
        aVar.z(remoteActionCompat.f2025e, 5);
        aVar.z(remoteActionCompat.f2026f, 6);
    }
}
