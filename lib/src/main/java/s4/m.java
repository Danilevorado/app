package s4;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
public final class m extends x {
    private final l K;

    public m(Context context, Looper looper, GoogleApiClient.b bVar, GoogleApiClient.c cVar, String str, e4.e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.K = new l(context, this.J);
    }

    @Override // e4.c
    public final boolean W() {
        return true;
    }

    @Override // e4.c, com.google.android.gms.common.api.a.f
    public final void q() {
        synchronized (this.K) {
            if (a()) {
                try {
                    this.K.f();
                    this.K.g();
                } catch (Exception e5) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e5);
                }
                super.q();
            } else {
                super.q();
            }
        }
    }

    public final void q0(LocationRequest locationRequest, com.google.android.gms.common.api.internal.d dVar, g gVar) {
        synchronized (this.K) {
            this.K.c(locationRequest, dVar, gVar);
        }
    }

    public final void r0(d.a aVar, g gVar) {
        this.K.d(aVar, gVar);
    }

    public final Location s0(String str) {
        return i4.b.c(k(), v4.n.f27859c) ? this.K.a(str) : this.K.b();
    }
}
