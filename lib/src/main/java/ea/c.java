package ea;

import android.content.Context;
import android.content.Intent;
import com.pushwoosh.inapp.view.RichMediaWebActivity;
import n7.l;

/* loaded from: classes2.dex */
class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private Context f23248a;

    c(Context context) {
        this.f23248a = context;
    }

    @Override // ea.d
    public void a(q9.b bVar) {
        if (bVar == null) {
            k9.h.v("InAppRequiredViewStrategy", "resource is empty");
            return;
        }
        l.i().t().e(bVar.l());
        l.i().t().n(null);
        this.f23248a.startActivity(new Intent(RichMediaWebActivity.n(this.f23248a, bVar)));
    }
}
