package ea;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.pushwoosh.inapp.view.RichMediaWebActivity;
import n7.l;

/* loaded from: classes2.dex */
class h implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23254a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23255b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f23256c = new Handler(Looper.getMainLooper());

    h(Context context, long j10) {
        this.f23254a = context;
        this.f23255b = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Intent intent) {
        this.f23254a.startActivity(intent);
    }

    @Override // ea.d
    public void a(q9.b bVar) {
        if (bVar == null) {
            k9.h.v("[InApp]RichMediaViewStrategy", "resource is empty");
            return;
        }
        l.i().t().n(bVar.l().substring(2));
        l.i().t().e(null);
        k9.h.h("[InApp]RichMediaViewStrategy", "presenting richMedia with code: " + bVar.l() + ", url: " + bVar.s());
        final Intent intentS = RichMediaWebActivity.s(this.f23254a, bVar);
        this.f23256c.postDelayed(new Runnable() { // from class: ea.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f23252m.c(intentS);
            }
        }, this.f23255b);
    }
}
