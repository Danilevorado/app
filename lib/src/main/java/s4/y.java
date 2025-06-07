package s4;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class y extends a0 {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ LocationRequest f26912s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ v4.c f26913t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(c0 c0Var, GoogleApiClient googleApiClient, LocationRequest locationRequest, v4.c cVar) {
        super(googleApiClient);
        this.f26912s = locationRequest;
        this.f26913t = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* bridge */ /* synthetic */ void p(a.b bVar) {
        ((m) bVar).q0(this.f26912s, com.google.android.gms.common.api.internal.e.a(this.f26913t, u.a(), v4.c.class.getSimpleName()), new b0(this));
    }
}
