package com.onesignal;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.onesignal.e3;

/* loaded from: classes.dex */
abstract class a0 extends f0 {

    /* renamed from: j, reason: collision with root package name */
    private static FusedLocationProviderClient f21688j;

    /* renamed from: k, reason: collision with root package name */
    static c f21689k;

    class a implements OnFailureListener {
        a() {
        }
    }

    class b implements OnSuccessListener {
        b() {
        }
    }

    static class c extends LocationCallback {

        /* renamed from: a, reason: collision with root package name */
        private FusedLocationProviderClient f21690a;

        c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.f21690a = fusedLocationProviderClient;
            a();
        }

        private void a() {
            long j10 = e3.T0() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j10).setInterval(j10).setMaxWaitTime((long) (j10 * 1.5d)).setPriority(102);
            e3.a(e3.z.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.f21690a.requestLocationUpdates(priority, this, f0.h().getLooper());
        }
    }

    static void e() {
        synchronized (f0.f21978d) {
            f21688j = null;
        }
    }

    static void l() {
        synchronized (f0.f21978d) {
            e3.a(e3.z.DEBUG, "HMSLocationController onFocusChange!");
            if (f0.k() && f21688j == null) {
                return;
            }
            FusedLocationProviderClient fusedLocationProviderClient = f21688j;
            if (fusedLocationProviderClient != null) {
                c cVar = f21689k;
                if (cVar != null) {
                    fusedLocationProviderClient.removeLocationUpdates(cVar);
                }
                f21689k = new c(f21688j);
            }
        }
    }

    static void p() {
        q();
    }

    private static void q() {
        synchronized (f0.f21978d) {
            if (f21688j == null) {
                try {
                    f21688j = LocationServices.getFusedLocationProviderClient(f0.f21981g);
                } catch (Exception e5) {
                    e3.a(e3.z.ERROR, "Huawei LocationServices getFusedLocationProviderClient failed! " + e5);
                    e();
                    return;
                }
            }
            Location location = f0.f21982h;
            if (location != null) {
                f0.d(location);
            } else {
                f21688j.getLastLocation().addOnSuccessListener(new b()).addOnFailureListener(new a());
            }
        }
    }
}
