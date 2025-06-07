package v4;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import e4.p;
import s4.c0;
import s4.t;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f27851a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f27852b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f27853c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f27854d;

    /* renamed from: e, reason: collision with root package name */
    private static final a.g f27855e;

    /* renamed from: f, reason: collision with root package name */
    private static final a.AbstractC0091a f27856f;

    static {
        a.g gVar = new a.g();
        f27855e = gVar;
        l lVar = new l();
        f27856f = lVar;
        f27851a = new com.google.android.gms.common.api.a("LocationServices.API", lVar, gVar);
        f27852b = new c0();
        f27853c = new s4.d();
        f27854d = new t();
    }

    public static s4.m a(GoogleApiClient googleApiClient) {
        p.b(googleApiClient != null, "GoogleApiClient parameter is required.");
        s4.m mVar = (s4.m) googleApiClient.f(f27855e);
        p.p(mVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return mVar;
    }
}
