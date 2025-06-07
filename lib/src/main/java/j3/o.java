package j3;

import com.google.android.gms.internal.ads.ag;
import com.google.android.gms.internal.ads.bg;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f24488a;

    o(s sVar) {
        this.f24488a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        s sVar = this.f24488a;
        return new bg(ag.x(sVar.f24496m.f8252m, sVar.f24499p, false));
    }
}
