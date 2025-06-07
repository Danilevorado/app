package e4;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class b0 extends d0 {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Intent f23073m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Activity f23074n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f23075o;

    b0(Intent intent, Activity activity, int i10) {
        this.f23073m = intent;
        this.f23074n = activity;
        this.f23075o = i10;
    }

    @Override // e4.d0
    public final void a() {
        Intent intent = this.f23073m;
        if (intent != null) {
            this.f23074n.startActivityForResult(intent, this.f23075o);
        }
    }
}
