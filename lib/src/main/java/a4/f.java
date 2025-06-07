package a4;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class f extends q4.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(d dVar, Looper looper) {
        super(looper);
        this.f123a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d.d(this.f123a, message);
    }
}
