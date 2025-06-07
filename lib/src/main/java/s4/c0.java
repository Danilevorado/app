package s4;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c0 implements v4.a {
    @Override // v4.a
    public final Location a(GoogleApiClient googleApiClient) {
        String str;
        m mVarA = v4.d.a(googleApiClient);
        Context contextG = googleApiClient.g();
        if (Build.VERSION.SDK_INT < 30 || contextG == null) {
            str = null;
        } else {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(contextG, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        try {
            return mVarA.s0(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // v4.a
    public final c4.c b(GoogleApiClient googleApiClient, v4.c cVar) {
        return googleApiClient.e(new z(this, googleApiClient, cVar));
    }

    @Override // v4.a
    public final c4.c c(GoogleApiClient googleApiClient, LocationRequest locationRequest, v4.c cVar) {
        e4.p.m(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.e(new y(this, googleApiClient, locationRequest, cVar));
    }
}
