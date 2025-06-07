package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.onesignal.e3;

/* loaded from: classes.dex */
abstract class t extends f0 {

    /* renamed from: j, reason: collision with root package name */
    private static y f22424j;

    /* renamed from: k, reason: collision with root package name */
    static d f22425k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                Thread.sleep(t.s());
                e3.a(e3.z.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                f0.e();
                f0.m(f0.f21981g);
            } catch (InterruptedException unused) {
            }
        }
    }

    static class b {
        static Location a(GoogleApiClient googleApiClient) {
            synchronized (f0.f21978d) {
                if (!googleApiClient.i()) {
                    return null;
                }
                return v4.d.f27852b.a(googleApiClient);
            }
        }

        static void b(GoogleApiClient googleApiClient, LocationRequest locationRequest, v4.c cVar) {
            try {
                synchronized (f0.f21978d) {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (googleApiClient.i()) {
                        v4.d.f27852b.c(googleApiClient, locationRequest, cVar);
                    }
                }
            } catch (Throwable th) {
                e3.b(e3.z.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    private static class c implements GoogleApiClient.b, GoogleApiClient.c {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // d4.d
        public void C(int i10) {
            e3.a(e3.z.DEBUG, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i10);
            t.e();
        }

        @Override // d4.d
        public void L0(Bundle bundle) {
            synchronized (f0.f21978d) {
                if (t.f22424j != null && t.f22424j.c() != null) {
                    e3.z zVar = e3.z.DEBUG;
                    e3.a(zVar, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + f0.f21982h);
                    if (f0.f21982h == null) {
                        f0.f21982h = b.a(t.f22424j.c());
                        e3.a(zVar, "GMSLocationController GoogleApiClientListener lastLocation: " + f0.f21982h);
                        Location location = f0.f21982h;
                        if (location != null) {
                            f0.d(location);
                        }
                    }
                    t.f22425k = new d(t.f22424j.c());
                    return;
                }
                e3.a(e3.z.DEBUG, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
            }
        }

        @Override // d4.g
        public void w0(b4.b bVar) {
            e3.a(e3.z.DEBUG, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar);
            t.e();
        }
    }

    static class d implements v4.c {

        /* renamed from: a, reason: collision with root package name */
        private GoogleApiClient f22426a;

        d(GoogleApiClient googleApiClient) {
            this.f22426a = googleApiClient;
            b();
        }

        private void b() {
            long j10 = e3.T0() ? 270000L : 570000L;
            if (this.f22426a != null) {
                LocationRequest locationRequestZ = LocationRequest.f().v(j10).x(j10).y((long) (j10 * 1.5d)).z(102);
                e3.a(e3.z.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                b.b(this.f22426a, locationRequestZ, this);
            }
        }

        @Override // v4.c
        public void a(Location location) {
            e3.a(e3.z.DEBUG, "GMSLocationController onLocationChanged: " + location);
            f0.f21982h = location;
        }
    }

    static void e() {
        synchronized (f0.f21978d) {
            y yVar = f22424j;
            if (yVar != null) {
                yVar.b();
            }
            f22424j = null;
        }
    }

    static void l() {
        synchronized (f0.f21978d) {
            e3.a(e3.z.DEBUG, "GMSLocationController onFocusChange!");
            y yVar = f22424j;
            if (yVar != null && yVar.c().i()) {
                y yVar2 = f22424j;
                if (yVar2 != null) {
                    GoogleApiClient googleApiClientC = yVar2.c();
                    if (f22425k != null) {
                        v4.d.f27852b.b(googleApiClientC, f22425k);
                    }
                    f22425k = new d(googleApiClientC);
                }
            }
        }
    }

    static void p() {
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s() {
        return 30000;
    }

    private static void t() {
        Location location;
        if (f0.f21980f != null) {
            return;
        }
        synchronized (f0.f21978d) {
            u();
            if (f22424j == null || (location = f0.f21982h) == null) {
                c cVar = new c(null);
                y yVar = new y(new GoogleApiClient.a(f0.f21981g).a(v4.d.f27851a).b(cVar).c(cVar).e(f0.h().f21984m).d());
                f22424j = yVar;
                yVar.a();
            } else {
                f0.d(location);
            }
        }
    }

    private static void u() {
        Thread thread = new Thread(new a(), "OS_GMS_LOCATION_FALLBACK");
        f0.f21980f = thread;
        thread.start();
    }
}
