package e4;

import android.content.Intent;

/* loaded from: classes.dex */
final class c0 extends d0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Intent f23105m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ d4.f f23106n;

    c0(Intent intent, d4.f fVar, int i10) {
        this.f23105m = intent;
        this.f23106n = fVar;
    }

    @Override // e4.d0
    public final void a() {
        Intent intent = this.f23105m;
        if (intent != null) {
            this.f23106n.startActivityForResult(intent, 2);
        }
    }
}
