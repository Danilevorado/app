package b4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class m extends p4.l {

    /* renamed from: b, reason: collision with root package name */
    private final Context f4441b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f4442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f4442c = eVar;
        this.f4441b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        e eVar = this.f4442c;
        int i11 = eVar.i(this.f4441b);
        if (eVar.m(i11)) {
            this.f4442c.r(this.f4441b, i11);
        }
    }
}
