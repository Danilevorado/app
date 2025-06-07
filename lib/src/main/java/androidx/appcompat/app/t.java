package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class t {

    /* renamed from: d, reason: collision with root package name */
    private static t f616d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f617a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f618b;

    /* renamed from: c, reason: collision with root package name */
    private final a f619c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f620a;

        /* renamed from: b, reason: collision with root package name */
        long f621b;

        a() {
        }
    }

    t(Context context, LocationManager locationManager) {
        this.f617a = context;
        this.f618b = locationManager;
    }

    static t a(Context context) {
        if (f616d == null) {
            Context applicationContext = context.getApplicationContext();
            f616d = new t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f616d;
    }

    private Location b() {
        Location locationC = androidx.core.content.c.b(this.f617a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.c.b(this.f617a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f618b.isProviderEnabled(str)) {
                return this.f618b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e5) {
            Log.d("TwilightManager", "Failed to get last known location", e5);
            return null;
        }
    }

    private boolean e() {
        return this.f619c.f621b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f619c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        s sVarB = s.b();
        sVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        sVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = sVarB.f615c == 1;
        long j11 = sVarB.f614b;
        long j12 = sVarB.f613a;
        sVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = sVarB.f614b;
        if (j11 == -1 || j12 == -1) {
            j10 = 43200000 + jCurrentTimeMillis;
        } else {
            j10 = (jCurrentTimeMillis > j12 ? j13 + 0 : jCurrentTimeMillis > j11 ? j12 + 0 : j11 + 0) + 60000;
        }
        aVar.f620a = z10;
        aVar.f621b = j10;
    }

    boolean d() {
        a aVar = this.f619c;
        if (e()) {
            return aVar.f620a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f620a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
