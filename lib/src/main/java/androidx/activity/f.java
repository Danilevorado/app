package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.o;

/* loaded from: classes.dex */
public abstract class f extends Dialog implements n, k {

    /* renamed from: m, reason: collision with root package name */
    private o f367m;

    /* renamed from: n, reason: collision with root package name */
    private final OnBackPressedDispatcher f368n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i10) {
        super(context, i10);
        rb.h.e(context, "context");
        this.f368n = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.e
            @Override // java.lang.Runnable
            public final void run() {
                f.e(this.f366m);
            }
        });
    }

    private final o d() {
        o oVar = this.f367m;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(this);
        this.f367m = oVar2;
        return oVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(f fVar) {
        rb.h.e(fVar, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.activity.k
    public final OnBackPressedDispatcher b() {
        return this.f368n;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f368n.f();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f368n.g(getOnBackInvokedDispatcher());
        }
        d().h(j.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        d().h(j.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        d().h(j.b.ON_DESTROY);
        this.f367m = null;
        super.onStop();
    }

    @Override // androidx.lifecycle.n
    public final androidx.lifecycle.j s() {
        return d();
    }
}
