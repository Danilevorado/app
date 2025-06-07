package g2;

import android.content.Context;
import g2.c;

/* loaded from: classes.dex */
final class e implements c {

    /* renamed from: m, reason: collision with root package name */
    private final Context f23793m;

    /* renamed from: n, reason: collision with root package name */
    final c.a f23794n;

    e(Context context, c.a aVar) {
        this.f23793m = context.getApplicationContext();
        this.f23794n = aVar;
    }

    private void i() {
        s.a(this.f23793m).d(this.f23794n);
    }

    private void j() {
        s.a(this.f23793m).e(this.f23794n);
    }

    @Override // g2.m
    public void onDestroy() {
    }

    @Override // g2.m
    public void onStart() {
        i();
    }

    @Override // g2.m
    public void onStop() {
        j();
    }
}
