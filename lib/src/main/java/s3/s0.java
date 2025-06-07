package s3;

import android.util.Pair;
import com.google.android.gms.internal.ads.ma3;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
final class s0 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f26861a;

    s0(c cVar) {
        this.f26861a = cVar;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        j3.t.q().u(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        c cVar = this.f26861a;
        y.c(cVar.f26791y, cVar.f26783q, "sgf", new Pair("sgf_reason", th.getMessage()));
        ze0.e("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* synthetic */ void b(Object obj) {
        ze0.b("Initialized webview successfully for SDKCore.");
    }
}
