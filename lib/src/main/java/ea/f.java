package ea;

import android.content.Context;
import com.pushwoosh.inapp.view.RichMediaWebActivity;

/* loaded from: classes2.dex */
class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23250a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23251b;

    f(Context context, String str) {
        this.f23250a = context;
        this.f23251b = str;
    }

    @Override // ea.d
    public void a(q9.b bVar) {
        if (bVar == null) {
            k9.h.v("[InApp]RichMediaLockScreenViewStrategy", "resource is empty");
            return;
        }
        k9.h.h("[InApp]RichMediaLockScreenViewStrategy", "presenting richMedia with code: " + bVar.l() + ", url: " + bVar.s());
        this.f23250a.startActivity(RichMediaWebActivity.o(this.f23250a, bVar, this.f23251b));
    }
}
